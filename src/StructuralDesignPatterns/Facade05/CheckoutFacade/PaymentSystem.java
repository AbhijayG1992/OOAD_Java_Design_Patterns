package StructuralDesignPatterns.Facade05.CheckoutFacade;

public class PaymentSystem {
    public boolean processPayment(String method, double amount) {
        System.out.println("Processing " + method + " payment for amount $" + amount);
        return true;
    }
}
