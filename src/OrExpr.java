
public class OrExpr extends CuExpr{
	private CuExpr data1, data2;
	public OrExpr(CuExpr e1, CuExpr e2) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . or < > ( %s )", data1.toString(), data2.toString());
	}
}
