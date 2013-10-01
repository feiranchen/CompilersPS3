
public class OnwardsExpr extends CuExpr{
	private CuExpr data;
	public OnwardsExpr(CuExpr e, Boolean inclusiveness) {
		data = e;
		super.text = String.format("%s . onwards < > ( %s )", data.toString(), inclusiveness);
	}
}
