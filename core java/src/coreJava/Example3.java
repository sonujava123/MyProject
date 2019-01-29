package coreJava;

public class Example3 {
	static int a;
	static int b;
	
	static void m1()
	{
		a=10;
		b=20;
		
	}//m1
	static void m2(int x , int y)
	{
		a=x;
		b=y;
	}//m2
	
	static void m3(int a , int b)
	{
		a=a;
		b=b;
	}//m3
	
	static void m4(int a , int b)
	{
		Example3.a=a;
		Example3.b=b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a+".."+b);
		System.out.println();
		
		m1();
		
		System.out.println(a+".."+b);
		System.out.println();
		m2(30 , 40);
		System.out.println(a+".."+b);
		
		System.out.println();
		
		m3(50 , 60);
		System.out.println(a+".."+b);
		System.out.println();
		m4(70 , 80);
		System.out.println(a+".."+b);
		
	}

}
