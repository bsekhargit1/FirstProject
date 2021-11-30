package com.hdfc.carloans;

public class E {
	
	int a,b;
	
	void m1()
	{
		System.out.println(a+b);
	}
	
	void m2(int m, int n)
	{
		a=m;
		b=n;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		E obj =new E();
		obj.m1();
		obj.m2(5,6);

	}

}
