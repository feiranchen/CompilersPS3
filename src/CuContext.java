import java.util.Map;
import java.util.HashMap;

public class CuContext {
	//mVariable are the immutable variables
	private Map<String,CuType> mVariables;
	//mMutVariables are the mutable variables
	private Map<String,CuType> mMutVariables;
	private Map<String,CuFunC> mFunctions;
	private Map<String,CuClassC> mClasses;
	
	public CuContext () {
		//mVariable are the immutable variables
		this.mVariables = new HashMap<String,CuType>();
		//mMutVariables are the mutable variables
		this.mMutVariables = new HashMap<String,CuType>();
		this.mFunctions = new HashMap<String,CuFunC>();
		this.mClasses = new HashMap<String,CuClassC>();
	}
	//copy constructor
	public CuContext (CuContext context) {
		//mVariable are the immutable variables
		this.mVariables = new HashMap<String,CuType>(context.mVariables);
		//mMutVariables are the mutable variables
		this.mMutVariables = new HashMap<String,CuType>(context.mMutVariables);
		this.mFunctions = new HashMap<String,CuFunC>(context.mFunctions);
		this.mClasses = new HashMap<String,CuClassC>(context.mClasses);
	}

	public CuType getVariable(String name) { return mVariables.get(name); }
	public CuType getMutVariable(String name) { return mMutVariables.get(name); }
	public CuFunC getFunction(String name) { return mFunctions.get(name); }
	public void updateType(String name, CuType value){ mVariables.put(name, value);}
	public void updateMutType(String name, CuType value){ mMutVariables.put(name, value);}
	public void updateFunction(String name, CuFunC value){ mFunctions.put(name, value);}
	public boolean inVar (String name) {return this.mVariables.containsKey(name); }
	public boolean inMutVar (String name) {return this.mMutVariables.containsKey(name); }
	
	public CuClassC getClass(String name) { return mClasses.get(name); }
	
	//this function merges the mutable variables to immutable variables
	//this function is created because a lot of times we don't need to distinguish immutable variables
	//and mutable variables, so we just use the immutable variables
    public void mergeVariable () {
    	this.mVariables.putAll(this.mMutVariables);
    }
    //weakens the mutable type contexts to make it consistent with context
    public void weakenMutType (CuContext context) {
    	Map<String,CuType> new_mMutVariables = new HashMap<String,CuType>();
    	for (String key : this.mMutVariables.keySet()) {
    		//only keeps the mutable variables which exist in both
    		if (context.inMutVar(key)) {
	    		CuType t1 = this.getMutVariable(key);
	    		CuType t2 = context.getMutVariable(key);
	    		CuType tCom = CuType.commonParent(t1, t2);
	    		new_mMutVariables.put(key, tCom);
    		}
    	}
    	this.mMutVariables = new_mMutVariables;
    }
}
