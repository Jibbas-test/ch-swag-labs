package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignInPage {

    private static final Logger log = LoggerFactory.getLogger(SignInPage.class);
    public WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    public WebElement userNameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(css = "#menu_button_container > div > div:nth-child(3) > div > button")
    public WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    public WebElement logOutButton;

    @FindBy(css = "#login_button_container > div > form > h3")
    public WebElement userNameAndPasswordErrorMessage;

    @FindBy(id = "reset_sidebar_link")
    public WebElement resetAppStateButton;

    public boolean userNameFieldIsDisplayed() {
        userNameField.isDisplayed();
        return true;
    }

    public void setLoginFields(WebElement field,String value) {
        field.click();
        field.sendKeys(value);
    }

    public void clickLoginButton() {
        loginButton.isDisplayed();
        loginButton.click();
    }

    public void clickMenuButton() {
        menuButton.isDisplayed();
        menuButton.click();
    }

    public void clickLogOutButton() {
        logOutButton.isDisplayed();
        logOutButton.click();
    }

    public void clickResetAppStateButton() {
        resetAppStateButton.isDisplayed();
        resetAppStateButton.click();
    }

    public boolean userNameAndPasswordErrorMessageIsDisplayed() {
        userNameAndPasswordErrorMessage.isDisplayed();
        return true;
    }

}