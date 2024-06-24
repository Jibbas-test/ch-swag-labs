package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    public WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#inventory_container > div > div:nth-child(1) > div.pricebar > button")
    public WebElement addBackpackToCart;

    @FindBy(css = "#shopping_cart_container > a > svg > path")
    public WebElement cartButton;

    public void clickBackpackAddToCartButton() {
        addBackpackToCart.isDisplayed();
        addBackpackToCart.click();
    }

    public void clickCartButton() {
        cartButton.isDisplayed();
        cartButton.click();
    }

}