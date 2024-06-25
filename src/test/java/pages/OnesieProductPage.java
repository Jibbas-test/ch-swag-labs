package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnesieProductPage {

    public WebDriver driver;

    public OnesieProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#inventory_item_container > div > div > div > div.inventory_details_name")
    public WebElement checkOnesieAddedToCart;

}