import java.util.List;


public abstract class CuType {
	protected String text = "";
	public String data_s;
	public List<CuType> pt;
	@Override public String toString() {
		return text;
	}
	public CuType commonType(CuType t2) {
// TODO Auto-generated method stub
		return null;
	}
}

class VClass extends CuType {
	//String data_s;
	//List<CuType> pt;
	public VClass(String s, List<CuType> pt){
		super.data_s=s;
		super.pt = pt;
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
