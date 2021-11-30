package com.axis.loans.carloans;



public class Icici implements Rbi{

	public static void main(String[] args) {
		
		Icici i=new Icici();
		i.deposit();
		i.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("Overridden withdrawl from icici ");
		
	}

	@Override
	public void deposit() {
		System.out.println("Overridden deposit from icici ");
		
	}

}
