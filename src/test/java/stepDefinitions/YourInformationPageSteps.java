package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.YourInformationPage;

public class YourInformationPageSteps {

    private final YourInformationPage yourInformationPage;

    public YourInformationPageSteps() {
        WebDriver driver = Hooks.driver;
        yourInformationPage = new YourInformationPage(driver);
    }

    /**
     * Enters first name, last name and postal code.
     */
    @And("I enter name details")
    public void enterValueInFirstNameField() throws Exception {
        yourInformationPage.setInformationFields(yourInformationPage.firstNameField, "Jamie");
        yourInformationPage.setInformationFields(yourInformationPage.lastNameField, "Jones");
        yourInformationPage.setInformationFields(yourInformationPage.postalCodeField, "ABC 123");
        Thread.sleep(1000);
    }

    @And("I click the continue button")
    public void clickContinueButton() throws Exception {
        yourInformationPage.clickContinueButton();
        Thread.sleep(2000);
    }

}