import java.util.ArrayList;
import java.util.List;
/*** wild type??? */
/** class declaration add type */

public abstract class CuType {
	protected static CuType top = new Top();
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
	public CuType getFirstArgument() throws NoSuchTypeException {
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
		return null;
	}
	
	@Override public String toString() {
		return text;
	}
}

class VClass extends CuType {
	List<CuType> types = new ArrayList<CuType>();
	
	public VClass(String s, List<CuType> pt){
		val = new Vc(s);
		types.addAll(pt);
		super.text=val.toString()+ " "+ Helper.printList("<", pt, ">", ",");
	}
	@Override public boolean isClass() {return true;}
	@Override public boolean isInterface() {return false;}
	@Override public boolean equals(CuType t) {
		if(t instanceof VClass) {
			return val.equals(t.val) && types.equals(((VClass) t).types);
		}
		return false;
	}
	@Override public CuType getFirstArgument() throws NoSuchTypeException {
		return types.get(0);
	}
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