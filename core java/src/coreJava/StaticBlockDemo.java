package coreJava;

//public class StaticBlockDemo {
//	
//	static 
//	{
//		System.out.println("sb2");
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		System.out.println("main");
//	}
//	static 
//	{
//		System.out.println("sb2");
//	}
//
//}

//public class StaticBlockDemo
//{
//	static 
//	{
//		System.out.println("sb2");
//	}
//	static int a=m1();
//	
//	static int m1()
//	{
//		System.out.println("sv created ");
//		return 10;
//	}
//	public static void  main(String[] arges)
//	{
//		System.out.println("main");
//	}
//}

public class StaticBlockDemo
{
	static 
	{
		System.out.println("sb start");
		main(new String[0]);
		System.out.println("sb end");
		System.out.println();
			
		}
	public static void main(String[] arges)
	{
		System.out.println("main");
	}
}

