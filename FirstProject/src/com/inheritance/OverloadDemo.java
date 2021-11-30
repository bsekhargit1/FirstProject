package com.inheritance;

public class OverloadDemo {
	
	public void m1(int i)
	{
		System.out.println("int value="+i);
	}
	
	public void m1(int i,int j)
	{
		System.out.println("int value="+i);
		System.out.println("int value="+j);
	}
	
	/*
	 * public void m1(String i) { System.out.println("String value="+i); }
	 */
	
	
	 // public void m1(float i) { System.out.println("float value="+i); }
	 
	
	
	  public void m1(double i) { System.out.println("double value="+i); }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadDemo obj=new OverloadDemo();
		obj.m1(10);
		obj.m1(10,20);
		obj.m1(10.1f);
		obj.m1(10.2d);
		

	}

}
