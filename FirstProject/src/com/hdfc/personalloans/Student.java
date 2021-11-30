package com.hdfc.personalloans;

public class Student {
	
	int rollno;//instance variable
	String name;
	int a=1;
	static String college ="IIT";//static variable
	

	 void add(int r,String n)
    {

 	   rollno=r;
 	   name=n;
 	  System.out.println(Student.college);

 	   }
	

	void display ()
	{
	System.out.println(rollno+" "+name+" "+college);
	 System.out.println(a);
	}


	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2=  new Student();
    	
    	
    	
    	
    	
    	s1.add(1,"ramesh");
    	s2.add(2,"chandu");
    	s1.display ();
    	s2.display ();
    	
	

	}
	
	
}
