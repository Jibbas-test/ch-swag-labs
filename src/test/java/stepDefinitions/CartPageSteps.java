package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.OnesieProductPage;

import static org.junit.Assert.assertTrue;

public class CartPageSteps {

    private final CartPage cartPage;
    private final OnesieProductPage onesieProductPage;

    public CartPageSteps() {
        WebDriver driver = Hooks.driver;
        cartPage = new CartPage(driver);
        onesieProductPage = new OnesieProductPage(driver);
    }

//    @Then("the onesie is added to the cart")
//    public void checkOnesieIsAddedToCart() throws Exception {
//        assertTrue(onesieProductPage.checkOnesieAddedToCart.getText().contains("Sauce Labs Onesie"));
//    }

    @And("I click on the checkout button")
    public void clickOnCheckoutButton() throws Exception {
        cartPage.clickCheckoutButton();
        Thread.sleep(2000);
    }

}