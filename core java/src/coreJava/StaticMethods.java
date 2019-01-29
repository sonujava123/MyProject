package coreJava;

public class StaticMethods {
	static void  m1()
	{
		System.out.println("in m1");
	}//m1
	
	static void m2()
	{
		System.out.println("in m2 start");
		int m=10;
		int n=20;
		System.out.println("in m2 end");
	}//m2
	
	static void m3()
	{
		System.out.println("in m3 , start ");
		int m=10;
		int n=20;
		System.out.println("m2 end");
		
	}//m3
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main start");
		m1();
		m2();
		int m=50;
		int n=60;
		System.out.println("main end");
		
		
	}

}
