package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePage;
import pages.CheckoutOverviewPage;

import static org.junit.Assert.assertTrue;

public class CheckoutOverviewPageSteps {

    private final CheckoutOverviewPage checkoutOverviewPage;
    private final CheckoutCompletePage checkoutCompletePage;

    public CheckoutOverviewPageSteps() {
        WebDriver driver = Hooks.driver;
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutCompletePage = new CheckoutCompletePage(driver);
    }

    @And("I click on the finish button")
    public void clickOnFinishOrderButton() throws Exception {
        checkoutOverviewPage.clickFinishOrderButton();
        Thread.sleep(1000);
    }

    /**
     * Clicks Finish and asserts that order completion message is displayed.
     */
    @Then("I am able to purchase that item")
    public void completePurchaseOfItem() throws Exception {
        checkoutOverviewPage.clickFinishOrderButton();
        assertTrue(checkoutCompletePage.orderCompleteMessage.getText().contains("THANK YOU FOR YOUR ORDER"));
    }

}