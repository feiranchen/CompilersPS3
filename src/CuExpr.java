import java.util.List;

public abstract class CuExpr {
	protected String text = "";
	@Override public String toString() {
		return text;
	}
	public void add(List<CuType> pt, List<CuExpr> es) {}
	//This is what Yunhan promised me to have, please implement
	public CuType getType() {
		return null;
	}
	String type = null;
}

class AndExpr extends CuExpr{
	private CuExpr data1, data2;
	public AndExpr(CuExpr e1, CuExpr e2) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . and < > ( %s )", data1.toString(), data2.toString());
	}
}

class AppExpr extends CuExpr {
	CuExpr e1;
	CuExpr e2;
	public AppExpr(CuExpr e1, CuExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
		super.text = e1.toString() + " ++ " + e2.toString();
	}
}

class BrkExpr extends CuExpr {
	private List<CuExpr> data_es;
	public BrkExpr(List<CuExpr> es){
		data_es = es;
		super.text=Helper.printList("[", data_es, "]", ",");
	}
}

class CBoolean extends CuExpr{
	Boolean data_b;
	public CBoolean(Boolean b){
		data_b=b;
		super.text=b.toString();
	}
}

class CInteger extends CuExpr {
	Integer data_i;
	public CInteger(Integer i){
		data_i=i;
		super.text=i.toString();
	}
}

class CString extends CuExpr {
	String data_s;
	public CString(String s){
		data_s=s;
		super.text=s;
	}
}

class DivideExpr extends CuExpr{
	private CuExpr data1, data2;
	public DivideExpr(CuExpr e1, CuExpr e2) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . divide < > ( %s )", data1.toString(), data2.toString());
	}
}

class EqualExpr extends CuExpr{
	private CuExpr data1, data2;
	public EqualExpr(CuExpr e1, CuExpr e2, Boolean eq) {
		data1 = e1;
		data2 = e2;
		if (eq) super.text = String.format("%s . equals < > ( %s )", data1.toString(), data2.toString());
		else super.text = String.format("%s . equals < > ( %s ) . negate ( )", data1.toString(), data2.toString());
	}
}

class GreaterThanExpr extends CuExpr{
	private CuExpr data1, data2;
	public GreaterThanExpr(CuExpr e1, CuExpr e2, Boolean strict) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . greaterThan < > ( %s , %s )", data1.toString(), data2.toString(), strict);
	}
}

class LessThanExpr extends CuExpr{
	private CuExpr data1, data2;
	public LessThanExpr(CuExpr e1, CuExpr e2, Boolean strict) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . lessThan < > ( %s , %s )", data1.toString(), data2.toString(), strict);
	}
}

class MinusExpr extends CuExpr{
	private CuExpr data1, data2;
	public MinusExpr(CuExpr e1, CuExpr e2) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . minus < > ( %s )", data1.toString(), data2.toString());
	}
}

class ModuloExpr extends CuExpr{
	private CuExpr data1, data2;
	public ModuloExpr(CuExpr e1, CuExpr e2) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . modulo < > ( %s )", data1.toString(), data2.toString());
	}
}

class NegateExpr extends CuExpr{
	private CuExpr data;
	public NegateExpr(CuExpr e) {
		data = e;
		super.text = String.format("%s . negate < > ( )", data.toString());
	}
}

class NegativeExpr extends CuExpr{
	private CuExpr data;
	public NegativeExpr(CuExpr e) {
		data = e;
		super.text = String.format("%s . negative < > ( )", data.toString());
	}
}

class OnwardsExpr extends CuExpr{
	private CuExpr data;
	public OnwardsExpr(CuExpr e, Boolean inclusiveness) {
		data = e;
		super.text = String.format("%s . onwards < > ( %s )", data.toString(), inclusiveness);
	}
}

class OrExpr extends CuExpr{
	private CuExpr data1, data2;
	public OrExpr(CuExpr e1, CuExpr e2) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . or < > ( %s )", data1.toString(), data2.toString());
	}
}

class PlusExpr extends CuExpr{
	private CuExpr data1, data2;
	public PlusExpr(CuExpr e1, CuExpr e2) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . plus < > ( %s )", data1.toString(), data2.toString());
	}
}

class ThroughExpr extends CuExpr{
	private CuExpr data1, data2;
	public ThroughExpr(CuExpr e1, CuExpr e2, Boolean low, Boolean up) {
		data1 = e1;
		data2 = e2;
		super.text = String.format("%s . through < > ( %s , %s , %s )", data1.toString(), data2.toString(), low, up);
	}
}

class TimesExpr extends CuExpr{
	private CuExpr e1, e2;
	public TimesExpr(CuExpr e1, CuExpr e2) {
		this.e1 = e1;
		this.e2 = e2;
		super.text = String.format("%s . times < > ( %s )", e1.toString(), e2.toString());
	}
}

class VarExpr extends CuExpr{
	private CuExpr e;
	private String var;
	private List<CuType> pt;
	List<CuExpr> es;
	public VarExpr(CuExpr e, String var, List<CuType> pt, List<CuExpr> es) {
		this.e = e;
		this.var = var;
		this.pt = pt;
		this.es = es;
		super.text = String.format("%s . %s %s %s", e.toString(), var, 
				Helper.printList("<", pt, ">", ","), Helper.printList("(", es, ")", ","));
	}

}
class VcExp extends CuExpr {
	private String data_v; 
	private List<CuType> data_pt;
	private List<CuExpr> data_es;
	public VcExp(String v, List<CuType> pt, List<CuExpr> es){
		this.data_v=v;
		this.data_pt=pt;
		this.data_es=es;
		
		super.text=v.toString()+Helper.printList("<", pt, ">", ",")+Helper.printList("(", es, ")", ",");
	}
}

class VvExp extends CuExpr{
	public VvExp(String str){
		super.text=str;
	}
	
	@Override public void add(List<CuType> pt, List<CuExpr> es){
		super.text += Helper.printList("<", pt, ">", ",")+Helper.printList("(", es, ")", ",");
	}
	
}