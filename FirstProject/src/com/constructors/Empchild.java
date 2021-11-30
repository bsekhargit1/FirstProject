package com.constructors;

public class Empchild extends Employee{
	
	String location;

	public Empchild(String location) {
		super();
		this.location=location;
		System.out.println(location);
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empchild obj=new Empchild("hyd");

	}

}
