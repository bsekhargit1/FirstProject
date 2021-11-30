package com.hdfc.goldloans;


import com.hdfc.carloans.A;

public class C extends A
{

public void m3()
	
	{
		System.out.println("Iam m3 from class C");
	}

	public static void main(String[] args) {	

	C c=new C();
	//A a=new A();
	//a.m1();	
	//c.m2();
	c.m3();
	//b.m1();
	//b.m2();
	c.m1();
	
	//System.out.println(a.x);
	System.out.println(c.x);

   }
  }
