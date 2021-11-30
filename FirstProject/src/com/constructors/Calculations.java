package com.constructors;

public class Calculations {
	
	int a;
	int b;
	int c;
	
	

	public Calculations(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		// TODO Auto-generated constructor stub
	}

	public void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a+b;
		System.out.println("addition="+c);
	}
	
	public void sub(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a-b;
		System.out.println("subtraction="+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculations c1=new Calculations(30,20);
		c1.add(10,20);
		c1.sub(30,20);

	}

}