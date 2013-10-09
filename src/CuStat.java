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
	public HReturn calculateType(CuContext context) throws NoSuchTypeException {
		
		HReturn re = new HReturn();
		return re;
	}
}

class AssignStat extends CuStat{
	private CuVvc var;
	private CuExpr ee;
	public AssignStat (CuVvc t, CuExpr e) {
		var = t;
		ee = e;
		super.text = var.toString() + " := " + ee.toString() + " ;";
	}
	
	public HReturn calculateType(CuContext context) throws NoSuchTypeException {
		//check var is in immutable, type check fails
		if (context.inVar(var.toString())) {
			throw new NoSuchTypeException();
		}
		//whenever we calculate expr type, we use a temporary context with merged mutable and
		//immutable variables
		CuContext tcontext = new CuContext (context);
		tcontext.mergeVariable();
		CuType exprType = ee.calculateType(tcontext);
		context.updateMutType(var.toString(), exprType);
		HReturn re = new HReturn();
		re.b = false;
		re.tau = CuType.bottom;
		return re;
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
	public HReturn calculateType(CuContext context) throws NoSuchTypeException {
		//whenever we calculate expr type, we use a temporary context with merged mutable and
		//immutable variables
		CuContext tcontext = new CuContext (context);
		tcontext.mergeVariable();		
    	//check whether e is an iterable of tao
    	CuType eType = e.calculateType(tcontext);
    	if (!eType.isIterable() ) {
    		throw new NoSuchTypeException();
    	}
    	//var can't appear in mutable or immutable variables
    	if (context.inMutVar(this.var.toString()) || context.inVar(this.var.toString())) {
    		throw new NoSuchTypeException();
    	}
    	CuType iter_type = eType.getArgument();
    	CuContext s_context = new CuContext(context);
    	s_context.updateMutType(this.var.toString(), iter_type);
    	HReturn re = s1.calculateType(s_context);
    	
    	//type weakening to make it type check
    	context.weakenMutType(s_context);
		
		re.b = false;
		return re;
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
    
	public HReturn calculateType(CuContext context) throws NoSuchTypeException {
		//whenever we calculate expr type, we use a temporary context with merged mutable and
		//immutable variables
		CuContext tcontext = new CuContext (context);
		tcontext.mergeVariable();		
    	//check whether e is boolean
    	CuType eType = e.calculateType(tcontext);
    	if (!eType.isBoolean()) {
    		throw new NoSuchTypeException();
    	}
    	CuContext temp_context1 = new CuContext (context);
    	CuContext temp_context2 = new CuContext (context);
    	
		HReturn re1 = s1.calculateType(temp_context1);
		HReturn re2 = s2.calculateType(temp_context2);
		
		temp_context1.weakenMutType(temp_context2);
		//we are passing reference, this is suppose to change
		context = temp_context1;
		
		HReturn re_out = new HReturn();
		if (re1.b==false || re2.b==false) {
			re_out.b = false;
		}
		else {
			re_out.b = true;
		}
		re_out.tau = CuType.commonParent(re1.tau, re2.tau);
		return re_out;
	}

}

class ReturnStat extends CuStat{
	private CuExpr e;
	public ReturnStat (CuExpr ee) {
		e = ee;
		super.text = "return " + e.toString() + " ;";
	}
	public HReturn calculateType(CuContext context) throws NoSuchTypeException {
		HReturn re = new HReturn();
		re.b = true;
		//whenever we calculate expr type, we use a temporary context with merged mutable and
		//immutable variables
		CuContext tcontext = new CuContext (context);
		tcontext.mergeVariable();	
		re.tau = e.calculateType(tcontext);
		return re;
	}
}

class Stats extends CuStat{
	public ArrayList<CuStat> al = new ArrayList<CuStat>();
	public Stats (List<CuStat> cu) {
		al = (ArrayList<CuStat>) cu;
		text = "{ " + Helper.listFlatten(al) + " }";
	}
	public HReturn calculateType(CuContext context) throws NoSuchTypeException {
		//default is false, bottom
		HReturn re = new HReturn();
		for (CuStat cs : al) {
			HReturn temp = cs.calculateType(context);
			re.b = temp.b;
			re.tau = CuType.commonParent(re.tau, temp.tau);
		}
		return re;
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
    public HReturn calculateType(CuContext context) throws NoSuchTypeException {
		//whenever we calculate expr type, we use a temporary context with merged mutable and
		//immutable variables
		CuContext tcontext = new CuContext (context);
		tcontext.mergeVariable();		
    	//check whether e is boolean
    	CuType eType = e.calculateType(tcontext);
    	if (!eType.isBoolean()) {
    		throw new NoSuchTypeException();
    	} 
    	CuContext s_context = new CuContext(context);
    	HReturn re = s1.calculateType(s_context);   	
    	//type weakening to make it type check
    	context.weakenMutType(s_context);
    	re.b = false;
    	return re;
    }
}

//Yinglei doesn't think this will be used, correct her if wrong
class EmptyBody extends CuStat {
	public EmptyBody(){
		text=" ;";
	}
} 
