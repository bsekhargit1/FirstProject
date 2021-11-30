package com.hdfc.loans.carloans;

import java.util.Date;

public   class A {
	
	public   int x=100;
	
		
 public  void m1()
{
	System.out.println("m1 from A");
}

public  static void m4() 
{
	System.out.println("static method from A");
} 

static
{
	Date dt=new Date();
	System.out.println(dt);
}

static
{
	
	System.out.println("second static block");
}




	public static void main(String[] args) {
		
		A a=new A();
		a.m1();
		m4();
		A.m4();
		
		
		
		System.out.println(a.x);

	}

}
