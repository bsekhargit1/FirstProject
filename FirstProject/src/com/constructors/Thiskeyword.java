package com.constructors;

public class Thiskeyword {

	

		   int a;

		   int b;

		   public void setData(int a,int b)

		{

		       this.a=a;
		       this.b=b;

		   }

		   public void showData()
		 {

		       System.out.println("Valueof A ="+a);

		       System.out.println("Valueof B ="+b);

		   }

		   public static void main(String args[]){

			   Thiskeyword obj = new Thiskeyword();

		       obj.setData(2,3);

		       obj.showData();

		   }
		}
