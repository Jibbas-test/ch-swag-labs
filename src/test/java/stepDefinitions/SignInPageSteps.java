package stepDefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.SignInPage;
import utilities.WebDriverUtil;

public class SignInPageSteps {

    private WebDriver driver;
    private SignInPage signInPage;

    public SignInPageSteps() {
        driver = WebDriverUtil.getWebDriver();
        signInPage = new SignInPage(driver);
    }

    /**
     * Navigate to Swag Labs website and asserts page heading is true.
     */
    @Given("I have navigated to the Swag Labs sign in page")
    public void navigateToSwagLabsSignInPage() {
        driver.get("https://www.saucedemo.com/v1/index.html");
        Assert.assertTrue(signInPage.userNameFieldIsDisplayed());
    }

    /**
     * Signs in to Swag Labs as the standard_user.
     */
    @When("I sign in as a standard user")
    public void signInAsStandardUser() {
        signInPage.setLoginFields(signInPage.userNameField, "standard_user");
        signInPage.setLoginFields(signInPage.passwordField, "secret_sauce");
        signInPage.clickLoginButton();
    }

    /**
     * Logs out of account and closes browser.
     */
    @And("I close browser")
    public void logoutAndCloseBrowser() throws Exception {
        //Thread.sleep(2000);
        driver.close();
        driver.quit();
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