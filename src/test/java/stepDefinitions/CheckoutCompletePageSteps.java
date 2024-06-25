package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePage;

import static org.junit.Assert.assertTrue;

public class CheckoutCompletePageSteps {

    private final CheckoutCompletePage checkoutCompletePage;

    public CheckoutCompletePageSteps() {
        WebDriver driver = Hooks.driver;
        checkoutCompletePage = new CheckoutCompletePage(driver);
    }

    /**
     * Asserts that the order completion message is displayed.
     */
    @Then("I see the order complete message")
    public void orderCompleteMessageIsDisplayed() throws Exception {
        assertTrue(checkoutCompletePage.orderCompleteMessageIsDisplayed());
        assertTrue(checkoutCompletePage.orderCompleteMessage.getText().contains("THANK YOU FOR YOUR ORDER"));
    }

    @Then("^the total price at checkout is (.*) excluding tax$")
    public void checkItemCostAtCheckout(String itemCost) throws Exception {
        Thread.sleep(2000);
        assertTrue(checkoutCompletePage.itemCost.getText().contains(itemCost));
    }

}