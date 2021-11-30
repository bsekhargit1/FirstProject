package com.inheritance;

public class B extends A {

	public void m2()
	{
		System.out.println("Iam m2 from class B");
	}
	
	public void m1()
	{
		System.out.println("I am overridden method m1 from class A");
	}

	public static void main(String[] args) {

    A a =new A();
    a.m1();
    
    B b= new B();
    b.m2();
    b.m1();
    
    A obj=new B();
    obj.m1();

	}

}
