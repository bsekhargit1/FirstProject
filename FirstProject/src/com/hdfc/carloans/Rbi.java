package com.hdfc.carloans;

public interface Rbi {
	
	public void withdrawl();
	public void deposit();
	
	public static void main(String[] args) {
		
		//Rbi i=new Rbi();
		
		Rbi i;
		
		
		i=new Hdfc();
	    i.withdrawl();
	    i.deposit();
	    
	    
	    
	    i=new Icici();
	    i.withdrawl();
	    i.deposit();
		
	}

}
