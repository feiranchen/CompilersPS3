
public class NegateExpr extends CuExpr{
	private CuExpr data;
	public NegateExpr(CuExpr e) {
		data = e;
		super.text = String.format("%s . negate < > ( )", data.toString());
	}
}
