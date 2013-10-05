import java.util.ArrayList;
import java.util.List;


public abstract class CuProgr {
	protected String text = "";
	@Override public String toString() {
		return text;
	}
	public void add (String var, CuTypeScheme ts, CuStat s){}
	public void add (CuProgr p){}
	public void add(List<CuStat> cu, CuProgr p) {}
	public void add(CuStat s) {}
	public void add(CuVvc var, CuTypeScheme ts, CuStat s) {}
}

class ClassPrg extends CuProgr {
	CuClass c; 
	CuProgr p;
	public ClassPrg (CuClass c, CuProgr p) {
		this.c = c;
		this.p = p;
		super.text = c.toString() + " " + p.toString();
	}
}

class FunPrg extends CuProgr {
	List<String> fun = new ArrayList<String>(); // need to change
	CuProgr p;
	
	public FunPrg(CuVvc var, CuTypeScheme ts, CuStat s) {
		String t = String.format("fun %s %s %s", var.toString(), ts.toString(), s.toString());
		fun.add(t);
	}
	
	@Override public void add (CuVvc var, CuTypeScheme ts, CuStat s) {
		String t = String.format("fun %s %s %s", var.toString(), ts.toString(), s.toString());
		fun.add(t);
	}
	@Override public void add (CuProgr p) {
		this.p = p;
	}
	
	@Override public String toString() {
		return Helper.printList("", fun, "", "") + " " + p.toString();
	}
}

class StatPrg extends CuProgr {
	CuStat s;
	public StatPrg(CuStat s) {
		this.s = s;
		super.text = s.toString();
	}
	
	@Override public void add(List<CuStat> cu, CuProgr p) {
		text += Helper.listFlatten(cu) + " "+ p.toString();
	}
}