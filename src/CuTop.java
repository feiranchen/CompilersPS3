
public abstract class CuTop {
	protected String text = "";
	@Override public String toString() {
		return text.replaceAll("[ ]+", " ");
	}
}
