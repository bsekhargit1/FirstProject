package com.constructors;

public class ConstructorsDemo2 {

	
		int id;
		ConstructorsDemo2()
		{
	    	id=1;
	    	System.out.println("id="+id);
		}
		public static void main(String args[]){

			ConstructorsDemo2 s1=new ConstructorsDemo2();
	    	System.out.println("id value="+s1.id);

		}
	}