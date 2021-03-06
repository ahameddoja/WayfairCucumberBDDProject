package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ReadConfigFiles;

public class LoginAndProductCheckOutBONUS {

    private static final By ClickMenuOption = By.xpath("//button[@id='HeaderHamburgerMenuButton']");
    private static final By ClickSignInButton = By.xpath("//a[@id='HeaderDrawerStatusButton']");
    private static final By EnterEmailAddress = By.xpath("//input[@autocomplete='username']");
    private static final By ClickContinueButton = By.xpath("//button[@type='submit']");
    private static final By EnterPassWord = By.xpath("//input[@name='password']");
    private static final By ClickOnSignInButton = By.xpath("//button[@type='submit']");
    private static final By OutdoorOption = By.linkText("Outdoor");
    private static final By SelectGarden = By.xpath("//span[@class='DepartmentDropdown-iconContainer'][text()='Garden']");
    private static final By ClickPlanters = By.xpath("//p[@data-hb-id='Text'][text()='Planters']");
    private static final By ClickPlanterBoxesType = By.xpath("//div[2]/div/div/div/label[@class='pl-SelectableInput'][@data-hb-id='Selectable']");
    private static final By ClickProduct = By.xpath("//div/h2[text()='Hirst Wood Planter Box'][@class='ProductCard-name']");
    private static final By ClickAddToCartButton = By.id("btn-add-to-cart");
    private static final By NoThanksButton = By.xpath("//button[@type='button'][@data-enzyme-id='NO_THANKS_BUTTON']");
    private static final By ClickReviewCartButton = By.xpath("//a[@data-enzyme-id='continueToCartCta'][@data-hb-id='Button']");
    private static final By ClickShipToButton = By.xpath("//*[@id='sideRail']//button[2][@class='Button Button--primary Button--plainText']");
    private static final By InputZipCode = By.xpath("//*[@id='textInput-0'][@name='postal_code_input']");
    private static final By ClickUpdateButton = By.xpath("//*[@id='sideRail']//button[text()='Update']");
    private static final By ClickProceedToCheckoutButton = By.xpath("//*[@id='sideRail']//button[@data-codeception-id='proceed-checkout-button']");
    private static final By ClickBackToCartButton = By.xpath("//*[@id='root-container']//a[@data-hb-id='Button']");
    private static final By ClickSignOutButton = By.xpath("//*[@id='HeaderDrawerStatusButton'][@tracker='[object Object]']");


    private static final Logger LOGGER = LogManager.getLogger(LoginAndProductCheckOutBONUS.class);
    WebDriver driver = Hooks.driver;

    @Given("^user navigate to home page$")
    public void navigateToHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SiteURL"));
        LOGGER.info("User is in the Home Page");
    }

    @When("^user click on menu bar from left$")
    public void clickOnMenuBar() {
        ActOn.wait(driver, ClickMenuOption).waitForElementToBEVisible();
        ActOn.element(driver, ClickMenuOption).click();
        LOGGER.info("User clicked on menu bar from left");
    }

    @Then("^user click on Sign In Button$")
    public void clickSignInButton() {
        ActOn.wait(driver, ClickSignInButton).waitForElementToBEVisible();
        ActOn.element(driver, ClickSignInButton).click();
        LOGGER.info("User clicked on Sign In Button");
    }

    @Then("^user enters email \"(.+?)\" and \"(.+?)\" password click continue button$")
    public void enterUserCredentials(String Email, String Password) {
        ActOn.wait(driver, EnterEmailAddress).waitForElementToBEVisible();
        ActOn.element(driver, EnterEmailAddress).setValue(Email);
        ActOn.element(driver, ClickContinueButton).click();
        ActOn.wait(driver, EnterPassWord).waitForElementToBEVisible();
        ActOn.element(driver, EnterPassWord).setValue(Password);
        ActOn.element(driver, ClickOnSignInButton).click();
        LOGGER.info("User has entered email and password To Log In");
    }

    @Then("^user mouse hover to outdoor menu and click on garden$")
    public void mouseHoverToOutdoor() {
        ActOn.wait(driver, OutdoorOption).waitForElementToBEVisible();
        ActOn.element(driver, OutdoorOption).mouseHover();
        ActOn.wait(driver, SelectGarden).waitForElementToBEVisible();
        ActOn.element(driver, SelectGarden).click();
        LOGGER.info("User mouse hover to outdoor menu and clicked on garden");
    }

    @Then("^user click on planters and select type and product$")
    public void clickPlantersAndSelectProduct() {
        ActOn.wait(driver, ClickPlanters).waitForElementToBEVisible();
        ActOn.element(driver, ClickPlanters).click();
        ActOn.wait(driver, ClickPlanterBoxesType).waitForElementToBEVisible();
        ActOn.element(driver, ClickPlanterBoxesType).click();
        ActOn.wait(driver, ClickProduct).waitForElementToBEVisible();
        ActOn.element(driver, ClickProduct).click();
        ActOn.element(driver, ClickProduct).userInNewWindow();
        LOGGER.info("User clicked on planters and select a product");
    }

    @And("^user click on add to Cart button$")
    public void clickAddToCartButton() {
        ActOn.wait(driver, ClickAddToCartButton).waitForElementToBEVisible();
        ActOn.element(driver, ClickAddToCartButton).click();
        LOGGER.info("User clicked on add to Cart button");
    }

    @And("^user click on No Thanks Button in popup$")
    public void clickNoThanksButton() {
        ActOn.wait(driver, NoThanksButton).waitForElementToBEVisible();
         ActOn.element(driver, NoThanksButton).click();
         LOGGER.info("User clicked on No Thanks button");
    }

    @Then("^user click on Review Cart button$")
    public void clickReviewCartButton() {
        ActOn.wait(driver, ClickReviewCartButton).waitForElementToBEVisible();
        ActOn.element(driver, ClickReviewCartButton).click();
        LOGGER.info("User clicked on Review Cart button");
    }

    @Then("^user click on ship to button$")
    public void clickOnShipToButton() {
        ActOn.wait(driver, ClickShipToButton).waitForElementToBEVisible();
        ActOn.element(driver, ClickShipToButton).click();
        LOGGER.info("User clicked on ship to button");
    }

    @And("^user provide the \"(.+?)\" in Ship to option and click the update button$")
    public void enterZipCode(String ZipCode) {
        ActOn.wait(driver, InputZipCode).waitForElementToBEVisible();
        ActOn.element(driver, InputZipCode).setValue(ZipCode);
        ActOn.wait(driver, ClickUpdateButton).waitForElementToBEVisible();
        ActOn.element(driver, ClickUpdateButton).click();
        LOGGER.info("User provided zipcode in Ship to option and click the update button");
    }

    @Then("^user click on Proceed to Checkout button$")
    public void clickOnProceedToCheckoutButton() {
        ActOn.wait(driver, ClickProceedToCheckoutButton).waitForElementToBEVisible();
        ActOn.element(driver, ClickProceedToCheckoutButton).click();
        LOGGER.info("User clicked on Proceed to Checkout button");
    }

    @Then("^user click on Back to Cart button$")
    public void clickOnBackToCartButton() {
        ActOn.wait(driver, ClickBackToCartButton).waitForElementToBEVisible();
        ActOn.element(driver, ClickBackToCartButton).click();
        LOGGER.info("User clicked on Back to Cart button");
    }

    @And("^user click on menu bar from left again and click SignOut Button$")
    public void clickOnMenuButton() {
        ActOn.wait(driver, ClickMenuOption).waitForElementToBEVisible();
        ActOn.element(driver, ClickMenuOption).click();
        ActOn.wait(driver, ClickSignOutButton).waitForElementToBEVisible();
        ActOn.element(driver, ClickSignOutButton).click();
        LOGGER.info("User clicked on menu bar from left again and click SignOut Button");
    }

    @And("^user close the browser successfully$")
        public void closeBrowser() {
        LOGGER.info("User closed the browser successfully");
    }
}
