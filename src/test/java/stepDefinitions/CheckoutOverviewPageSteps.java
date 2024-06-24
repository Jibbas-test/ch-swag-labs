package stepDefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.CheckoutOverviewPage;
import utilities.WebDriverUtil;

public class CheckoutOverviewPageSteps {

    private WebDriver driver;
    private CheckoutOverviewPage checkoutOverviewPage;

    public CheckoutOverviewPageSteps() {
        driver = WebDriverUtil.getWebDriver();
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
    }

    @And("I click on the finish button")
    public void clickOnFinishOrderButton() throws Exception {
        checkoutOverviewPage.clickFinishOrderButton();
        Thread.sleep(1000);
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