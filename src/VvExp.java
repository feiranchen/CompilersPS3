import java.util.List;


public class VvExp extends CuExpr{
	public VvExp(String str){
		super.text=str;
	}
	
	@Override public void add(List<CuType> pt, List<CuExpr> es){
		super.text += CuMethod.printList("<", pt, ">", ",")+CuMethod.printList("(", es, ")", ",");
	}
	
}
