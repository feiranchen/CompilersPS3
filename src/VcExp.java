import java.util.List;

public class VcExp extends CuExpr {
	private String data_v; 
	private List<CuType> data_pt;
	private List<CuExpr> data_es;
	public VcExp(String v, List<CuType> pt, List<CuExpr> es){
		this.data_v=v;
		this.data_pt=pt;
		this.data_es=es;
		
		super.text=v.toString()+CuMethod.printList("<", pt, ">", ",")+CuMethod.printList("(", es, ")", ",");
	}
}
