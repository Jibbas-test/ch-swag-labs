package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.SignInPage;

import static org.junit.Assert.assertTrue;

public class SignInPageSteps {

    private final WebDriver driver = Hooks.driver;
    private final SignInPage signInPage;

    public SignInPageSteps() {
        signInPage = new SignInPage(driver);
    }

    /**
     * Navigate to Swag Labs website and asserts page heading is true.
     */
    @Given("I have navigated to the Swag Labs sign in page")
    public void navigateToSwagLabsSignInPage() {
        driver.get("https://www.saucedemo.com/v1/index.html");
        assertTrue(signInPage.userNameFieldIsDisplayed());
    }

    /**
     * Signs in to Swag Labs with invalid username and password.
     */
    @When("I enter an invalid username and password")
    public void enterInvalidUserNameAndPassword() throws Exception {
        signInPage.setLoginFields(signInPage.userNameField, "invalid_user_name");
        signInPage.setLoginFields(signInPage.passwordField, "invalid_password");
        Thread.sleep(1500);
        signInPage.clickLoginButton();
    }

    @Then("I am shown appropriate error messages")
    public void incorrectUsernameAndPasswordErrorIsDisplayed() throws Exception {
        assertTrue(signInPage.userNameAndPasswordErrorMessageIsDisplayed());
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
     * Navigates to Swag Labs and signs in as standard user.
     */
    @Given("I log in as a standard user")
    public void logInAsStandardUser() {
        driver.get("https://www.saucedemo.com/v1/index.html");
        assertTrue(signInPage.userNameFieldIsDisplayed());
        signInPage.setLoginFields(signInPage.userNameField, "standard_user");
        signInPage.setLoginFields(signInPage.passwordField, "secret_sauce");
        signInPage.clickLoginButton();
    }

    /**
     * Logs out of account and closes browser.
     */
    @And("I log out of the service")
    public void logOutOfService() throws Exception {
        signInPage.clickMenuButton();
        Thread.sleep(1000);
        signInPage.clickResetAppStateButton();
        Thread.sleep(1000);
        signInPage.clickLogOutButton();
        Thread.sleep(1000);
    }

    /**
     * Closes browser.
     */
    @And("I close browser")
    public void closeBrowser() throws Exception {
        //Thread.sleep(2000);
        driver.close();
        driver.quit();
    }

}