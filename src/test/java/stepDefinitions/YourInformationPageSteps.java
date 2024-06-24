package stepDefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.YourInformationPage;
import utilities.WebDriverUtil;

public class YourInformationPageSteps {

    private WebDriver driver;
    private YourInformationPage yourInformationPage;

    public YourInformationPageSteps() {
        driver = WebDriverUtil.getWebDriver();
        yourInformationPage = new YourInformationPage(driver);
    }

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