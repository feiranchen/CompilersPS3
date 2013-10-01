import java.util.List;


public abstract class CuProgr {
	protected String text = "";
	@Override public String toString() {
		return text;
	}
	public void add (String var, CuTypeScheme ts, CuStat s){};
	public void add (CuProgr p){}
	public void add(List<CuStat> cu, CuProgr p) {
		// TODO Auto-generated method stub
		
	}
	public void add(CuStat s) {
		// TODO Auto-generated method stub
		
	};
}
