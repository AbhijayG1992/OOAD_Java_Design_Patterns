package StructuralDesignPatterns.Facade05.CheckoutFacade;

public class InventorySystem {
    public boolean checkStock(String productId) {
        System.out.println("Checking stock for product: " + productId);
        return true;
    }
}
