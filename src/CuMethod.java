import java.util.ArrayList;
import java.util.List;


public class CuMethod {
	protected static <T> String printList(String l, List<T> es, String r, String i) {
		if (es == null) return " "+l + " " + r+" ";
		String s = " "+l + " ";
		for (T e : es) {
			s += e.toString() + " "+i + " ";
		}
		int j = s.lastIndexOf(i+" ");
		if (j > 1) s = s.substring(0, j);
		s +=( r+" " );
		return s;
	}
	
	protected static String listFlatten(List<CuStat> cs) {
		if(cs == null) return " ";
		String s=" ";
		if (cs == null || cs.size() == 0) return s;
		for (CuStat t : cs) {
			if (t instanceof Stats) s+=listFlatten((ArrayList<CuStat>) ((Stats)t).al);
			else s+= t.toString() + " ";
		}
		return s;
	}
	
	protected static void P(String s) {
		System.out.println(s);
	}
}
