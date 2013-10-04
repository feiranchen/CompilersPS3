
public abstract class CuTop {
	protected String text = "";
	@Override public String toString() {
		return text.replaceAll("[ ]+", " ");
	}
}

class Top extends CuTop {
	public Top(CuProgr p) {
		super.text = p.toString();
	}
}