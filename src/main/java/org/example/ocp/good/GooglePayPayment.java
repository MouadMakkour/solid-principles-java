package org.example.ocp.good;

public class GooglePayPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing Google Pay payment...");
        // Logic for Google Pay payment
    }
}
