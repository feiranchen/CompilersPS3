import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class CuContext {
	private Map<String,CuClass> mClasses;
	//kind context theta
	private List<String> mKind;
	//function context is a map with name and type scheme pairs
	private Map<String,CuTypeScheme> mFunctions;
	//mVariable are the immutable variables
	private Map<String,CuType> mVariables;
	//mMutVariables are the mutable variables
	private Map<String,CuType> mMutVariables;
	
	public CuContext () {
		this.mClasses = new HashMap<String,CuClass>();
		this.mKind = new ArrayList<String>();
		this.mFunctions = new HashMap<String,CuTypeScheme>();
		//mVariable are the immutable variables
		this.mVariables = new HashMap<String,CuType>();
		//mMutVariables are the mutable variables
		this.mMutVariables = new HashMap<String,CuType>();
	}
	//copy constructor
	public CuContext (CuContext context) {
		this.mClasses = new HashMap<String,CuClass>(context.mClasses);
		this.mKind = new ArrayList<String>(context.mKind);
		this.mFunctions = new HashMap<String,CuTypeScheme>(context.mFunctions);
		//mVariable are the immutable variables
		this.mVariables = new HashMap<String,CuType>(context.mVariables);
		//mMutVariables are the mutable variables
		this.mMutVariables = new HashMap<String,CuType>(context.mMutVariables);
	}


	public void updateKind(String name){ mKind.add(name); }
	public CuType getVariable(String name) { return mVariables.get(name); }
	public CuType getMutVariable(String name) { return mMutVariables.get(name); }
	public CuTypeScheme getFunction(String name) { return mFunctions.get(name); }
	public void updateType(String name, CuType value){ mVariables.put(name, value);}
	public void updateMutType(String name, CuType value){ mMutVariables.put(name, value);}
	public void updateFunction(String name, CuTypeScheme value){ mFunctions.put(name, value);}
	public boolean inVar (String name) {return this.mVariables.containsKey(name); }
	public boolean inMutVar (String name) {return this.mMutVariables.containsKey(name); }

	public List<String> getKindList() { return mKind; }
	
	public ClsContextEle getClass(String name) { return mClasses.get(name); }
	
	//this function merges the mutable variables to immutable variables
	//this function is created because a lot of times we don't need to distinguish immutable variables
	//and mutable variables, so we just use the immutable variables
    public void mergeVariable () {
    	this.mVariables.putAll(this.mMutVariables);
    	this.mMutVariables = new HashMap<String,CuType>();
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
    //check if this type parameter is in kind context
    public boolean hasVTypePara(String name) {
    	return this.kc.contains(name);
    }
    public void updateKc(List<String> kc) {
    	this.kc.addAll(kc);
    }
    public void updateMutType(Map<String,CuType> mutVar){ mMutVariables.putAll(mutVar);}
    
    
    private void init(){

		//======Class init=========

		//private Map<String,CuClass> mClasses;
		//public Cls(Vc name, List<String> kc, Map<CuVvc, CuType> tc, CuContext outsideCtxt);
		final CuContext ctxt=new CuContext();
		class VBoolean extends Cls {
			Boolean v=false;
			public VBoolean(Boolean val) {
				super("Boolean", new ArrayList<String>(), new HashMap<String, CuType>(), ctxt);
				if (val instanceof Boolean) { v=val; }
				else { throw new NoSuchTypeException();}
			}

			public boolean calculateType() { return v; }
		}

		class VInteger extends Cls {
			Integer v=0;
			public VInteger(Integer val) {
				super("Integer", new ArrayList<String>(), new HashMap<String, CuType>(), ctxt);
				if (val instanceof Integer) { v=val; }
				else { throw new NoSuchTypeException();}
			}
			public int calculateType() { return v; }
		}

		class VCharacter extends Cls {
			Character c;
			public VCharacter(Character val) {
				super("Character", new ArrayList<String>(), new HashMap<String, CuType>(), ctxt);
				if (val instanceof Character) { c=val; }
				else { throw new NoSuchTypeException();}
			}
			public char calculateType() { return c; }
		}
		
		class VString extends Cls {
			String v="";
			public VString(String val) {
				super("String", new ArrayList<String>(), new HashMap<String, CuType>(), ctxt);
				if (val instanceof String) { v=val; }
				else { throw new NoSuchTypeException();}
			}
		}
		

		class VIterable extends Cls {
			public VIterable(List<String> kc) {
				super("Iterable", kc, new HashMap<CuVvc, CuType>(), ctxt);
				if (val instanceof String) { v=val; }
				else { throw new NoSuchTypeException();}
			}
		}

		classCtxt.put(key, value)
		
		//=====Function init=======
		//character
		HashMap<CuVvc, CuType> tempclassmapForCharFun = new HashMap<CuVvc, CuType>();
		tempclassmapForChar.put(new Vv("unicode"),new VClass("Character",new ArrayList<CuType>());
		CuFun chararcterFun= new Function(new Vv("character"),
					new TypeScheme(new ArrayList({"unicode"}), 
							tempclassmapForCharFun, 
							new VClass("Character",new ArrayList<CuType>()),
				  new EmptyBody()); 
		);
		//string
		funCtxt.put(character, value)
		//=====Type init===========
	}
}

    /*
class ClsContextEle {
	String keyword;
	//class/interface names
	String name;
	//kind contexts
	List<String> kc;
	CuType superType;
	//function context
	Map<String,CuTypeScheme> mFunctions;
	
	public ClsContextEle () {
		this.kc = new ArrayList<String>();
		this.superType = CuType.top;
		this.mFunctions = new HashMap<String, CuTypeScheme>();
	}
	*/
}
