import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*** wild type??? */
/** class declaration add type */

public abstract class CuType {
	protected static CuType top = new Top();
	protected static CuType bottom = new Bottom();
	protected static CuType bool = new Bool();
	protected static CuType integer = new Int();
	protected static CuType character = new Char();
	protected static CuType string = new Str();
	protected List<CuType> parentType;
	protected Object val = ""; // value field of each type, e.g. Iter.val is HashSet<E>, Int.val is Integer
	protected String text = "";

	CuType(){ changeParent(top); }

	/** methods in its subtypes */
	public void changeParents(List<CuType> t) {}
	public void changeParent(CuType t) {
		parentType = new ArrayList<CuType>();
		parentType.add(t);
	} // append
	public boolean isTop() {return false;}
	public boolean isBottom() {return false;}
	public boolean isTypePara() {return false;}
	public boolean isClassOrInterface() {return false;}
	public boolean isIntersect() { return false;}
	public boolean isInterface() {return false;}
	public boolean isIterable() {return false;}
	public boolean isString() {return false;}
	public boolean isCharacter() {return false;}
	public boolean isInteger() {return false;}
	public boolean isBoolean() {return false;}

	public void add(CuType t) {}
	public CuType getArgument() throws NoSuchTypeException {
		throw new NoSuchTypeException();
	}
	public boolean plugIn(List<CuType> t) { return false;}
	public boolean plugIn(Map<VTypePara, CuType> t) {return false;}
	
	// Hierarchy of types
	public boolean equals(Object that) { return equals((CuType)that); }
	public boolean equals(CuType that) { return val.equals(that.val); }
	public boolean isSubtypeOf(CuType that) {
		if (this.equals(that)) return true;
		for (CuType p : this.parentType) {
			if (p.isSubtypeOf(that)) return true;
		}
		return false;
	}
	public static CuType commonParent(CuType t1, CuType t2) {
		if (t1 == null) return t2;
		if (t2 == null) return t1;
		List<CuType> parent1 = superTypeList(t1, new ArrayList<CuType>());
		List<CuType> parent2 = superTypeList(t2, new ArrayList<CuType>());
		for (CuType p : parent1) {
			if (parent2.contains(p)) return p;
		}
		return top;
	}
	public CuType calculateType(CuContext context){throw new NoSuchTypeException();};
	// find all the super types of n, including itself
	private static List<CuType> superTypeList(CuType n, List<CuType> l) {
		l.add(n);
		if (n.isTop()) { return l;}
		for (CuType p : n.parentType) {
			superTypeList(p, l);
		}
		return l;
	}
	
	@Override public String toString() { return text;}
}
/** determine whether an interface: isInterface() == true
 * determine is a class but not interface isClassOrInterface() && !isInterface()
 * determine is a class or an interface: isClassOrInterface()
 */
class VClass extends CuType {
	protected Map<VTypePara, CuType> map = new LinkedHashMap<VTypePara, CuType>();// plugin generic types
	protected CuType type = bottom; // for Iterable<>
	protected boolean isInterface = false;
	public VClass(String s, List<CuType> pt, Boolean intf){
		val = new Vc(s);
		for (CuType t: pt) {
			if (t.isTypePara()) {
				map.put((VTypePara)t, CuType.bottom);
			}else { // type in argument must be type parameter
				throw new NoSuchTypeException();
			}
		}
		isInterface = intf;
		super.text=val.toString()+ " "+ Helper.printList("<", pt, ">", ",");
	}
	@Override public CuType calculateType(CuContext context) {
		if (this.isInterface()) return CuType.top;
		else return this;
	}
	/* instantiate this class */
	@Override public boolean plugIn(List<CuType> t) {
		if(map.size() != t.size()) {return false;}
		int i = 0;
		for (Entry<VTypePara, CuType> k : map.entrySet()) {
			if(t.get(i).isTypePara()) {
				throw new NoSuchTypeException();
			}
			k.setValue(t.get(i));
			i++;
		}
		return true;
	}
	@Override public boolean plugIn(Map<VTypePara, CuType> t) {
		for (Entry<VTypePara, CuType> p : t.entrySet()) {
			VTypePara k = p.getKey();
			if (!map.containsKey(k)) {
				throw new NoSuchTypeException();
			}
			map.put(k, p.getValue());
		}
		return true;
	}
	@Override public boolean isClassOrInterface() {return true;}
	@Override public boolean isInterface() {return isInterface;}
	@Override public boolean isSubtypeOf(CuType that) {
		if (this.equalsInstance(that)) return true;
		for (CuType p : this.parentType) {
			if (this.isClassOrInterface()) {
				p.plugIn(((VClass) this).map);
			}
			if (p.isSubtypeOf(that)) return true;
		}
		return false;
	}
	@Override public boolean equals(CuType that) {
		if(that.isClassOrInterface()) {
			VClass t = (VClass) that;
			Set<VTypePara> tp1 = this.map.keySet();
			Set<VTypePara> tp2 = t.map.keySet();
			return val.equals(t.val) && tp1.equals(tp2)
					&& type.equals(((VClass) t).type);// for Iterable
		}
		return false;
	}
	private boolean equalsInstance(CuType t) {
		return equals(t) && map.equals(((VClass)t).map); // for generic plug in
	}
}
class VTypeInter extends CuType {
	List<CuType> parents = new ArrayList<CuType>();
	public VTypeInter(CuType t1){
		parents.add(t1);
		super.text=t1.toString();
	}
	@Override public void add(CuType t) {
		// A&B&C, only the first could be a class
		if (!t.isInterface()) throw new NoSuchTypeException();
		Helper.ToDo("How to type check? handle exception?");
		parents.add(t);
		super.text += " \u222A "+t.toString();
	}
	@Override public CuType calculateType(CuContext context) {
		/* type checking */
		Helper.ToDo("v<tao1, tao2> == v<tao3, tao4>");
		Helper.ToDo("check context, method has same typescheme");
		return parents.get(0).calculateType(context);
	}
	@Override public boolean isIntersect() {return true;}
	@Override public void changeParents(List<CuType> t) {
		super.parentType = parents;
	}
	@Override public boolean equals(CuType that) {
		if (that.isIntersect()) {
			VTypeInter t = (VTypeInter) that;
			Helper.ToDo("list or set?");
			return parents.equals(t.parents);
		}
		return false;
	}
}

class VTypePara extends CuType {
	public VTypePara(String s){
		super.val = s;
		super.text = s;
	}
	@Override public boolean isTypePara() {return true;}
}
class Iter extends VClass {
	public Iter(CuType arg) {
		super(CuVvc.ITERABLE, new ArrayList<CuType> (), false);
		super.type = arg;
		super.text=val.toString()+ " <" + arg.toString()+">";
		// set its parent types
		List<CuType> parents = new ArrayList<CuType>();
		for (CuType t : arg.parentType) {
			parents.add(new Iter(t));
		}
		super.changeParents(parents);
		Helper.ToDo("type check Iterable?");
	}
	@Override public boolean isIterable() {return true;}
	@Override public CuType getArgument() throws NoSuchTypeException {
		return type;
	}
}
class Bool extends VClass {
	public Bool() {
		super(CuVvc.BOOLEAN, new ArrayList<CuType> (), false);
	}
	@Override public boolean isBoolean() {return true;}
}
class Int extends VClass {
	public Int() {
		super(CuVvc.INTEGER, new ArrayList<CuType> (), false);
	}
	@Override public boolean isInteger() {return true;}
}
class Char extends VClass {
	public Char() {
		super(CuVvc.CHARACTER, new ArrayList<CuType> (), false);
	}
	@Override public boolean isCharacter() {return true;}
}
class Str extends VClass {
	public Str() {
		super(CuVvc.STRING, new ArrayList<CuType> (), false);
	}
	@Override public boolean isString() {return true;}
}
class Top extends CuType{
	Top() {
		super.val = "Thing";
		super.text = "Thing";
	}
	@Override public CuType calculateType(CuContext context) {
		return this;
	}
	@Override public boolean isTop() {return true;}
}
class Bottom extends CuType {
	public Bottom(){
		super.val= "Nothing";
		super.text= "Nothing";
	}
	@Override public boolean isBottom() {return true;}
	@Override public boolean isSubtypeOf(CuType t) {return true;}
}