package StructuralDesignPatterns.Decorator06.ElementDecorator;

public class LoggedElementDecorator extends ElementDecorator {
    public LoggedElementDecorator(WebElement decoratedElement) {
        super(decoratedElement);
    }
    @Override
    public void click() {
        System.out.println("[LOG]: Before click - taking screenshot...");
        super.click();
        System.out.println("[LOG]: After click - taking screenshot...");
    }
    @Override
    public void sendKeys(String keys) {
        System.out.println("[LOG]: Preparing to type data...");
        super.sendKeys(keys);
    }
}
