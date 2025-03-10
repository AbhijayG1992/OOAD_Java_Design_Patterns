package CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.test;

import CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.factories.WebDriverFactory;
import CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.utils.WebDriverFactoryProvider;
import org.openqa.selenium.WebDriver;

public class WebDriverFactoryTestMain {
    private WebDriver driver;

    public static void main(String args[]){
        WebDriverFactoryTestMain test = new WebDriverFactoryTestMain();
        test.setUp();
        test.testWebDriverFactory();
        test.tearDown();


    }

    public void setUp() {
        // Get the appropriate factory based on the browser type
        WebDriverFactory factory = WebDriverFactoryProvider.getFactory("chrome");
        // Create the WebDriver instance
        driver = factory.createDriver();
    }


    public void testWebDriverFactory() {
        driver.get("https://www.google.com");
        System.out.println("Page title: " + driver.getTitle());
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
