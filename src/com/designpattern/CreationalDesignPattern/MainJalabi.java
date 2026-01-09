package com.designpattern.CreationalDesignPattern;

public class MainJalabi {
	public static void main(String[] args) {
		Jalabi jalabi1 = Jalabi.getJalabi();
		System.out.println(jalabi1.hashCode());
		Jalabi jalabi2 = Jalabi.getJalabi();
		System.out.println(jalabi2.hashCode());

	}
}

class Jalabi {
	
	// Egar way of creating singleton object
	private static Jalabi jalabi = new Jalabi();
	
	public static Jalabi getJalabi() {
		return jalabi;
	}
	
}
