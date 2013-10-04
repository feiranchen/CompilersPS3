import java.util.ArrayList;
import java.util.List;


public abstract class CuStat {
	protected String text = "";
	@Override public String toString() {
		return text;
	}
	public void add (CuStat st){}
}

class AssignStat extends CuStat{
	private String var;
	private CuExpr ee;
	public AssignStat (String t, CuExpr e) {
		var = t;
		ee = e;
		super.text = var + " := " + ee.toString() + " ;";
	}
}

class ForStat extends CuStat{
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

class IfStat extends CuStat{
	private CuExpr e;
	private CuStat s1;
	private CuStat s2;
	public IfStat (CuExpr ex, CuStat st) {
		this.e = ex;
		this.s1 = st;
		super.text = "if ( " + e.toString() + " ) " + s1.toString();
	}

    @Override public void add (CuStat st) {
    	s2 = st;
    	super.text += " else " + s2.toString();
    }
}

class ReturnStat extends CuStat{
	private CuExpr e;
	public ReturnStat (CuExpr ee) {
		e = ee;
		super.text = "return " + e.toString() + " ;";
	}
}

class Stats extends CuStat{
	protected ArrayList<CuStat> al;
	public Stats (List<CuStat> cu) {
		al = (ArrayList<CuStat>) cu;
		text = "{ " + CuMethod.listFlatten(al) + " }";
	}
}

class WhileStat extends CuStat{
	private CuExpr e;
	private CuStat s1;
	public WhileStat (CuExpr ex, CuStat st){
		e = ex;
		s1 = st;
		text = "while ( " + e.toString() + " ) " + s1.toString();
	}
}
