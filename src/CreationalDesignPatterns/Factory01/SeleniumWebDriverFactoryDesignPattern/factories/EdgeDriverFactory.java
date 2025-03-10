package CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverFactory implements WebDriverFactory {
    @Override
    public WebDriver createDriver() {
        //WebDriverManager.edgedriver().setup(); // Downloads msedgedriver if needed
        System.setProperty("webdriver.edge.driver", "path/to/msedgedriver");
        return new EdgeDriver();
    }
}