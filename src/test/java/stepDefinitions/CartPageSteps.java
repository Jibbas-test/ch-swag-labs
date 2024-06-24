package stepDefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import utilities.WebDriverUtil;

public class CartPageSteps {

    private WebDriver driver;
    private CartPage cartPage;

    public CartPageSteps() {
        driver = WebDriverUtil.getWebDriver();
        cartPage = new CartPage(driver);
    }

    @And("I click on the checkout button")
    public void clickOnCheckoutButton() throws Exception {
        cartPage.clickCheckoutButton();
        Thread.sleep(2000);
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