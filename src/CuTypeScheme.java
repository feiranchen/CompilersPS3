import java.util.List;
import java.util.Map;


public abstract class CuTypeScheme {
	protected String text = "";
	@Override public String toString() {
		return text;
	}
}

class TypeScheme extends CuTypeScheme {
	List<String> data_kc;
	Map<CuVvc, CuType> data_tc;
	CuType         data_t;
	public TypeScheme(List<String> kc, Map<CuVvc, CuType> tc , CuType t){
		data_kc=kc;
		data_tc=tc;
		data_t=t;
		super.text=Helper.printList("<", data_kc, ">", ",")+" "+Helper.printMap("(", data_tc, ")", ",")+" : "+t.toString();
	}
}
