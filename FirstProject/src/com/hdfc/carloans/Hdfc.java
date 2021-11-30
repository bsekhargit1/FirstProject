package com.hdfc.carloans;

public class Hdfc implements Rbi {

	public static void main(String[] args) {

    Hdfc h=new Hdfc();
    h.withdrawl();
    h.deposit();

	}

	@Override
	public void withdrawl() {

		System.out.println("Iam hdfc withdrawl method overriden from Rbi");
		
	}

	@Override
	public void deposit() {

		System.out.println("Iam hdfc deposit method overriden from Rbi");
		
	}

}
