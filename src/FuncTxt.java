import java.util.ArrayList;
import java.util.List;

// {$f = new FunCtxt();} (COMMA v=vvc ts=typescheme {$f.add($v.v, $ts.ts);})*;
public class FuncTxt extends CuFunC {
	public List<CuVvc> v = new ArrayList<CuVvc>();
	public List<CuTypeScheme> ts = new ArrayList<CuTypeScheme>();
	
	public FuncTxt() {
	}
	
	@Override public void add(CuVvc v, CuTypeScheme ts) {
		this.v.add(v);
		this.ts.add(ts);
		super.text += String.format(" , %s %s", v.toString(), ts.toString());
	}
}
