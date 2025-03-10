package CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.factories;

import org.openqa.selenium.WebDriver;

public interface WebDriverFactory {
    WebDriver createDriver();
}