package CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.test;


import CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.factories.WebDriverFactory;
import CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.utils.WebDriverFactoryProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverFactoryTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Get the appropriate factory based on the browser type
        WebDriverFactory factory = WebDriverFactoryProvider.getFactory("chrome");
        // Create the WebDriver instance
        driver = factory.createDriver();
    }

    @Test
    public void testWebDriverFactory() {
        driver.get("https://www.google.com");
        System.out.println("Page title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
