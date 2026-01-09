package com.openClose.principle;

// A class shoud not be forced to implement interfaces it does't use

interface workabale {
	void work();
}
interface eatable{
	void eat();
}

class HumenWorker implements workabale, eatable {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Humen is eating");
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Human is working");
		
	}
}

class RobotWorker implements workabale {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Robot is working");
		
	}
	
}

public class InterfaceSegregationPrinciple {
	public static void main(String[] args) {
		HumenWorker worker = new HumenWorker();
		RobotWorker robotWorker = new RobotWorker();
		
		worker.eat();
		worker.work();
		
		robotWorker.work();
	}
}
