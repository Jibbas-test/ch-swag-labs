package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformationPage {

    public WebDriver driver;

    public YourInformationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name")
    public WebElement firstNameField;

    @FindBy(id = "last-name")
    public WebElement lastNameField;

    @FindBy(id = "postal-code")
    public WebElement postalCodeField;

    @FindBy(css = "#checkout_info_container > div > form > div.checkout_buttons > input")
    public WebElement continueButton;

    public void setInformationFields(WebElement field,String value) {
        field.click();
        field.sendKeys(value);
    }

    public void clickContinueButton() {
        continueButton.isDisplayed();
        continueButton.click();
    }

}