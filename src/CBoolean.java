
public class CBoolean extends CuExpr{
	Boolean data_b;
	public CBoolean(Boolean b){
		data_b=b;
		super.text=b.toString();
	}
}
