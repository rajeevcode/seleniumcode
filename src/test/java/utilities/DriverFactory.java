package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public static WebDriver open(String browserType) {

        if (browserType.equalsIgnoreCase("firefox")) {
            //code for firefox
            return new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("chrome")) {
            //code for chrome
            return new ChromeDriver();
        } else {
            //code for safari
            return new SafariDriver();
        }
    }
}