
public class DivideExpr extends CuExpr{
	private CuExpr data1, data2;
	public DivideExpr(CuExpr e1, CuExpr e2) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . divide < > ( %s )", data1.toString(), data2.toString());
	}
}
