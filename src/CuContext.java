import java.util.Map;
import java.util.HashMap;

public class CuContext {
	private Map<String,CuType> mVariables = new HashMap<String,CuType>();
	private Map<String,CuFunC> mFunctions = new HashMap<String,CuFunC>();

	public CuType getVariable(String name) { return mVariables.get(name); }
	public CuFunC getFunction(String name) { return mFunctions.get(name); }
	public void updateType(String name, CuType value){ mVariables.put(name, value);}
	public void updateFunction(String name, CuFunC value){ mFunctions.put(name, value);}
	
	private Map<String,CuClassC> mClasses = new HashMap<String,CuClassC>();
	public CuClassC getClass(String name) { return mClasses.get(name); }
}
