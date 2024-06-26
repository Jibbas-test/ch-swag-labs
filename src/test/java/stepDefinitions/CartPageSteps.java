package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.OnesieProductPage;

import static org.junit.Assert.assertTrue;

public class CartPageSteps {

    private final CartPage cartPage;

    public CartPageSteps() {
        WebDriver driver = Hooks.driver;
        cartPage = new CartPage(driver);
    }

    @And("I click on the checkout button")
    public void clickOnCheckoutButton() throws Exception {
        cartPage.clickCheckoutButton();
        Thread.sleep(2000);
    }

}