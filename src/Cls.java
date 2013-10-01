import java.util.ArrayList;
import java.util.List;

// CLASS CLSINTF pk=kindcontext pt=typecontext {$c = new Cls($CLSINTF.text, $pk.kc, $pt.tc);} 
// (EXTENDS t=type {$c.add($t.t);} LBRACE (s=stat {$c.add($s.s);})* (SUPER LPAREN ex=exprs RPAREN SEMICOLON {$c.add($ex.cu);})? (FUN v=vv ts=typescheme s=stat {$c.add($v.v, $ts.ts, $s.s);})* RBRACE)?;
public class Cls extends CuClass {
	//we need its superType for subtyping
	CuType superType;
	//class name
	String clsintf;
	//kind context theta
	List<String> kc;
	//type context gamma
	List<CuVvt> tc;
	//function context for method lookup, we don't need the following 
	//statement for this purpose
	FuncTxt functxt;
	
	List<CuStat> ss = new ArrayList<CuStat>();
	List<CuExpr> es;
	List<String> fun = new ArrayList<String>();
	
	
	public Cls(String clsintf, List<String> kc, List<CuVvt> tc) {
		this.clsintf = clsintf;
		this.kc = kc;
		this.tc = tc;
	}
	@Override public void add (CuType t) {
		superType = t;
	}
	
	@Override public void add (CuStat s) {
		ss.add(s);
	}
	
	@Override public void add (List<CuExpr> s) {
		es = s;
	}
	
	@Override public void add(CuVvc v, CuTypeScheme ts, CuStat s) {
		functxt.add(v, ts);
		String t = String.format("fun %s %s %s", v, ts.toString(), s.toString());
		fun.add(t);
	}
	
	@Override public String toString() {
		return String.format("class %s %s %s extends %s { %s super ( %s ) ; %s }", 
				clsintf, CuMethod.printList("<", kc, ">", ","), CuMethod.printList("(", tc, ")", ","), superType.toString(), 
				CuMethod.printList("", ss, "", ""), CuMethod.printList("(", es, ")", ","), CuMethod.printList("", fun, "", ""));
	}
}
