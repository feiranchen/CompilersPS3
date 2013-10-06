
public abstract class CuVvc {
	protected String text = "";
	@Override public String toString() {
		return text;
	}
	public boolean equals(CuVvc that) { return text.equals(that.text); }
}

class Vc extends CuVvc{
	public Vc (String s) {
		text = s;
	}
}

class Vv extends CuVvc{
	public Vv (String s){
		text=s;
	}
}

class Vvc extends CuVvc{
	public Vvc(String s){
		text=s;
	}
}