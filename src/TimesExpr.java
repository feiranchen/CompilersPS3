
public class TimesExpr extends CuExpr{
	private CuExpr e1, e2;
	public TimesExpr(CuExpr e1, CuExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
		super.text = String.format("%s . times < > ( %s )", e1.toString(), e2.toString());
	}
}
