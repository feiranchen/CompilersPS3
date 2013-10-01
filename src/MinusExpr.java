
public class MinusExpr extends CuExpr{
	private CuExpr data1, data2;
	public MinusExpr(CuExpr e1, CuExpr e2) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . minus < > ( %s )", data1.toString(), data2.toString());
	}
}
