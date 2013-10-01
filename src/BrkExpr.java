import java.util.List;

public class BrkExpr extends CuExpr {
	private List<CuExpr> data_es;
	public BrkExpr(List<CuExpr> es){
		data_es = es;
		super.text=CuMethod.printList("[", data_es, "]", ",");
	}
}
