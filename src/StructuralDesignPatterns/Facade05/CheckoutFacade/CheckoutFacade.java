package StructuralDesignPatterns.Facade05.CheckoutFacade;

public class CheckoutFacade {
    private InventorySystem inventory;
    private PaymentSystem payment;
    private ShippingSystem shipping;

    public CheckoutFacade() {
        this.inventory = new InventorySystem();
        this.payment = new PaymentSystem();
        this.shipping = new ShippingSystem();
    }

    public boolean completeOrder(String productId, String address, String paymentMethod, double amount) {
        System.out.println("Starting complex checkout flow...");
        if(!inventory.checkStock(productId)) {
            System.out.println("Out of stock!");
            return false;
        }
        if(!payment.processPayment(paymentMethod, amount)) {
            System.out.println("Payment failed!");
            return false;
        }
        shipping.arrangeShipping(productId, address);
        System.out.println("Order completed successfully!");
        return true;
    }
}
