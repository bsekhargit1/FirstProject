package com.axis.loans.carloans;



public interface Rbi {
	
	public void withdrawl();
	public void deposit();
	
	public static void main(String[] args) {
		
		Rbi i;
		i=new Axis();
		i.withdrawl();
		i.deposit();
		
		i=new Icici();
		i.withdrawl();
		i.deposit();
		
		 
	}

}
