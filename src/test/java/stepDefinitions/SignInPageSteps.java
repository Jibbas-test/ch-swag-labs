package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.SignInPage;
import utilities.WebDriverUtil;

import java.io.IOException;

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
     * Logs out of account and closes browser.
     */
    @And("I close browser")
    public void logoutAndCloseBrowser() throws IOException {
        driver.close();
        driver.quit();
    }

}