
public class CInteger extends CuExpr {
	Integer data_i;
	public CInteger(Integer i){
		data_i=i;
		super.text=i.toString();
	}
}
