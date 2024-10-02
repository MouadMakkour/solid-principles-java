package org.example.ocp.good;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
        // Logic for credit card payment
    }
}
