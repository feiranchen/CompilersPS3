
import java.util.List;

// s=stat {$p = new StatPrg($s.s);} 
public class StatPrg extends CuProgr {
	CuStat s;
	public StatPrg(CuStat s) {
		this.s = s;
		super.text = s.toString();
	}
	
	@Override public void add(List<CuStat> cu, CuProgr p) {
		text += CuMethod.listFlatten(cu) + " "+ p.toString();
	}
}
