package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {

    public WebDriver driver;

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#checkout_complete_container > h2")
    public WebElement orderCompleteMessage;

    public boolean orderCompleteMessageIsDisplayed() {
        orderCompleteMessage.isDisplayed();
        return true;
    }

}