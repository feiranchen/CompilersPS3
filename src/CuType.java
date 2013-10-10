import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;


public abstract class CuType {
	protected String text = "";
	public String data_s;
	public List<CuType> pt=new ArrayList<CuType>();
	@Override public String toString() {
		return text;
	}
	public CuType commonType(CuType t2) {
// TODO Auto-generated method stub
		return null;
	}
	
	
	//public boolean equals(Object that) { return equals((CuType)that); }
	//public boolean equals(CuType that) { return this == that; }
	//public boolean isSubtypeOf(CuType that) { return equals(that); }
/*
	private static CuType mBoolean = new VBoolean();
	public static CuType getBool() { return mBoolean; }
	private static CuType mInteger = new VInteger();
	public static CuType getInt() { return mInteger; }
	private static CuType mCharacter = new VCharacter();
	public static CuType getCharacter() { return mCharacter; }
	private static CuType mString = new VString();
	public static CuType getString() { return mString; }
	private static Map<List<CuType>,CuType> mIterable = new IdentityHashMap<List<CuType>,CuType>();
	public static CuType getIterable(List<CuType> elemType) {
		CuType iter = mIterable.get(elemType);
		if (iter == null) {
			iter = new VIterable(elemType);
			mIterable.put(elemType, iter);
		}
		return iter;
	}
	*/

	
	public boolean isBoolean() { return false; }
	public boolean isInteger() { return false; }
	public boolean isCharacter() { return false; }
	public boolean isString() { return false; }
	public boolean isIterable() { return false; }
	
}

class VClass extends CuType {
	CuClass classData;
	public VClass(String s, List<CuType> pt, CuClass referClass){
		super.data_s=s;
		super.pt = pt;
		classData=referClass;
		super.text=data_s+ " "+ Helper.printList("<", pt, ">", ",");
	}
}

class VTopBot extends CuType {
	//String data_s;
	public VTopBot(String s){
		super.data_s=s;
		super.text=s;
	}
}

class VTypeInter extends CuType {
	CuType data_t1, data_t2;
	public VTypeInter(CuType t1, CuType t2){
		data_t1=t1;
		data_t2=t2;
		super.text=t1.toString()+" \u222A "+t2.toString();
	}

}

class VTypePara extends CuType {
	//String data_s;
	public VTypePara(String s){
		super.data_s=s;
		super.text=s;
	}
}

