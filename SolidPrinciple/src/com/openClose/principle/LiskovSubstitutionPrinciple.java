package com.openClose.principle;

interface Flyable {
	void fly();
}

class Bird {
}

 class peigin extends Bird implements Flyable {
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I can fly!");
		
	}
}

class pegbin extends Bird {
	//  penguins don't implement flyable
}

public class LiskovSubstitutionPrinciple {
	public static void main(String[] args) {
		// subclass shoud be replacable with their parent class without affecting the application's correctness.
		peigin peigin = new peigin();
		peigin.fly();
	}
}
