package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverUtil {

    private static WebDriver driver;

    // Edit for Mac users to the location of your chrome web driver e.g. "/usr/local/bin/chromedriver".
    private static final String webDriverLocation = "/.m2/repository/webdriver/chromedriver/";

    public static synchronized WebDriver getWebDriver() {
        if (driver == null) {
            initialiseWebDriver();
        }
        return driver;
    }

    // Maximises Chrome window
    private static void initialiseWebDriver() {
        setWebDriverLocation();
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--log-level=3");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    private static void setWebDriverLocation() {
        if (System.getProperty("webdriver.chrome.driver") == null) {
            System.setProperty("webdriver.chrome.driver", webDriverLocation);
        }
    }
}