package com.hdfc.personalloans;

public class VaribleTest {
	static int staticVar = 100;
	int instanceVar = 200;

	public static void main(String[] args) {
		int localVar = 300; 
		System.out.println("Value of a Static Variable is "+staticVar);
		System.out.println("Value of a Static Variable with class ref "+VaribleTest.staticVar);
		System.out.println("Value of a local Variable is "+localVar);
		
		VaribleTest var = new VaribleTest();
		
		localVar = 301;
		System.out.println("Updated value of a Local Variable is "+localVar);

						
		System.out.println("Value of a instance Variable is "+var.instanceVar);
		System.out.println("Value of a Static Variable with obj ref "+var.staticVar);
		
		var.instanceVar = 201;
		System.out.println("Updated value of a Instance Variable is "+var.instanceVar);
		staticVar = 101;
    	System.out.println("Updated value of a static Variable is "+staticVar);
		

	}

}
