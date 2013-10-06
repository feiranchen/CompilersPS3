import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
/*** wild type??? */
/** class declaration add type */

public abstract class CuType {
	private static HashSet<CuType> typeTable = new HashSet<CuType>();
	protected static CuType top = new Top();
	protected CuType parentType = top;
	protected Object val = ""; // value field of each type, e.g. Iter.val is HashSet<E>, Int.val is Integer
	protected String text = "";
	
	/** methods in its subtypes */
	public void addParent(CuType t) {parentType = t;} // append
	public boolean isString() {return false;}
	public boolean isCharacter() {return false;}
	public boolean isInteger() {return false;}
	public boolean isIterable() {return false;}
	public boolean isBoolean() {return false;}
	public boolean isTop() {return false;}
	public boolean isBottom() {return false;}
	public boolean isTypePara() {return false;}
	public boolean isClass() {return false;}
	public boolean isIntersect() { return false;}
	public boolean isInterface() {return false;}
//// equals and subtypeof
	public boolean equals(Object that) { return equals((CuType)that); }
	public boolean equals(CuType that) { return val.equals(that.val); }
	
	public boolean isSubtypeOf(CuType that) {
		if (that.isIntersect()) {
			VTypeInter t = (VTypeInter) that;
			return this.isSubtypeOf(t.t1) && this.isSubtypeOf(t.t2);
		}
		if (that.isTop()) return true;
		return this.parentType.equals(that); 
	}

	@Override public String toString() {
		return text;
	}

	public static boolean isValide(CuType c){
		return false;
	}
	public static boolean addType(CuType c) {
		return typeTable.add(c);
	}
}

class Iter extends CuType {
	public Iter() {
		super.val = new ArrayList<CuType>();
	}
	public void add (CuType m) {
		((List)val).add(m);
	}
	@Override public boolean isIterable() { return true;}
	@Override public String toString(){
		Helper.ToDo("how to print Iterable? Do we need to?");
		return "";
	}
}

class VClass extends CuType {
	Vc vc;
	List<CuType> types = new ArrayList<CuType>();
	
	public VClass(String s, List<CuType> pt){
		vc = new Vc(s);
		types.addAll(pt);
		super.text=vc.toString()+ " "+ Helper.printList("<", pt, ">", ",");
	}
	/* super type can only be class or interface or top */
	@Override public void addParent(CuType t) {
		if(t instanceof VClass) {
			super.appendSuperType(t);
		}
	}
	@Override public boolean isClass() {return true;}
	@Override public boolean isInterface() {return false;}
	@Override public boolean equals(CuType t) {
		if(t instanceof VClass) {
			return vc.text.equals(((VClass) t).text) && types.equals(((VClass) t).types);
		}
		return false;
	}
	@Override public boolean isSubtypeOf(CuType that) {
		if(that.isClass()) {
			VClass t = (VClass) that;
			if (! vc.equals(t.vc) || types.size() != t.types.size()) return false;
			for (int i = 0; i < types.size(); i++) {
				if (!types.get(i).equals(t.types.get(i))) return false;
			}
			return true;
		}
		return super.isSubtypeOf(that);
	}
}

class VTypeInter extends CuType {
	CuType t1, t2;
	public VTypeInter(CuType t1, CuType t2){
		this.t1=t1;
		this.t2=t2;
		super.text=t1.toString()+" \u222A "+t2.toString();
		super.subtypeOfTop();
		Helper.ToDo("should intersect be a type?");
		Helper.ToDo("val = ? calculate the type?");
	}
	@Override public boolean isIntersect() {return true;}
	@Override public boolean isSubtypeOf(CuType that) {
		return t1.isSubtypeOf(that) || t2.isSubtypeOf(that);
	}
}

class VTypePara extends CuType {
	public VTypePara(String s){
		super.val = s;
		super.text = s;
		super.subtypeOfTop();
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
class Str extends CuType {
	public Str(String s) {
		super.val = s;
		super.text = s;
	}
	@Override public boolean isString() { return true;}
}

class Int extends CuType {
	public Int(Integer i) { 
		super.val = i; 
		super.text = String.valueOf(i);
	}
	@Override public boolean isInteger() { return true;}
}

class Char extends CuType {
	public Char(Character i) {
		super.val = i;
		super.text = String.valueOf(i);
	}
	@Override public boolean isCharacter() { return true;}
}

class Bool extends CuType {
	Bool(Boolean v) {
		super.val = v;
		super.text = v.toString();
	}
	@Override public boolean isBoolean() { return true;}
}