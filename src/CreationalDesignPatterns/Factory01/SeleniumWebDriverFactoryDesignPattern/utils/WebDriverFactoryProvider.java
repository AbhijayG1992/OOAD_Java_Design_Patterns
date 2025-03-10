package CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.utils;


import CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.factories.ChromeDriverFactory;
import CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.factories.EdgeDriverFactory;
import CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.factories.FirefoxDriverFactory;
import CreationalDesignPatterns.Factory01.SeleniumWebDriverFactoryDesignPattern.factories.WebDriverFactory;

public class WebDriverFactoryProvider {
    public static WebDriverFactory getFactory(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                return new ChromeDriverFactory();
            case "firefox":
                return new FirefoxDriverFactory();
            case "edge":
                return new EdgeDriverFactory();
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }
}
