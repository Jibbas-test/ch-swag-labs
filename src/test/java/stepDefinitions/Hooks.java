package stepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.WebDriverUtil;

public class Hooks {

    public static WebDriver driver;

    /**
     * Before each test is run a browser instance is created.
     */
    @Before
    public void setup() {
        driver = WebDriverUtil.getWebDriver();
    }

    /**
     * Takes screenshot after each failed scenario step.
     */
    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }
    }

    /**
     * Closes browser after tests are run.
     */
    @AfterAll
    public static void tearDown() {
        //close the driver/browser
        driver.quit();
    }

}