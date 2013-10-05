import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
	private CuVvc var;
	private CuExpr ee;
	Map<CuVvc,CuType> immut;
	public AssignStat (CuVvc t, CuExpr e, Map<CuVvc,CuType> immut) {
		var = t;
		ee = e;
		this.immut = immut;
		super.text = var.toString() + " := " + ee.toString() + " ;";
	}
	
	public Map<CuVvc,CuType> typeCheck(Map<CuVvc,CuType> mut) {	
		//check var is in immutable, type check fails
		if (immut.containsKey(var)) {
			throw new UnsupportedOperationException();
		}
		CuType exprType = ee.getType();
		mut.put(var, exprType);
		return mut;
	}
}

class ForStat extends CuStat{
	private CuVvc var;
	private CuExpr e;
	private CuStat s1;
	public ForStat(CuVvc v, CuExpr ee, CuStat ss) {
		var = v;
		e = ee;
		s1 = ss;
		super.text = "for ( " + var + " in " + e.toString() + " ) " + s1.toString();
	}
    public Map<CuVvc,CuType> typeCheck(Map<CuVvc,CuType> arg_mut) {
    	//check whether e is an iterable of tao
    	CuType eType = e.getType();
    	if (!(eType instanceof VClass) ) {
    		throw new UnsupportedOperationException();
    	}
    	//eType = (VClass)eType;
    	if (eType.data_s != "Iterable") {
    		throw new UnsupportedOperationException();
    	}
    	//my understanding is var can't appear in mutable variables
    	if (arg_mut.containsKey(var)) {
    		throw new UnsupportedOperationException();
    	}
    	//Should we check whether var is in immutble variables??????
    	CuType iter_type = eType.pt.get(0);
    	Map<CuVvc,CuType> mut_cpy = new HashMap<CuVvc,CuType>(arg_mut);
    	mut_cpy.put(var, iter_type);
    	s1.typeCheck(mut_cpy);
    	return arg_mut;
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
    	if (e.type != "Boolean") {
    		throw new UnsupportedOperationException();
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
		text = "{ " + Helper.listFlatten(al) + " }";
	}
	public Map<CuVvc,CuType> typeCheck(Map<CuVvc,CuType> mut) {	
		for (CuStat s : al) {
			mut = s.typeCheck(mut);
		}
		return mut;
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
    public Map<CuVvc,CuType> typeCheck(Map<CuVvc,CuType> arg_mut) {
    	//check whether e is boolean
    	if (e.type != "Boolean") {
    		throw new UnsupportedOperationException();
    	}
    	Map<CuVvc,CuType> mut_copy = new HashMap<CuVvc,CuType> (arg_mut);
    	Map<CuVvc,CuType> new_mut = s1.typeCheck(mut_copy);
    	Map<CuVvc,CuType> out_mut = new HashMap<CuVvc,CuType>();
    	for (CuVvc key : arg_mut.keySet() ) {
    		//this key must exist in new_mut
    		CuType t1 = arg_mut.get(key);
    		CuType t2 = new_mut.get(key);  
    		CuType tCom = t1.commonType(t2);
    		out_mut.put(key, tCom);
    	}
    	return out_mut;
    }
}
