package com.hdfc.carloans;

 public  class B extends A
 
 {

public void m2()
	
	{
		System.out.println("Iam m2 from class B");
	}

	public static void main(String[] args) {
		A a=new A();

	B b=new B();
	b.m2();
	b.m1();
	a.m1();
	System.out.println(a.x);
	System.out.println(b.x);
	

   }
  }
