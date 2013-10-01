import java.util.ArrayList;
import java.util.List;


public class Stats extends CuStat{
	protected ArrayList<CuStat> al;
	public Stats (List<CuStat> cu) {
		al = (ArrayList<CuStat>) cu;
		text = "{ " + CuMethod.listFlatten(al) + " }";
	}
}
