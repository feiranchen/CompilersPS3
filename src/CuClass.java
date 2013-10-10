import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Yinglei worked on the desugared program (core language), in parsing, we should
//put any implementation in interface to class, and this is done in parsing, probably haven't done it yet
public abstract class CuClass {
	protected String text = "";
	@Override public String toString() {
		return text;
	}
	public void add(List<CuExpr> s) {}
	public void addSuper(CuType t) {}
	public void add(CuStat s) {}
	public void add(CuVvc v, CuTypeScheme ts, CuStat s) {}
	public void add(String v_name, CuTypeScheme ts) {}
	public void add(CuVvc v_name, CuTypeScheme ts) {}
	public void calculateType(CuContext context) throws NoSuchTypeException {}
}

class Cls extends CuClass {
	String name;
	CuType superType=new Top();
	CuContext cTxt= new CuContext();
	List<CuStat> classStatement = new ArrayList<CuStat>();
	List<CuExpr> superArg;
	
	Map<String, CuFun> funList= new HashMap<String, CuFun>(); 
	
	
	//=======Feiran doesn't think the following is good style. Let's see.
	//kind context theta
//	List<String> kindCtxt;
	//type context gamma
//	Map<CuVvc, CuType> typeCtxt;
//	Map<Vv, CuFun>      funCtxt;
	
	
	
	//kind context theta
	//List<String> kc;
	//type context gamma
	//Map<CuVvc, CuType> tc;
	//function context for method lookup, we don't need the following 
	//statement for this purpose
	//CuFunC functxt;
	
	//=============================
	
	public Cls(String clsintf, List<String> kc, Map<String, CuType> tc, CuContext outsideCtxt) {
		name=clsintf;
		cTxt=outsideCtxt;
		for (String s : kc) {cTxt.updateKind(s); }
		for (Map.Entry<String, CuType> e : tc.entrySet()) { 
			cTxt.updateType(e.getKey(), e.getValue());
		}
	}
	@Override public void addSuper (CuType t) {
		superType = t;
	}
	
	@Override public void add (CuStat s) {
		classStatement.add(s);
	}
	
	@Override public void add (List<CuExpr> s) {
		superArg = s;
		//add super length type check here.
		//add mapping to context here
		//for (CuExpr ex : s){
		//	cTxt.updateMutType(name, value)
		//}
	}
	
	@Override public void add(CuVvc v, CuTypeScheme ts, CuStat s) {
		cTxt.updateFunction(v.toString(), ts);
		funList.put(v.toString(),new Function(v,ts,s));
	}
	

	/*
	@Override public String toString() {
		return String.format("class %s %s %s extends %s { %s super ( %s ) ; %s }", 
				clsintf, Helper.printList("<", kc, ">", ","), Helper.printMap("(", tc, ")", ","), superType.toString(), 
				Helper.printList("", classStatement, "", ""), Helper.printList("(", es, ")", ","), Helper.printList("", fun, "", ""));
	}
	*/
	
	@Override public void calculateType(CuContext context) throws NoSuchTypeException {
		
	}
}

class Intf extends CuClass{
	private String intf_name;
	private List<String> kc_name;
	private CuType t;
	private ArrayList<String> v_names = new ArrayList<String>();
	private ArrayList<CuTypeScheme> ts_names = new ArrayList<CuTypeScheme>();
	
	List<Function> functions=new ArrayList<Function>();
	private String funs = "";
	
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
	public void addSuper (CuType tt) {
		t = tt;
		text += " " + t.toString();
	}
	@Override
	public void add (CuVvc v_name, CuTypeScheme ts, CuStat s) {
		v_names.add(v_name.toString());
		ts_names.add(ts);
		funs += " fun " + v_name + ts.toString() + s.toString();
		functions.add(new Function(v_name,ts,s));
	}
	
	@Override public String toString() {
		text += " { " + funs + " } ";
		return text;
	}
	public void calculateType(CuContext context) throws NoSuchTypeException {
		Helper.ToDo("make sure that the type check returns its constructable component or null");
		
	}
}

//======Class init=========

class VBoolean extends Cls {
	Boolean v=false;
	public VBoolean() {
		super("Boolean", new ArrayList<String>(), new HashMap<String, CuType>(), CuContext.Empty);
		//if (val instanceof Boolean) { v=val; }
		//else { throw new NoSuchTypeException();}
	}

	public boolean calculateType() { return v; }
}

class VInteger extends Cls {
	Integer v=0;
	public VInteger() {
		super("Integer", new ArrayList<String>(), new HashMap<String, CuType>(), CuContext.Empty);
		//if (val instanceof Integer) { v=val; }
		//else { throw new NoSuchTypeException();}
	}
	public VInteger calculateType() { return this; }
}

class VCharacter extends Cls {
	Character c;
	public VCharacter() {
		super("Character", new ArrayList<String>(), new HashMap<String, CuType>(), CuContext.Empty);
		//if (val instanceof Character) { c=val; }
		//else { throw new NoSuchTypeException();}
	}
	public VCharacter calculateType() { return this; }
}

class VString extends Cls {
	String v="";
	public VString() {
		super("String", new ArrayList<String>(), new HashMap<String, CuType>(), CuContext.Empty);
		//if (val instanceof String) { v=val; }
		//else { throw new NoSuchTypeException();}
	}

	public VString calculateType() { return this; }
}


class VIterable extends Cls {
	List<CuType> v;
	public VIterable(List<String> kc) {
		super("Iterable", kc, new HashMap<String, CuType>(), CuContext.Empty);
		//if (val instanceof List<CuType>) { v=val; }
		//else { throw new NoSuchTypeException();}
	}
	
	public VIterable calculateType() { return this; }
}

