package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

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

}
