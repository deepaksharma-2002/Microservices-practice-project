package com.openClose.principle;


// High-level module shoud not depend on low-level modules. 
// Both shoud depend on abstraction

interface Payment {
	void pay();
}

// Low-level modules (details)
class CreditCardPayment implements Payment {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Payment done via Credit Card");
	}
}

class PaypalPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Payment done via paypal");
	}
	
}

// high-level module
class PaymentService {
	private Payment payment;
	
	// Dependency injenction via constructor
	public PaymentService(Payment payment) {
		this.payment = payment;
	}
	
	public void ProcessPayment() {
		payment.pay();
	}
	
}

public class DependencyInversionPrinciple {
	
	public static void main(String[] args) {
		Payment creditcardPayment = new CreditCardPayment();
		Payment paypalpayPayment = new PaypalPayment();
		
		PaymentService paymentService = new PaymentService(creditcardPayment);
		paymentService.ProcessPayment();
		PaymentService paymentService2 = new PaymentService(paypalpayPayment);
		paymentService2.ProcessPayment();
	}
	
}
