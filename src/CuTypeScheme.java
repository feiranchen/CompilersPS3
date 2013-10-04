import java.util.List;


public abstract class CuTypeScheme {
	protected String text = "";
	@Override public String toString() {
		return text;
	}
}

class TypeScheme extends CuTypeScheme {
	List<String> data_kc;
	List<CuVvt>    data_tc;
	CuType         data_t;
	public TypeScheme(List<String> kc, List<CuVvt> tc , CuType t){
		data_kc=kc;
		data_tc=tc;
		data_t=t;
		super.text=CuMethod.printList("<", data_kc, ">", ",")+" "+CuMethod.printList("(", data_tc, ")", ",")+" : "+t.toString();
	}
}
