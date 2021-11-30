package com.constructors;

public class Employee {

	int eno;
	String ename;
	float sal;

	public Employee() {
		System.out.println("no arg construnctor");
	}
	
	public Employee(int eno) {
		this();
		this.eno = eno;
		System.out.println(this.eno);
		
	}

	public Employee(int eno, String ename) {
		
		this(1);

		this.eno = eno;
		this.ename = ename;
		System.out.println(this.eno);
		System.out.println(this.ename);
		
		
	}

	public Employee(int eno, String ename, float sal) {
		
		this(11,"twoarg");
		
		
		this.eno = eno;
		this.ename = ename;
		this.sal=sal;
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Employee e4 = new Employee(12, "threearg",1000.0f);
		System.out.println(e4.eno);
		System.out.println(e4.ename);
		System.out.println(e4.sal);
		 		 
		 

	}

}
