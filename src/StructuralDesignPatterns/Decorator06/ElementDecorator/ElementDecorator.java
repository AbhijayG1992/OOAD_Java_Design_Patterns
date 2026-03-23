package StructuralDesignPatterns.Decorator06.ElementDecorator;

public abstract class ElementDecorator implements WebElement {
    protected WebElement decoratedElement;
    public ElementDecorator(WebElement decoratedElement) {
        this.decoratedElement = decoratedElement;
    }
    @Override
    public void click() {
        decoratedElement.click();
    }
    @Override
    public void sendKeys(String keys) {
        decoratedElement.sendKeys(keys);
    }
}
