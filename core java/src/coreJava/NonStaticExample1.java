package coreJava;

////recursive method call

//public class NonStaticExample1 {
//	
//	static void m1()
//	{
//		System.out.println("m1");
//		m1();
//	}
//	
//	public static void main(String[] arges)
//	{
//		System.out.println("main");
//		m1();
//	}
//	
//	
//	
//
//}

////recursive  constructor call

//public class NonStaticExample1
//{
//public 	NonStaticExample1()
//	{
//	System.out.println("constructor");
//	NonStaticExample1 ns=new NonStaticExample1();
//	
//		
//	}
//
//public static void main(String[] arges)
//{
//	System.out.println("main");
//	NonStaticExample1 ns=new NonStaticExample1();
//	
//}
//
//}
//public class NonStaticExample1
//{
//	void m1()
//	{
//		System.out.println("m1 start");
//		m1();
//		System.out.println("end of m1()");
//	}//m1
//	
//	public static void main(String[] arges)
//	{
//		System.out.println("main start");
//		NonStaticExample1 ns=new NonStaticExample1();
//		System.out.println("object is created");
//		ns.m1();
//		System.out.println("main end");
//	}//main method
//	
//	int x=m2();
//	int m2()
//	{
//		System.out.println("NSV x");
//		return 50;
//	}//m2
//	NonStaticExample1()
//	{
//		System.out.println("Const start ");
//		System.out.println("const end");
//	}//const
//	
//}
public class NonStaticExample1
{
	public static void main(String[] arges)
	{
		System.out.println("main start");
		NonStaticExample1 ns=new NonStaticExample1();
		 System.out.println("object is created");
		 System.out.println("end of main");
	}
	
	int x=m2();
	
	int m2()
	{
		System.out.println("NSV x");
		System.out.println("end of m2");
		return 10;
	}//m2
	{
	System.out.println("NSB start");
	System.out.println("NSB end");
	}//block
	NonStaticExample1()
	{
		System.out.println("constructor start");
		NonStaticExample1 ns=new NonStaticExample1();
		System.out.println("end of constructor");
	}
	
}



