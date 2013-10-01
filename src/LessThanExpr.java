
public class LessThanExpr extends CuExpr{
	private CuExpr data1, data2;
	public LessThanExpr(CuExpr e1, CuExpr e2, Boolean strict) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . lessThan < > ( %s , %s )", data1.toString(), data2.toString(), strict);
	}
}
