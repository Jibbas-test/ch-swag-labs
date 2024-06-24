package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button")
    public WebElement checkoutButton;

    public void clickCheckoutButton() {
        checkoutButton.isDisplayed();
        checkoutButton.click();
    }

}