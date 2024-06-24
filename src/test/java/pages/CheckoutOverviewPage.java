package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {

    public WebDriver driver;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#checkout_summary_container > div > div.summary_info > div.cart_footer > a.btn_action.cart_button")
    private WebElement finishOrderButton;

    public void clickFinishOrderButton() {
        finishOrderButton.isDisplayed();
        finishOrderButton.click();
    }

}