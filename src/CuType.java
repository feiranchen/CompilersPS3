import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
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
	CuType(){
		changeParent(top);
	}

	/** methods in its subtypes */
	public void changeParents(List<CuType> t) {}
	public void changeParent(CuType t) {
		parentType = new ArrayList<CuType>();
		parentType.add(t);
	} // append
	public void add(CuType t) {}
	public boolean isTop() {return false;}
	public boolean isBottom() {return false;}
	public boolean isTypePara() {return false;}
	public boolean isClass() {return false;}
	public boolean isIntersect() { return false;}
	public boolean isInterface() {return false;}
	public boolean isIterable() {return false;}
	public boolean isString() {return false;}
	public boolean isCharacter() {return false;}
	public boolean isInteger() {return false;}
	public boolean isBoolean() {return false;}

	public CuType getArgument() throws NoSuchTypeException {
		throw new NoSuchTypeException();
	}
//// equals and subtypeof
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
	// find all the super types of n, including itself
	private static List<CuType> superTypeList(CuType n, List<CuType> l) {
		l.add(n);
		if (n.isTop()) { return l;}
		for (CuType p : n.parentType) {
			superTypeList(p, l);
		}
		return l;
	}
	
	@Override public String toString() {
		return text;
	}
}

class Iter extends VClass {
	public Iter(CuType arg) {
		super(CuVvc.ITERABLE, new ArrayList<CuType> ());
		super.type = arg;
		super.text=val.toString()+ " <" + arg.toString()+">";
		Helper.ToDo("type check Iterable?");
	}
	@Override public boolean isIterable() {return true;}
	@Override public CuType getArgument() throws NoSuchTypeException {
		return type;
	}
}
class VClass extends CuType {
	List<CuType> types = new ArrayList<CuType>();
	CuType type = bottom; // for Iterable<E>
	public VClass(String s, List<CuType> pt){
		val = new Vc(s);
		types.addAll(pt);
		super.text=val.toString()+ " "+ Helper.printList("<", pt, ">", ",");
	}
	@Override public boolean isClass() {return true;}
	@Override public boolean isInterface() {return false;}
	@Override public boolean equals(CuType that) {
		if(that.isClass()) {
			VClass t = (VClass) that;
			return val.equals(t.val) && types.containsAll(t.types) && t.types.contains(types)&& type.equals(((VClass) t).type);
		}
		return false;
	}
}
class Bool extends VClass {
	public Bool() {
		super(CuVvc.BOOLEAN, new ArrayList<CuType> ());
	}
	@Override public boolean isBoolean() {return true;}
}
class Int extends VClass {
	public Int() {
		super(CuVvc.INTEGER, new ArrayList<CuType> ());
	}
	@Override public boolean isInteger() {return true;}
}
class Char extends VClass {
	public Char() {
		super(CuVvc.CHARACTER, new ArrayList<CuType> ());
	}
	@Override public boolean isCharacter() {return true;}
}
class Str extends VClass {
	public Str() {
		super(CuVvc.STRING, new ArrayList<CuType> ());
	}
	@Override public boolean isString() {return true;}
}
class VTypeInter extends CuType {
	List<CuType> parents = new ArrayList<CuType>();
	public VTypeInter(CuType t1){
		parents.add(t1);
		super.text=t1.toString();
	}
	@Override public void add(CuType t) {
		parents.add(t);
		super.text += " \u222A "+t.toString();
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

class Top extends CuType{
	Top() {
		super.val = "Thing";
		super.text = "Thing";
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