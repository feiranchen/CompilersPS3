// c=cls pr=program {$p = new ClassPrg($c.c, $pr.p);};

public class ClassPrg extends CuProgr {
	CuClass c; 
	CuProgr p;
	public ClassPrg (CuClass c, CuProgr p) {
		this.c = c;
		this.p = p;
		super.text = c.toString() + " " + p.toString();
	}
}
