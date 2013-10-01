public class VTypeInter extends CuType {
	CuType data_t1, data_t2;
	public VTypeInter(CuType t1, CuType t2){
		data_t1=t1;
		data_t2=t2;
		super.text=t1.toString()+" \u222A "+t2.toString();
	}

}
