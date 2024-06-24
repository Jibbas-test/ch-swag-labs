package stepDefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePage;
import utilities.WebDriverUtil;

import static org.junit.Assert.assertTrue;

public class CheckoutCompletePageSteps {

    private WebDriver driver;
    private CheckoutCompletePage checkoutCompletePage;

    public CheckoutCompletePageSteps() {
        driver = WebDriverUtil.getWebDriver();
        checkoutCompletePage = new CheckoutCompletePage(driver);
    }

    @Then("I see the order complete message")
    public void orderCompleteMessageIsDisplayed() throws Exception {
        assertTrue(checkoutCompletePage.orderCompleteMessage.getText().contains("THANK YOU FOR YOUR ORDER"));
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

}