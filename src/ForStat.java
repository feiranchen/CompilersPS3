
public class ForStat extends CuStat{
	private String var;
	private CuExpr e;
	private CuStat s1;
	public ForStat(String v, CuExpr ee, CuStat ss) {
		var = v;
		e = ee;
		s1 = ss;
		super.text = "for ( " + var + " in " + e.toString() + " ) " + s1.toString();
	}
}
