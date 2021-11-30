package com.hdfc.personalloans;

public class Static_varibale {
	
	static int staticVar=90 ; // static variable
	
	public static void main(String[] args) {
		
		System.out.println("Value of a Static Variable is "+staticVar);
		System.out.println("Value of a Static Variable with class reference "+Static_varibale.staticVar);
		Static_varibale var = new Static_varibale();
		System.out.println("Value of a Static Variable with object reference "+var.staticVar);
	}

}
