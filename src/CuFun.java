import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//struct for functions
public abstract class CuFun {
	//public void add(CuVvc v, CuTypeScheme ts) {}
	//public void add(CuVvc v, CuTypeScheme ts, CuStat s) {}
	//public void add(CuStat s){}
	public abstract CuType calculateType(String v, CuTypeScheme ts, CuStat s);
}

class Function extends CuFun {
	public String v;
	public CuTypeScheme ts;
	public CuStat funBody = new Stats(new ArrayList<CuStat>());

	public Function (String v_input, CuTypeScheme ts_input, CuStat s_input){
		v = v_input;
		ts = ts_input;
		funBody=s_input;
	}

	
	//Figure 7: Type checking Returns
	@Override public CuType calculateType(String v, CuTypeScheme ts, CuStat s){
		
		return null;
	}
	
//	@Override public void add(CuVvc v, CuTypeScheme ts) {
//		this.v.add(v);
//		this.ts.add(ts);
//	}
//	
//	@Override public void add(CuVvc v, CuTypeScheme ts, CuStat s) {
//		this.v.add(v);
//		this.ts.add(ts);
//		this.funBody=s;
//	}
	
	
}