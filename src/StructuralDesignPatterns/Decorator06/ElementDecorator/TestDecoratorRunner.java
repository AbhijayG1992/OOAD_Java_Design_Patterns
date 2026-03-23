package StructuralDesignPatterns.Decorator06.ElementDecorator;

public class TestDecoratorRunner {
    public static void main(String[] args) {
        // A normal web element interaction
        WebElement rawButton = new DefaultWebElement("//button[@id='submit']");
        System.out.println("--- Normal Interaction ---");
        rawButton.click();

        // Adding logging dynamically without changing the base element implementation
        WebElement loggedButton = new LoggedElementDecorator(new DefaultWebElement("//button[@id='submit']"));
        System.out.println("\n--- Decorated Interaction ---");
        loggedButton.click();
    }
}
