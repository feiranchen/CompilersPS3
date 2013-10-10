import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

public abstract class CuExpr {
	protected String text = "";
	protected String methodId = null;
	private CuType type = null;
	protected CuType desiredType = null;
	public void add(List<CuType> pt, List<CuExpr> es) {}
	public final CuType getType(CuContext context) throws NoSuchTypeException {
		Helper.ToDo("desired type?");
		if(type == null) { type = calculateType(context); }
		Helper.ToDo("function context should contains Integer->method list");
		return type;
	}
	protected abstract CuType calculateType(CuContext context);
	@Override public String toString() {return text;}
	
	protected CuType binaryExprType(CuContext context, String leftId, String methodId, String rightId) throws NoSuchTypeException {
		Helper.ToDo("requires function map id->typescheme");
		Helper.ToDo("leave this to function?");
		// get the functions of left class
		Map<String, CuTypeScheme> funcs = context.mClasses.get(leftId).cTxt.mFunctions;
		// check the method typescheme
		CuTypeScheme ts = funcs.get(methodId);
		CuClass right = context.mClasses.get(rightId);
		/** if this method exists, kindcontext is <>, and type scheme matches with input */
		if (ts != null && ts.data_kc.isEmpty() && getClassType(right).equals(ts.data_t)) {
			return ts.data_t;
		}
		throw new NoSuchTypeException();
	}

	protected static CuType getClassType(CuClass c) {
		return new VClass(c.name, c.appliedTypePara);
	}
	protected CuType unaryExprType(CuContext context, String id, String methodId) throws NoSuchTypeException {
		Helper.ToDo("requires function map id->typescheme");
		Helper.ToDo("leave this to function?");
		// get the functions of left class
		Map<String, CuTypeScheme> funcs = context.mClasses.get(id).cTxt.mFunctions;
		// check the method typescheme
		CuTypeScheme ts = funcs.get(methodId);
		/** if this method exists, kindcontext is <>, and type scheme is () */
		if (ts != null && ts.data_kc.isEmpty() && ts.data_tc.isEmpty()) {
			return ts.data_t;
		}
		throw new NoSuchTypeException();
	}
	
	protected Boolean isTypeOf(CuContext context, CuType t) {
		return this.getType(context).isSubtypeOf(t);
	}
	protected Boolean isTypeOf(CuContext context, CuType t, List<CuType> map) {
		CuType type = this.getType(context);
		type.plugIn(map);
		return type.isSubtypeOf(t);
	}
}

class AndExpr extends CuExpr{
	private CuExpr left, right;
	public AndExpr(CuExpr e1, CuExpr e2) {
		left = e1;
		right = e2;
//		super.desiredType = CuType.bool;
		super.methodId = "add";
		super.text = String.format("%s . %s < > ( %s )", left.toString(), super.methodId, right.toString());
	}
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		return binaryExprType(context, left.getType(context).id, super.methodId, right.getType(context).id);
	}
}

class AppExpr extends CuExpr {
	CuExpr left;
	CuExpr right;
	public AppExpr(CuExpr e1, CuExpr e2) {
		this.left = e1;
		this.right = e2;
		super.text = e1.toString() + " ++ " + e2.toString();
	}
	@Override protected CuType calculateType(CuContext context) {
		CuType type = CuType.commonParent(left.getType(context), left.getType(context));
		if (type.isIterable()) return type;
		if (type.isBottom()) return new Iter(CuType.bottom);
		Helper.ToDo("Bottom <: Iterable<Bot>?");
		throw new NoSuchTypeException();
	}
}

class BrkExpr extends CuExpr {
	private List<CuExpr> val;
	public BrkExpr(List<CuExpr> es){
		this.val = es;
		super.text=Helper.printList("[", val, "]", ",");
	}
	@Override protected CuType calculateType(CuContext context) {
		Helper.ToDo("what if es is empty or null");
		CuType t = val.get(0).getType(context);
		for (int i = 0; i+1 < val.size(); i++) {
			t = CuType.commonParent(val.get(i).getType(context), val.get(i+1).getType(context));
		} // find the common parent type of all expressions here
		return new Iter(t);
	}
}

class CBoolean extends CuExpr{
	Boolean val;
	public CBoolean(Boolean b){
		val=b;
		super.text=b.toString();
	}
	@Override protected CuType calculateType(CuContext context) {
		if (val == null) { throw new NoSuchTypeException();}
		return CuType.bool;
	}
}

class CInteger extends CuExpr {
	Integer val;
	public CInteger(Integer i){
		val=i;
		super.text=i.toString();
	}
	@Override protected CuType calculateType(CuContext context) {
		if (val == null) { throw new NoSuchTypeException();}
		return CuType.integer;
	}
}

class CString extends CuExpr {
	String val;
	public CString(String s){
		val=s;
		super.text=s;
	}
	@Override protected CuType calculateType(CuContext context) {
		if (val == null) { throw new NoSuchTypeException();}
		return CuType.string;
	}
}

class DivideExpr extends CuExpr{
	private CuExpr left, right;
	public DivideExpr(CuExpr e1, CuExpr e2) {
		left = e1;
		right = e2;
		super.methodId = "divide";
		super.text = String.format("%s . %s < > ( %s )", left.toString(), super.methodId, right.toString());
	}
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		return binaryExprType(context, left.getType(context).id, super.methodId, right.getType(context).id);
	}
	/*
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		if (!left.getType(context).isInteger() || !right.getType(context).isInteger())
			throw new NoSuchTypeException();
		return CuType.integer;
	}
	 */
}

class EqualExpr extends CuExpr{
	private CuExpr left, right;
	private String method2= null;
	public EqualExpr(CuExpr e1, CuExpr e2, Boolean eq) {
		left = e1;
		right = e2;
		super.methodId = "equals";
		if (eq) {
			super.text = String.format("%s . %s < > ( %s )", left.toString(), super.methodId, right.toString());
		}
		else {
			method2 = "negate";
			super.text = String.format("%s . %s < > ( %s ) . negate ( )", left.toString(), super.methodId, right.toString());
		}
	}
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		CuType t = binaryExprType(context, left.getType(context).id, super.methodId, right.getType(context).id);
		if (method2 != null) {
			return context.mFunctions.get(method2).data_t;
		}
		return t;
	}
	/*
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		if (!left.equals(right))
			throw new NoSuchTypeException();
		return CuType.bool;
	} */
}

class GreaterThanExpr extends CuExpr{
	private CuExpr left, right;
	public GreaterThanExpr(CuExpr e1, CuExpr e2, Boolean strict) {
		left = e1;
		right = e2;
		super.methodId = "greaterThan";
		Helper.ToDo("strict boolean??");
		super.text = String.format("%s . %s < > ( %s , %s )", left.toString(), super.methodId, right.toString(), strict);
	}

	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		Helper.ToDo("to simple");
		if (!left.isTypeOf(context, CuType.integer) || !right.isTypeOf(context, CuType.integer))
			throw new NoSuchTypeException();
		return CuType.bool;
	}
}

class LessThanExpr extends CuExpr{
	private CuExpr left, right;
	public LessThanExpr(CuExpr e1, CuExpr e2, Boolean strict) {
		left = e1;
		right = e2;
		super.methodId = "lessThan";
		super.text = String.format("%s . %s < > ( %s, %s )", left.toString(), super.methodId, right.toString(), strict);
	}
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		Helper.ToDo("too simple");
		if (!left.isTypeOf(context, CuType.integer) || !right.isTypeOf(context, CuType.integer))
			throw new NoSuchTypeException();
		return CuType.bool;
	}
}

class MinusExpr extends CuExpr{
	private CuExpr left, right;
	public MinusExpr(CuExpr e1, CuExpr e2) {
		left = e1;
		right = e2;
		super.methodId = "minus";
		super.text = String.format("%s . %s < > ( %s )", left.toString(), super.methodId, right.toString());
	}
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		return binaryExprType(context, left.getType(context).id, super.methodId, right.getType(context).id);
	}
	/*
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		if (!left.getType(context).isInteger() || !right.getType(context).isInteger())
			throw new NoSuchTypeException();
		return CuType.integer;
	}*/
}

class ModuloExpr extends CuExpr{
	private CuExpr left, right;
	public ModuloExpr(CuExpr e1, CuExpr e2) {
		left = e1;
		right = e2;
		super.methodId = "modulo";
		super.text = String.format("%s . %s < > ( %s )", left.toString(), super.methodId, right.toString());
	}
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		return binaryExprType(context, left.getType(context).id, super.methodId, right.getType(context).id);
	}
	/*
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		if (!left.getType(context).isInteger() || !right.getType(context).isInteger())
			throw new NoSuchTypeException();
		return CuType.integer;
	}*/
}

class NegateExpr extends CuExpr{
	private CuExpr val;
	public NegateExpr(CuExpr e) {
		val = e;
		super.methodId = "negate";
		super.text = String.format("%s . %s < > ( )", val.toString(), super.methodId);
	}
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		return unaryExprType(context, val.getType(context).id, super.methodId);
	}
	/*
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		if (!val.getType(context).isBoolean())
			throw new NoSuchTypeException();
		return CuType.bool;
	}*/
}

class NegativeExpr extends CuExpr{
	private CuExpr val;
	public NegativeExpr(CuExpr e) {
		val = e;
		super.methodId = "negative";
		super.text = String.format("%s . %s < > ( )", val.toString(), super.methodId);
	}
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		return unaryExprType(context, val.getType(context).id, super.methodId);
	}
	/*
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		if (!val.getType(context).isInteger())
			throw new NoSuchTypeException();
		return CuType.integer;
	}*/
}

class OnwardsExpr extends CuExpr{
	private CuExpr val;
	public OnwardsExpr(CuExpr e, Boolean inclusiveness) {
		val = e;
		super.methodId = "onwards";
		super.text = String.format("%s . %s < > ( %s )", val.toString(), super.methodId, inclusiveness);
	}
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		return binaryExprType(context, val.getType(context).id, super.methodId, CuType.bool.id);
	}
}

class OrExpr extends CuExpr{
	private CuExpr left, right;
	public OrExpr(CuExpr e1, CuExpr e2) {
		left = e1;
		right = e2;
		super.methodId = "or";
		super.text = String.format("%s . %s < > ( %s )", left.toString(), super.methodId, right.toString());
	}
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		return binaryExprType(context, left.getType(context).id, super.methodId, right.getType(context).id);
	}
}

class PlusExpr extends CuExpr{
	private CuExpr left, right;
	public PlusExpr(CuExpr e1, CuExpr e2) {
		left = e1;
		right = e2;
		super.methodId = "plus";
		super.text = String.format("%s . %s < > ( %s )", left.toString(), super.methodId, right.toString());
	}
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		return binaryExprType(context, left.getType(context).id, super.methodId, right.getType(context).id);
	}
}

class ThroughExpr extends CuExpr{
	private CuExpr left, right;
	public ThroughExpr(CuExpr e1, CuExpr e2, Boolean low, Boolean up) {
		left = e1;
		right = e2;
		super.methodId = "through";
		super.text = String.format("%s . %s < > ( %s , %s , %s )", left.toString(), methodId, right.toString(), low, up);	}

	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		Helper.ToDo("too simple");
		if (!left.isTypeOf(context, CuType.integer) || !right.isTypeOf(context, CuType.integer))
			throw new NoSuchTypeException();
		return new Iter(CuType.integer);
	}
}

class TimesExpr extends CuExpr{
	private CuExpr left, right;
	public TimesExpr(CuExpr e1, CuExpr e2) {
		this.left = e1;
		this.right = e2;
		super.methodId = "times";
		super.text = String.format("%s . %s < > ( %s )", left.toString(), super.methodId, right.toString());
	}
	@Override protected CuType calculateType(CuContext context) throws NoSuchTypeException {
		return binaryExprType(context, left.getType(context).id, super.methodId, right.getType(context).id);
	}
}

class VarExpr extends CuExpr{
	private CuExpr val;
	private String method;
	private List<CuType> types;
	List<CuExpr> es;
	public VarExpr(CuExpr e, String var, List<CuType> pt, List<CuExpr> es) {
		this.val = e;
		this.method = var;
		this.types = pt;
		this.es = es;
		super.text = String.format("%s . %s %s %s", this.val.toString(), this.method, 
				Helper.printList("<", this.types, ">", ","), Helper.printList("(", this.es, ")", ","));
	}
	@Override protected CuType calculateType(CuContext context) {
		CuType tHat = val.getType(context); // 1st line in Figure 5 exp
		CuTypeScheme ts = context.mClasses.get(tHat.id).cTxt.mFunctions.get(method);
		List<CuType> tList = new ArrayList<CuType>();
		for (Entry<String, CuType> e : ts.data_tc.entrySet()) {
			tList.add(e.getValue());
		}
		for (int i = 0; i < es.size(); i++) {
			if (!es.get(i).isTypeOf(context, tList.get(i), types))
				throw new NoSuchTypeException();
		}
		return ts.data_t;
	}

}
class VcExp extends CuExpr {
	private String val; 
	private List<CuType> types;
	private List<CuExpr> es;
	public VcExp(String v, List<CuType> pt, List<CuExpr> e){
		this.val=v;
		this.types=pt;
		this.es=e;
		
		super.text=val.toString()+Helper.printList("<", types, ">", ",")+Helper.printList("(", es, ")", ",");
	}
	@Override protected CuType calculateType(CuContext context) {
		// check tao in scope
		if (context.getFunction(val) == null) throw new NoSuchTypeException();
		// check each es 
		List<CuType> tList = new ArrayList<CuType>();
		for (Entry<String, CuType> e : context.mClasses.get(val).fieldTypes.entrySet()) {
			tList.add(e.getValue());
		}
		for (int i = 0; i < es.size(); i++) {
			if (!es.get(i).isTypeOf(context, tList.get(i), types))
				throw new NoSuchTypeException();
		}
		return getClassType(context.mClasses.get(val));
	}
}

class VvExp extends CuExpr{
	private String val;
	private List<CuType> types = null;;
	private List<CuExpr> es;
	
	public VvExp(String str){
		val = str;
		super.text=str;
	}
	
	@Override public void add(List<CuType> pt, List<CuExpr> e){
		types = pt;
		es = e;
		super.text += Helper.printList("<", pt, ">", ",")+Helper.printList("(", es, ")", ",");
	}

	@Override protected CuType calculateType(CuContext context) {
		if (types == null) return context.getVariable(val);
		Helper.ToDo("copy from class<>()...");
		// check tao in scope
		if (context.getFunction(val) == null) throw new NoSuchTypeException();
		// check each es 
		CuType t = super.getClassType(context.mClasses.get(val));
		List<CuType> tList = new ArrayList<CuType>();
		for (Entry<String, CuType> e : context.mClasses.get(val).fieldTypes.entrySet()) {
			tList.add(e.getValue());
		}
		for (int i = 0; i < es.size(); i++) {
			if (!es.get(i).isTypeOf(context, tList.get(i), types))
				throw new NoSuchTypeException();
		}
		return t;
	}
	
}