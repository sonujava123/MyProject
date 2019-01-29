package pak;

public class MainM {
	
	static int a=12;
	public MainM() {
		// TODO Auto-generated constructor stub
	}

	
}

class Main2{
	
	
    public static void main(String[] args) {
    	
    	A a1=new A();
    	a1.m1();
    	B b=new B();
    	b.m2();
    	System.out.println(MainM.a);
		
	}
	
}

class A{
	
	
	void m1(){
		
		MainM.a=2;
	}
}

class B{
	
	void m2(){
		
		MainM.a=3;
	}
}