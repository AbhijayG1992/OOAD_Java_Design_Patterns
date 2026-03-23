package StructuralDesignPatterns.Decorator06.ElementDecorator;

public class DefaultWebElement implements WebElement {
    private String locator;
    public DefaultWebElement(String locator) {
        this.locator = locator;
    }
    @Override
    public void click() {
        System.out.println("Clicking element located by " + locator);
    }
    @Override
    public void sendKeys(String keys) {
        System.out.println("Typing '" + keys + "' into element located by " + locator);
    }
}
