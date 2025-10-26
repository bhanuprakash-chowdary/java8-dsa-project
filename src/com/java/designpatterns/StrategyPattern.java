package com.java.designpatterns;

//The Strategy pattern defines a family of algorithms, encapsulates each one, 
//and makes them interchangeable. It allows a client to choose the appropriate algorithm at runtime.
public class StrategyPattern {

	public static void main(String[] args) {
		
		ShoppingCart shoppingCart=new ShoppingCart();
		
		shoppingCart.setPaymentStrategy(new CreditCardPayment());
		
		shoppingCart.checkout(100);
	}
}
interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
    	 System.out.println("Payment Success using CreditCard.");
    }
}

class BitcoinPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment Success using Bitcoin.");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment Success using PayPal.");
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}