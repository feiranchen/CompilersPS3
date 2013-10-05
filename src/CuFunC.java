import java.util.ArrayList;
import java.util.List;


public abstract class CuFunC {
	protected String text = "";
	@Override public String toString() {
		return text;
	}
	public void add(CuVvc v, CuTypeScheme ts) {}
	public void add(CuVvc v, CuTypeScheme ts, CuStat s) {}
	public void add(CuStat s){}
	public abstract CuType calculateType(CuVvc v, CuTypeScheme ts, CuStat s);
}

class Function extends CuFunC {
	public List<CuVvc> v = new ArrayList<CuVvc>();
	public List<CuTypeScheme> ts = new ArrayList<CuTypeScheme>();
	public CuStat funBody=new Stats(new ArrayList<CuStat>());
	
	public Function() {
	}
	
	public Function (CuVvc v, CuTypeScheme ts, CuStat s){
		this.v.add(v);
		this.ts.add(ts);
		this.funBody=s;
		super.text += String.format(" , %s %s %s", v.toString(), ts.toString(),funBody.toString());
	}
	
	@Override public void add(CuVvc v, CuTypeScheme ts) {
		this.v.add(v);
		this.ts.add(ts);
		//even empty functions have a {} in print out
		super.text += String.format(" , %s %s %s", v.toString(), ts.toString(),funBody.toString());
	}
	
	@Override public void add(CuVvc v, CuTypeScheme ts, CuStat s) {
		this.v.add(v);
		this.ts.add(ts);
		this.funBody=s;
		super.text += String.format(" , %s %s %s", v.toString(), ts.toString(),funBody.toString());
	}
	
	@Override public void add(CuStat s){
		
	}
	
	@Override public CuType calculateType(CuVvc v, CuTypeScheme ts, CuStat s){
		
		return null;
	}
	
}