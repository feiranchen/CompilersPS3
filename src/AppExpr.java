
public class AppExpr extends CuExpr {
	CuExpr e1;
	CuExpr e2;
	public AppExpr(CuExpr e1, CuExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
		super.text = e1.toString() + " ++ " + e2.toString();
	}
}
