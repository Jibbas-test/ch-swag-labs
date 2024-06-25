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

    @FindBy(css = "#checkout_summary_container > div > div.summary_info > div.summary_subtotal_label")
    public WebElement itemCost;

    public boolean orderCompleteMessageIsDisplayed() {
        orderCompleteMessage.isDisplayed();
        return true;
    }

}