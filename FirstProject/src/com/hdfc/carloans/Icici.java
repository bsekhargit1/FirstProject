package com.hdfc.carloans;

public class Icici implements Rbi{

	public static void main(String[] args) {
		Icici i=new Icici();
	    i.withdrawl();
	    i.deposit();

	}

	@Override
	public void withdrawl() {
		System.out.println("Iam icici withdrawl method overriden from Rbi");
		
	}

	@Override
	public void deposit() {
		System.out.println("Iam icici deposit method overriden from Rbi");
		
	}

}
