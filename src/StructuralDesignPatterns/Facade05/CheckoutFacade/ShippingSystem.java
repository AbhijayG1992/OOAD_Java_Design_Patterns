package StructuralDesignPatterns.Facade05.CheckoutFacade;

public class ShippingSystem {
    public void arrangeShipping(String productId, String address) {
        System.out.println("Arranging shipping for product " + productId + " to " + address);
    }
}
