package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public WebDriver driver;

    public static WebDriver open(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\U744880\\Desktop\\chromedriver_win32\\chromedriver.exe");
        }
        return new ChromeDriver();

    }

    public WebDriver getDriver(){
        return driver;
    }


}
