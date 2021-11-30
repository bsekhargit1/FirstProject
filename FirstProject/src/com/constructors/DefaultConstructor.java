package com.constructors;

public class DefaultConstructor {

	
		int id;
		float id1;
		long id2;
		String id3;
		boolean id4;
		void display()
		{
	    	System.out.println(id);
	    	System.out.println(id1);
	    	System.out.println(id2);
	    	System.out.println(id3);
	    	System.out.println(id4);
		}
		public static void main(String args[]){
			DefaultConstructor s1=new DefaultConstructor();
	    	s1.display();
	    	System.out.println(s1.id);
	    	System.out.println(s1.id1);
	    	System.out.println(s1.id2);
	    	System.out.println(s1.id3);
	    	System.out.println(s1.id4);
		}
	}

