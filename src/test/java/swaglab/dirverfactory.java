package swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dirverfactory {
    static WebDriver driver;
    public static WebDriver getDriver() {
        driver = new ChromeDriver();
        return driver;
    }
}
