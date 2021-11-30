package com.inheritance1;

import com.inheritance.A;
//import com.inheritance.B;

public class C extends A {

	void m3()
	{
		System.out.println("Iam m3 from class C");
	}
	public static void main(String[] args) {

		A a =new A();
		a.m1();
		
		C c=new C();
		c.m3();
		c.m1();
	}

}
