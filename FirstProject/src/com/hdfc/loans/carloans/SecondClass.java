package com.hdfc.loans.carloans;

public class SecondClass {
	
	int a=10,b=20,c; //properties
	
	public void add()
	
	{
		c=a+b;
		System.out.println("addition of a and b is "+c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("subtraction of a and b is "+c);	
	}
	
	public static void main(String[] args) {
		
		System.out.println("First Object");
		SecondClass obj=new SecondClass();
		obj.add();
		obj.sub();
		System.out.println(obj.c);
		
		System.out.println("Second Object");
		SecondClass obj1=new SecondClass();
		obj1.add();
		obj1.sub();
		System.out.println(obj1.c);
		
	}
	
	

}
