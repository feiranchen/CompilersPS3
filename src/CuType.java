import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

/** class declaration add type */
public abstract class CuType {
	protected static CuType top = new Top();
	protected static CuType bottom = new Bottom();
	protected static CuType bool = new Bool();
	protected static CuType integer = new Int();
	protected static CuType character = new Char();
	protected static CuType string = new Str();
	protected List<CuType> parentType;
	protected String id;
	protected String text = "";
	protected Map<VTypePara, CuType> map = new LinkedHashMap<VTypePara, CuType>();// plugin generic types
	protected CuType type = bottom; // for Iterable<>

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
	public Map<VTypePara, CuType> plugIn(List<CuType> t) { return map;}
	public Map<VTypePara, CuType> plugIn(Map<VTypePara, CuType> t) {return map;}
	
	// Hierarchy of types
	public boolean equals(Object that) { return equals((CuType)that); }
	abstract public boolean equals(CuType that);
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
		List<CuType> parent1 = superTypeList(t1);
		List<CuType> parent2 = superTypeList(t2);
		for (CuType p : parent1) {
			if (parent2.contains(p)) return p;
		}
		return top;
	}
	public CuType calculateType(CuContext context) throws NoSuchTypeException { return null;}
	// find all the super types of n, including itself
	public static List<CuType> superTypeList(CuType n) {
		Queue<CuType> l = new LinkedList<CuType>();
		l.add(n);
		List<CuType> p = new ArrayList<CuType>();
		while (!l.isEmpty()) {
			CuType t = l.poll();
			p.add(t);
			for (CuType x : t.parentType) {
				if (!x.isTop() && !p.contains(x)) {
					l.add(x);
				}
			}
		}
		if (!p.contains(top)) p.add(top);
		return p;
	}
	
	@Override public String toString() { return text;}
}
/** determine whether an interface: isInterface() == true
 * determine is a class but not interface isClassOrInterface() && !isInterface()
 * determine is a class or an interface: isClassOrInterface()
 */
class VClass extends CuType {
	protected boolean isInterface = false;
	public VClass(String s, List<CuType> pt, Boolean intf){
		super.id = s;
		for (CuType t: pt) {
			if (t.isTypePara()) {
				map.put((VTypePara)t, CuType.bottom);
			}else { // type in argument must be type parameter
				throw new NoSuchTypeException();
			}
		}
		isInterface = intf;
		super.text=super.id+ " "+ Helper.printList("<", pt, ">", ",");
	}
	@Override public CuType calculateType(CuContext context) {
		if (this.isInterface()) return CuType.top;
		else return this;
	}
	/* instantiate this class, strict plug in */
	@Override public Map<VTypePara, CuType> plugIn(List<CuType> t) {
		if(map.size() != t.size()) {throw new NoSuchTypeException();}
		int i = 0;
		for (Entry<VTypePara, CuType> k : map.entrySet()) {
			if(t.get(i).isTypePara()) {
				throw new NoSuchTypeException();
			}
			k.setValue(t.get(i));
			i++;
		}
		return this.map;
	}
	@Override public Map<VTypePara, CuType> plugIn(Map<VTypePara, CuType> t) {
		for (Entry<VTypePara, CuType> p : t.entrySet()) {
			VTypePara k = p.getKey();
			if (map.containsKey(k)) {
				map.put(k, p.getValue());// only plugin valid keys
			}
		}
		return this.map;
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
			return super.id.equals(t.id) && tp1.equals(tp2);
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
	@Override public CuType calculateType(CuContext context) throws NoSuchTypeException {
		/* type checking */
		Helper.ToDo("v<tao1, tao2> == v<tao3, tao4>");
		for(int i = 0; i+1 < parents.size(); i++) {
			Helper.ToDo("requires function map id->typescheme");
			Map<String, CuTypeScheme> f1 = context.getFunction(parents.get(i).id).getFuncMap();
			Map<String, CuTypeScheme> f2 = context.getFunction(parents.get(i+1).id).getFuncMap();
			Helper.ToDo("requires CuTypeScheme.equals()");
			for (Entry<String, CuTypeScheme> f : f1.entrySet()) {
				if(f2.containsKey(f.getKey()) && !f2.get(f.getKey()).equals(f.getValue())) {
					throw new NoSuchTypeException(); // v:sigma , v:sigma' are not the same
				}
			}
		}
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
			return parents.containsAll(t.parents) && t.parents.containsAll(parents);
		}
		return false;
	}
}


class VTypePara extends CuType {
	public VTypePara(String s){
		super.id = s;
		super.text = s;
	}
	@Override public boolean isTypePara() {return true;}
	@Override public boolean equals(CuType that) {
		return that.isTypePara() && super.id.equals(that.id);
	}
	public CuType calculateType(CuContext context) throws NoSuchTypeException {
		if (!context.hasVTypePara(super.id)){
			throw new NoSuchTypeException();
		}
		return null;
	}
}


class Iter extends VClass {
	public Iter(CuType arg) {
		super(CuVvc.ITERABLE, new ArrayList<CuType> (), false); // id is "Iterable"
		super.type = arg;
		super.text=super.id+ " <" + arg.toString()+">";
		// set its parent types
		List<CuType> parents = new ArrayList<CuType>();
		for (CuType t : arg.parentType) {
			parents.add(new Iter(t));
		}
		super.changeParents(parents);
		Helper.ToDo("type check Iterable?");
	}
	@Override public boolean isIterable() {return true;}
	@Override public boolean equals(CuType that) {
		return that.isIterable() && ((VClass)that).type.equals(this.type);
	}
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
		super.id = CuVvc.TOP;
		super.text = "Thing";
	}
	@Override public CuType calculateType(CuContext context) { return this;}
	@Override public boolean isTop() {return true;}
	@Override public boolean equals(CuType that) { return that.isTop();}
}
class Bottom extends CuType {
	public Bottom(){
		super.id = CuVvc.BOTTOM;
		super.text= "Nothing";
	}
	@Override public boolean isBottom() {return true;}
	@Override public boolean isSubtypeOf(CuType t) {return true;}
	@Override public boolean equals(CuType that) { return that.isBottom();}
}