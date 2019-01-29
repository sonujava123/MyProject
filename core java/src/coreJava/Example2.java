package coreJava;

//public class Example2 {
//	
//	static int a;
//	static void m1(int x)
//	{
//		a=x;
//		System.out.println(a);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(a);
//		m1(50);
//		System.out.println(a);
//
//	}
//
//}

//public class Example2
//{
//	static int a;
//	
//	static void m1(int a)
//	{
//		a=a;
//		System.out.println(a);
//	}
//	public static void main(String[] arges)
//	{
//		System.out.println(a);
//		m1(50);
//		System.out.println(a);
//	}
//}

//class Example2
//{
//	static int a;
//	static void m1(int a)
//	{
//		Example2.a=a;
//		System.out.println(a);
//	}
//	public static void main(String[] arges)
//	{
//		System.out.println(a);
//		m1(50);
//		System.out.println(a);
//	}
//	
//}
class Example2
{
	static int a;
	static void m1(int a)
	{
		a=Example2.a;
		System.out.println(a);
	}
	public static void main(String[] arges)
	{
		System.out.println(a);
		m1(50);
		System.out.println(a);
	}
}