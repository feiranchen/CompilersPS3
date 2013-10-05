import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class CuClass {
	protected String text = "";
	@Override public String toString() {
		return text;
	}
	public void add(List<CuExpr> s) {}
	public void add(CuType t) {}
	public void add(CuStat s) {}
	public void add(CuVvc v, CuTypeScheme ts, CuStat s) {}
	public void add(String v_name, CuTypeScheme ts) {}
	public void add(CuVvc v_name, CuTypeScheme ts) {}
	
}

class Cls extends CuClass {
	//we need its superType for subtyping
	CuType superType;
	//class name
	String clsintf;
	//kind context theta
	List<String> kc;
	//type context gamma
	Map<CuVvc, CuType> tc;
	//function context for method lookup, we don't need the following 
	//statement for this purpose
	CuFunC functxt;
	
	List<CuStat> ss = new ArrayList<CuStat>();
	List<CuExpr> es;
	List<String> fun = new ArrayList<String>();
	
	
	public Cls(CuVvc clsintf, List<String> kc, Map<CuVvc, CuType> tc2) {
		this.clsintf = clsintf.toString();
		this.kc = kc;
		this.tc = tc2;
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
				clsintf, Helper.printList("<", kc, ">", ","), Helper.printMap("(", tc, ")", ","), superType.toString(), 
				Helper.printList("", ss, "", ""), Helper.printList("(", es, ")", ","), Helper.printList("", fun, "", ""));
	}
}

class Intf extends CuClass{
	private String intf_name;
	private String funs = "";
	private List<String> kc_name;
	private CuType t;
	private ArrayList<String> v_names = new ArrayList<String>();
	private ArrayList<CuTypeScheme> ts_names = new ArrayList<CuTypeScheme>();
	public Intf (String iname, List<String> kname){
		intf_name = iname;
		kc_name = kname;
		text = "interface " + intf_name.toString() + " <";
		for (String s : kc_name) {
			text += " " + s.toString();
		}
		text += " > extends";
	}
	@Override
	public void add (CuType tt) {
		t = tt;
		text += " " + t.toString();
	}
	@Override
	public void add (CuVvc v_name, CuTypeScheme ts) {
		v_names.add(v_name.toString());
		ts_names.add(ts);
		funs += " fun " + v_name + ts.toString() + " ;";
	}
	
	@Override public String toString() {
		text += " { " + funs + " } ";
		return text;
	}
}