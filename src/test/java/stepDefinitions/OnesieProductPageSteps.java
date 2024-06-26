package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.OnesieProductPage;

import static org.junit.Assert.assertTrue;

public class OnesieProductPageSteps {

    private OnesieProductPage onesieProductPage;

    public OnesieProductPageSteps() {
        WebDriver driver = Hooks.driver;
        onesieProductPage = new OnesieProductPage(driver);
    }

    @Then("the onesie is added to the cart")
    public void onesieAddedToCart() throws Exception {
        Thread.sleep(2000);
        assertTrue(onesieProductPage.checkOnesieAddedToCart.getText().contains("Sauce Labs Onesie"));
    }

}