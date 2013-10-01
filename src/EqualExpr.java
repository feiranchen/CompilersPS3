
public class EqualExpr extends CuExpr{
	private CuExpr data1, data2;
	public EqualExpr(CuExpr e1, CuExpr e2, Boolean eq) {
		data1 = e1;
		data2 = e2;
		if (eq) super.text = String.format("%s . equals < > ( %s )", data1.toString(), data2.toString());
		else super.text = String.format("%s . equals < > ( %s ) . negate ( )", data1.toString(), data2.toString());
	}
}
