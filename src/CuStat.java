import java.util.ArrayList;
import java.util.List;


public abstract class CuStat {
	protected String text = "";
	@Override public String toString() {
		return text;
	}
	public void add (CuStat st){}
	public Map<CuVvc,CuType> typeCheck(Map<CuVvc,CuType> mut) {
		return null;
	}
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
    
    //input is the mutable type context
    //output is the new mutable type context
    public Map<CuVvc,CuType> typeCheck(Map<CuVvc,CuType> arg_mut) {
    	//check whether e is boolean
    	if (!e.isBool()) {
    		throw new Exception();
    	}
    	Map<CuVvc,CuType> mut_cpy1 = new HashMap<CuVvc,CuType>(arg_mut);
    	Map<CuVvc,CuType> mut_cpy2 = new HashMap<CuVvc,CuType>(arg_mut);
    	Map<CuVvc,CuType> mut1 = s1.typeCheck(mut_cpy1);
    	Map<CuVvc,CuType> mut2 = s2.typeCheck(mut_cpy2);
    	Map<CuVvc,CuType> outMut = new HashMap<CuVvc, CuType>();
    	for (CuVvc key : mut1.keySet() ) {
    		CuType t1;
    		CuType t2 = mut2.get(key);
    		//lowest common Type
    		CuType tCom;
    		//if we didn't find this var in the second map, it is simply discarded
    		if (t2 != null){
    			t1 = mut1.get(key);
    			//get the lowest common type
    			tCom = t1.commonType(t2);
    			outMut.put(key, tCom);
    		}
    	}
    	//change the global mutable type context?
    	mut = outMut;
    	return outMut;
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
