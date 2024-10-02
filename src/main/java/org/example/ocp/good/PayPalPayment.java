package org.example.ocp.good;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
        // Logic for PayPal payment
    }
}
