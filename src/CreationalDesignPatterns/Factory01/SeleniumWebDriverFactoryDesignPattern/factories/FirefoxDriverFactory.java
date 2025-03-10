package CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverFactory implements WebDriverFactory {
    @Override
    public WebDriver createDriver() {
        //WebDriverManager.firefoxdriver().setup(); // Downloads geckodriver if needed
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
        return new FirefoxDriver();
    }
}