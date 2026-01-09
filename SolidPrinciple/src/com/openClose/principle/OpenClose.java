package com.openClose.principle;

abstract class discount {
	public abstract double calculate(double price);
}

class simpleDiscount extends discount {
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		double dis = price*0.9;
		return dis;
	}
}

class premimumDiscount extends discount {
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		double dis = price*0.8;
		return dis;
	}
	
}

public class OpenClose {

	public static void main(String[] args) {
		discount discount = new simpleDiscount();
		discount discount2 = new premimumDiscount();
		
		double dis =  discount.calculate(100);
		double dis2 =  discount2.calculate(100);
		
		System.out.println(dis);
		System.out.println(dis2);
	}

}
