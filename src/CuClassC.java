import java.util.ArrayList;
import java.util.List;


public abstract class CuClassC {
	protected String text = "";
	@Override public String toString() {
		return text;
	}
	public void add(CuType t) {}
	public void add(CuVvc vv, CuTypeScheme ts) {}
	public void add(String k, String ci, List<String> kc) {}
	public void finish(String id) {}
}

class ClassCtxt extends CuClassC {
	//class or interface
	List<Ele> elements = new ArrayList<Ele>();
	
	String clsintf, keyword;	
	List<String> kc;
	CuType t;
	List<String> VvTypeScheme = new ArrayList<String>(); // temporal
	public ClassCtxt() {}
	
	@Override public void add(String k, String ci, List<String> kc) {
		elements.add(new Ele(k, ci, kc));
		
		this.keyword = k;
		this.clsintf = ci;
		this.kc = kc;
		text += String.format(" , %s %s %s extends", keyword, clsintf, Helper.printList("<", kc, ">", ","));
	}
	
	@Override public void add (CuType t) {
		Ele cur = elements.get(elements.size()-1);
		cur.set_superType(t);
		elements.set(elements.size()-1, cur);
		
		this.t = t;
		text += " " +t.toString();
	}
	
	@Override public void add (CuVvc vv, CuTypeScheme ts) {
		Ele cur = elements.get(elements.size()-1);
		cur.func_add(vv, ts);
		elements.set(elements.size()-1, cur);
		
		String s = String.format("%s %s ;", vv.toString(), ts.toString());
		VvTypeScheme.add(s);
		text +=  " " + Helper.printList("{", VvTypeScheme, "}", ";");
	}
	
}

class Ele {
	String keyword;
	//class/interface names
	String name;
	//kind contexts
	List<String> kc;
	CuType superType;
	CuFunC func;
	
	Ele(String keyword, String name, List<String> kc) {
		this.keyword = keyword;
		this.name = name;
		this.kc = kc;
	}
	
	public void set_superType(CuType superType) {
		this.superType = superType;
	}
	
	public void func_add(CuVvc vv, CuTypeScheme ts) {
		this.func.add(vv, ts);
	}
}

