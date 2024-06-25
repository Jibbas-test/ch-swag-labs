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

    @FindBy(css = "#item_2_title_link > div")
    public WebElement onesieProductLink;

    @FindBy(css = "#inventory_item_container > div > div > div > button")
    public WebElement onesieAddToCartButton;

    @FindBy(css = "#inventory_container > div > div:nth-child(3) > div.pricebar > button")
    public WebElement sauceLabsBoltTShirtCartButton;

    @FindBy(css = "#inventory_container > div > div:nth-child(2) > div.pricebar > button")
    public WebElement bikeLightAddToCartButton;

    @FindBy(css = "#shopping_cart_container > a > svg > path")
    public WebElement cartButton;

    public void clickBackpackAddToCartButton() {
        addBackpackToCart.isDisplayed();
        addBackpackToCart.click();
    }

    public void clickOnesieProductLink() {
        onesieProductLink.isDisplayed();
        onesieProductLink.click();
    }

    public void clickOnesieAddToCartButton() {
        onesieAddToCartButton.isDisplayed();
        onesieAddToCartButton.click();
    }

    public void clickBikeLightAddToCartButton() {
        bikeLightAddToCartButton.isDisplayed();
        bikeLightAddToCartButton.click();
    }

    public void clickBoltTShirtAddToCartButton() {
        sauceLabsBoltTShirtCartButton.isDisplayed();
        sauceLabsBoltTShirtCartButton.click();
    }

    public void clickCartButton() {
        cartButton.isDisplayed();
        cartButton.click();
    }

}