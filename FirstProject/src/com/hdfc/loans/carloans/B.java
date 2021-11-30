package com.hdfc.loans.carloans;

public class B extends A{
	
	
	public void m1()
	{
		System.out.println("overriden m1 in B class");
	}
	public void m2()
{
	System.out.println("m2 from B");
}
	public  static void m4() 
	{
		System.out.println("static method from B");
	} 

	
	static
	{
		
		System.out.println("third block");
	}
	public static void main(String[] args) {
		
		A a=new A();
		a.m1();
		m4();
		A.m4();
		B.m4();
		a.x=200;
		System.out.println(a.x);
		
		B b=new B();
		b.m2();
		b.m1();
		
		System.out.println(b.x);
		
		

	}
	
	

}