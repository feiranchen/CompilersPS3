import java.util.List;

public class VClass extends CuType {
	String data_s;
	List<CuType> pt;
	public VClass(String s, List<CuType> pt){
		data_s=s;
		this.pt = pt;
		super.text=data_s+ " "+ CuMethod.printList("<", pt, ">", ",");
	}
}