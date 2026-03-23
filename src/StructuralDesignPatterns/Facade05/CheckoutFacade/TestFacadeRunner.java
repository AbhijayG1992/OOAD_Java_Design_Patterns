package StructuralDesignPatterns.Facade05.CheckoutFacade;

public class TestFacadeRunner {
    public static void main(String[] args) {
        // In automation test, without facade, we would need to interact with inventory, payment, and shipping subsystems.
        // With facade, the test is much simpler:
        CheckoutFacade checkout = new CheckoutFacade();
        checkout.completeOrder("MAC-BOOK-PRO", "123 Tech Lane", "Credit Card", 1999.99);
    }
}
