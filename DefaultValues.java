class Hello{
	Byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	boolean g;
	char h;
	void show(){
		System.out.println("Default values of various types: ");
		System.out.println(a);
		System.out.println(b);		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);	
	}
}


class DefaultValues{
	public static void main(String[] args){
		Hello obj = new Hello();
		obj.show();	
	}
}