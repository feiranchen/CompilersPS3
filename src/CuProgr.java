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
	
	public void calculateType(CuContext context) throws NoSuchTypeException {}
}

class ClassPrg extends CuProgr {
	CuClass c; 
	CuProgr p;
	public ClassPrg (CuClass c, CuProgr p) {
		this.c = c;
		this.p = p;
		super.text = c.toString() + " " + p.toString();
	}
	public void calculateType(CuContext context) throws NoSuchTypeException {
		//Yinglei's guess it that depends on its detailed type (class/interface),
		//it will use the correct function
		c.calculateType(context);
		p.calculateType(context);
	}
}

class FunPrg extends CuProgr {
	//used for printing in project 2
	List<String> fun = new ArrayList<String>(); // need to change
	//used for type checking in project 3
	List<String> names = new ArrayList<String>();
	List<CuTypeScheme> typeSchemes = new ArrayList<CuTypeScheme> ();
	List<CuStat> statements = new ArrayList<CuStat>();
	CuProgr p;
	
	public FunPrg(CuVvc var, CuTypeScheme ts, CuStat s) {
		String t = String.format("fun %s %s %s", var.toString(), ts.toString(), s.toString());
		fun.add(t);
		this.names.add(var.toString());
		this.typeSchemes.add(ts);
		this.statements.add(s);
	}
	
	@Override public void add (CuVvc var, CuTypeScheme ts, CuStat s) {
		String t = String.format("fun %s %s %s", var.toString(), ts.toString(), s.toString());
		fun.add(t);
		this.names.add(var.toString());
		this.typeSchemes.add(ts);
		this.statements.add(s);
	}
	@Override public void add (CuProgr p) {
		this.p = p;
	}
	
	@Override public String toString() {
		return Helper.printList("", fun, "", "") + " " + p.toString();
	}
	public void calculateType(CuContext context) throws NoSuchTypeException {
		//update the function context
		for (int i=0; i<this.names.size(); i++){
			context.updateFunction(this.names.get(i), this.typeSchemes.get(i));
		}
		//type check typeschemes and statements
		for (int i=0; i<this.typeSchemes.size(); i++) {
			this.typeSchemes.get(i).calculateType(context);
			CuContext temp_context = new CuContext (context);
			temp_context.updateKc(this.typeSchemes.get(i).data_kc);
			temp_context.updateMutType(this.typeSchemes.get(i).data_tc);
			HReturn re = this.statements.get(i).calculateType(temp_context);
			if (re.b == false) {
				throw new NoSuchTypeException();
			}
			if (!re.tau.isSubtypeOf(this.typeSchemes.get(i).data_t)) {
				throw new NoSuchTypeException();
			}
		}
		this.p.calculateType(context);
	}
}

class StatPrg extends CuProgr {
	Stats cu;
	CuProgr p = null;
	public StatPrg(CuStat s) {
		List<CuStat> temp= new ArrayList<CuStat>();
		temp.add(s);
		this.cu = new Stats(temp);
		super.text = s.toString();
	}
	
	@Override public void add(List<CuStat> cu, CuProgr p) {
		this.cu.al.addAll(cu);
		this.p = p;
		text += Helper.listFlatten(cu) + " "+ p.toString();
	}
	public void calculateType(CuContext context) throws NoSuchTypeException {
		HReturn re = cu.calculateType(context);
		//final tau should be a subtype of iterable string
		if (!re.tau.isSubtypeOf(new Iter(new Str()))) {
			throw new NoSuchTypeException();
		}
		if (this.p == null) {
			if (re.b==false) {
				throw new NoSuchTypeException();
			}
		}
		else {
			context.mergeVariable();
			p.calculateType(context);
		}
	}
	
}