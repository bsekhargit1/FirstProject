package com.axis.loans.carloans;

import com.hdfc.loans.carloans.SecondClass;

public class Second {
	
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
		Second obj=new Second();
		obj.add();
		obj.sub();
		System.out.println(obj.c);
		
		System.out.println("Second Object");
		Second obj1=new Second();
		obj1.add();
		obj1.sub();
		System.out.println(obj1.c);
		
		
	}

}
