
public class ThroughExpr extends CuExpr{
	private CuExpr data1, data2;
	public ThroughExpr(CuExpr e1, CuExpr e2, Boolean low, Boolean up) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . through < > ( %s , %s , %s )", data1.toString(), data2.toString(), low, up);
	}
}
