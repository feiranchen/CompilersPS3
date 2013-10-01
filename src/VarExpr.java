import java.util.List;


public class VarExpr extends CuExpr{
	private CuExpr e;
	private String var;
	private List<CuType> pt;
	List<CuExpr> es;
	public VarExpr(CuExpr e, String var, List<CuType> pt, List<CuExpr> es) {
		this.e = e;
		this.var = var;
		this.pt = pt;
		this.es = es;
		super.text = String.format("%s . %s %s %s", e.toString(), var, 
				CuMethod.printList("<", pt, ">", ","), CuMethod.printList("(", es, ")", ","));
	}

}
