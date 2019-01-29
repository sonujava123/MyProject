package coreJava;

public class Example {

	
	static int a= m1();
	static int m1()
	{
		System.out.println("variable a is Static ");
		return 10;
	}
	
	      //static int b=m2();
	static int m2()
	{
		System.out.println("variable b is created");
		return 20;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main");
		System.out.println("a.."+a);
		System.out.println("b.."+b);
		
	}
	 static int b=m2();
	 
//	 static void m3()
//	 {
//		 System.out.println("m3");
//	 }

}
