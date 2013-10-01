// i=intf pr=program {$p = new IntfPrg($i.i, $pr.p);}

public class IntfPrg extends CuProgr {
	CuInterface i; 
	CuProgr p;
	public IntfPrg (CuInterface i, CuProgr p) {
		this.i = i;
		this.p = p;
		super.text = i.toString() + " " + p.toString();
	}
}
