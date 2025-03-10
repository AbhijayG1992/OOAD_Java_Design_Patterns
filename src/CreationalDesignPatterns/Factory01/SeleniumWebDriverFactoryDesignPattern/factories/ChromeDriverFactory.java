package CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverFactory implements WebDriverFactory {
    @Override
    public WebDriver createDriver() {
        //WebDriverManager.chromedriver().setup(); // Downloads chromedriver if needed
        System.setProperty("webdriver.chrome.driver", "./src/CreationalDesignPatterns/Factory/SeleniumWebDriverFactoryDesignPattern/resources/chromedriver.exe");
        return new ChromeDriver();
    }
}