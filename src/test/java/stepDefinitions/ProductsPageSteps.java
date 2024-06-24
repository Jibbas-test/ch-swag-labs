package stepDefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.ProductsPage;
import utilities.WebDriverUtil;

public class ProductsPageSteps {

    private WebDriver driver;
    private ProductsPage productsPage;

    public ProductsPageSteps() {
        driver = WebDriverUtil.getWebDriver();
        productsPage = new ProductsPage(driver);
    }

    /**
     * Adds the Sauce Labs Backpack to the cart.
     */
    @And("I add an item to the cart")
    public void addSauceLabsBackpackToCart() throws Exception {
        productsPage.clickBackpackAddToCartButton();
        Thread.sleep(1000);
    }

    @And("I click on the cart button")
    public void clickOnCartButton() throws Exception {
        productsPage.clickCartButton();
        Thread.sleep(2000);
    }

    /**
     * Takes screenshot after each failed scenario step.
     */
    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }
    }

}