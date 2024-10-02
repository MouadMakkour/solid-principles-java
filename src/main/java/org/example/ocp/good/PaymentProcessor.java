package org.example.ocp.good;

/*
The PaymentProcessor will now be closed for modification.
Instead of changing this class to handle new payment methods,
it will use the PaymentMethod interface to delegate the payment process.
You can extend the system by adding new payment method classes without touching the PaymentProcessor
 */
public class PaymentProcessor {

    // Process payment using any payment method
    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }
}
