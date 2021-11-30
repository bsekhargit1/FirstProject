package com.axis.loans.carloans;

import com.hdfc.loans.carloans.Hdfc;

public class Axis implements Rbi{

	public static void main(String[] args) {
		
		Axis h=new Axis();
		h.deposit();
		h.withdrawl();
		

	}

	@Override
	public void withdrawl() {
		System.out.println("Overridden withdrawl from axis ");
		
	}

	@Override
	public void deposit() {
		System.out.println("Overridden deposit from axis ");
		
	}

}
