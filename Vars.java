class ClassAndLocalLevelVars{
	// Class Level Vars
	int a;
	int ab = 20;

	void show(){
		// Local Level Vars Must Be Initialized JVM WILL NOT PROVIDE ANY DEFAULT TO LOCAL LEVEL VARS
		int ac = 40;
		System.out.println(a);
		System.out.println(ab);
		System.out.println(ac);
		
	}
}

class Vars{
	public static void main(String[] args){
		ClassAndLocalLevelVars obj = new ClassAndLocalLevelVars();
		obj.show();		
	}
}