package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.ProductsPage;
import pages.YourInformationPage;

public class ProductsPageSteps {

    private final ProductsPage productsPage;
    private final CartPage cartPage;
    private final YourInformationPage yourInformationPage;

    public ProductsPageSteps() {
        WebDriver driver = Hooks.driver;
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        yourInformationPage = new YourInformationPage(driver);
    }

    /**
     * Adds the Sauce Labs Backpack to the cart.
     */
    @And("I add an item to the cart")
    public void addSauceLabsBackpackToCart() throws Exception {
        productsPage.clickBackpackAddToCartButton();
        Thread.sleep(1000);
    }

    @And("I click on the onesie product link")
    public void clickOnesieProductLink() throws Exception {
        productsPage.clickOnesieProductLink();
    }

    @And("I click on the onesie add to cart button")
    public void clickOnesieAddToCartButton() throws Exception {
        productsPage.clickOnesieAddToCartButton();
    }

    @And("I click on the cart button")
    public void clickOnCartButton() throws Exception {
        productsPage.clickCartButton();
        Thread.sleep(2000);
    }

    /**
     * Adds Backpack to cart and enters personal information.
     */
    @When("I add an item to the cart and proceed to checkout")
    public void addItemAndProceedToCheckout() throws Exception {
        productsPage.clickBackpackAddToCartButton();
        Thread.sleep(1000);
        productsPage.clickCartButton();
        cartPage.clickCheckoutButton();
        yourInformationPage.setInformationFields(yourInformationPage.firstNameField, "Jamie");
        yourInformationPage.setInformationFields(yourInformationPage.lastNameField, "Jones");
        yourInformationPage.setInformationFields(yourInformationPage.postalCodeField, "ABC 123");
        yourInformationPage.clickContinueButton();
        Thread.sleep(1000);
    }

    /**
     * Adds two items to cart and enters personal information.
     */
    @When("I add multiple items to the cart")
    public void addMultipleItemsToCart() throws Exception {
        productsPage.clickBikeLightAddToCartButton();
        productsPage.clickBoltTShirtAddToCartButton();
        productsPage.clickCartButton();
        cartPage.clickCheckoutButton();
        yourInformationPage.setInformationFields(yourInformationPage.firstNameField, "Jamie");
        yourInformationPage.setInformationFields(yourInformationPage.lastNameField, "Jones");
        yourInformationPage.setInformationFields(yourInformationPage.postalCodeField, "ABC 123");
        yourInformationPage.clickContinueButton();
    }

}