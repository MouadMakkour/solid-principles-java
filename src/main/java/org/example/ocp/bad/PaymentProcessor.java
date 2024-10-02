package org.example.ocp.bad;


//Every time a new payment method is introduced (e.g., Apple Pay),
// you must modify the PaymentProcessor class to add the new payment type.
public class PaymentProcessor {

    public void processPayment(String paymentType) {
        if (paymentType.equals("CREDIT_CARD")) {
            processCreditCardPayment();
        } else if (paymentType.equals("PAYPAL")) {
            processPayPalPayment();
        } else if (paymentType.equals("GOOGLE_PAY")) {
            processGooglePayPayment();
        }
    }

    private void processCreditCardPayment() {
        System.out.println("Processing credit card payment...");
        // Logic for credit card payment
    }

    private void processPayPalPayment() {
        System.out.println("Processing PayPal payment...");
        // Logic for PayPal payment
    }

    private void processGooglePayPayment() {
        System.out.println("Processing Google Pay payment...");
        // Logic for Google Pay payment
    }
}

