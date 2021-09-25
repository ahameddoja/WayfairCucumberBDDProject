package step_definitions;

import Page_Object.BabyAndKids;
import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utilities.ReadConfigFiles;

public class BabyAndKids_Steps {

    private static final Logger LOGGER = LogManager.getLogger(BabyAndKids_Steps.class);
    WebDriver driver = Hooks.driver;

    BabyAndKids babyAndKids = new BabyAndKids(driver);

    @Given("^user is in the baby and kids home page$")
    public void navigateToHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SiteURL"));
        LOGGER.info("User is in the Home Page");
    }

    @Then("^user mouse hover to Baby & Kids tab$")
    public void mouseHoverToBabyAndKids() {
        babyAndKids.mouseHoverToBabyAndKids();
    }

    @And("^click on Nursery Furniture$")
    public void clickOnNurseryFurniture() {
        babyAndKids.clickOnNurseryFurniture();
    }

    @Then("^user click on Cribs$")
    public void clickOnCribs() {
        babyAndKids.clickOnCribs();
    }

    @Then("^select color White and Gray$")
    public void selectColor() {
        babyAndKids.selectColor();
    }
    @Then("^input Min price 200 and max 500 Per item$")
    public void inputNurseryFurnitureMinMaxPrice() throws InterruptedException {
        babyAndKids.inputNurseryFurnitureMinMaxPrice();
    }

    @Then("^click on crib type option$")
    public void clickOnCribType() {
        babyAndKids.clickOnCribType();
    }
    @And("^Select Size Shape as Mini and Standard Size$")
    public void selectSizeShape() {
        babyAndKids.selectSizeShape();
    }
    @Then("^Click on Customer Rating option and Select five star$")
    public void selectCustomerRatings() {
        babyAndKids.selectCustomerRatings();
    }
    @And("^user click on Item Per Page dropdown and select 24$")
    public void selectItemPerPage() throws InterruptedException {
        babyAndKids.selectItemPerPage();
    }

    @Then("^user close the baby and kids browser$")
    public void closeBrowser() {
        LOGGER.info("User closed the browser");
    }

    @Given("^user navigated to home page$")
    public void navigatingToHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SiteURL"));
        LOGGER.info("User is in the Home Page");
    }

    @Then("^user mouse hovered to Baby & Kids tab$")
    public void mouseHoverToBabyAndKidsLink() {
        babyAndKids.mouseHoverToBabyAndKidsLink();
    }

    @And("^click on Nursery Bedding$")
    public void clickOnNurseryBedding() {
        babyAndKids.clickOnNurseryBedding();
    }

    @Then("^user click on Crib Sheets$")
    public void clickOnCribSheets() {
        babyAndKids.clickOnCribSheets();
    }

    @Then("^select Gender Boy and Girl$")
    public void selectGender() {
        babyAndKids.selectGender();
    }

    @Then("^select color Crib Type Mini Crib$")
    public void selectCribTypeMini() {
        babyAndKids.selectCribTypeMini();
    }

    @Then("^user click on colors tab$")
    public void clickOnColorsTab() {
        babyAndKids.clickColorTab();
    }

    @And("^select Black and Blue$")
    public void selectColors() {
        babyAndKids.selectColors();
    }

    @Then("^user click on Type and select Fitted sheet and Flat sheet$")
    public void selectSheets() {
        babyAndKids.selectSheets();
    }

    @Then("^user click on next button to go to next page$")
    public void clickNextButton() {
        babyAndKids.clickNextButton();
    }

    @Then("^close the browser$")
    public void closedBrowser() {
        LOGGER.info("User closed the browser");
    }

    @Given("^user open the home page$")
    public void navigatedToHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SiteURL"));
        LOGGER.info("User is in the Home Page");
    }

    @Then("^user mouse hovered to Baby & Kids button$")
    public void mouseHoverOnBabyAndKids() {
        babyAndKids.mouseHoverOnBabyAndKids();
    }

    @And("^click on Toddler and Kids Bedroom Furniture$")
    public void clickToddlerAndKidsBedroomFurniture() {
        babyAndKids.clickToddlerAndKidsBedroomFurniture();
    }

    @Then("^user click on Kids Beds$")
    public void clickOnKidsBeds() {
        babyAndKids.clickOnKidsBeds();
    }

    @And("^Select Bed Size Toddler$")
    public void selectToddlerBed() {
        babyAndKids.selectToddlerBed();
    }

    @Then("^select color as White and Black$")
    public void selectBlackAndWhiteColor() {
        babyAndKids.selectBlackAndWhiteColor();
    }

    @Then("^click on Material and select Wood and Metal$")
    public void selectMaterials() {
        babyAndKids.selectMaterials();
    }

    @Then("^Click on Price Per item and select option 100 to 250 and 500 to 750$")
    public void clickOnPricePerItem() {
        babyAndKids.clickOnPricePerItem();
    }

    @Then("^click On item per page and select 24$")
    public void clickOnSortByAndSelectCustomerRating() throws InterruptedException {
        babyAndKids.clickOnSortByAndSelectCustomerRating();
    }

    @Then("^user closed the webpage$")
    public void closingTheBrowser() {
        LOGGER.info("User closed the browser");
    }

    @Given("^user navigate to the homepage$")
    public void navigateToTheHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SiteURL"));
        LOGGER.info("User is in the Home Page");
    }

    @Then("^user mouse hover to the Baby & Kids tab$")
    public void mouseHoverToBabyAndKidsButton() {
        babyAndKids.mouseHoverToBabyAndKidsButton();
    }

    @And("^click on Teen Bedroom Furniture$")
    public void clickOnTeenBedroomFurniture() {
        babyAndKids.clickOnTeenBedroomFurniture();
    }

    @Then("^user click on Teen Beds$")
    public void clickOnTeenBeds() {
        babyAndKids.clickOnTeenBeds();
    }

    @And("^Select Bed Size Queen$")
    public void selectBedSize() {
        babyAndKids.selectBedSize();
    }

    @Then("^select Bed Type Standard Bed and select Product Type Bunk Bed$")
    public void selectBedTypeAndProductType() {
        babyAndKids.selectBedTypeAndProductType();
    }

    @Then("^click on Color button and select color Bronze Chrome and Black$")
    public void clickOnColorButton() {
        babyAndKids.clickOnColorButton();
    }

    @Then("^click on Material Tab and select Metal and Iron$")
    public void clickOnMaterial() {
        babyAndKids.clickOnMaterial();
    }

    @Then("^click On item per page and select 96$")
    public void clickOnSortByOption() throws InterruptedException {
        babyAndKids.clickOnSortByOption();
    }

    @Then("^user has close the browser$")
    public void closedTheBrowser() {
        LOGGER.info("User closed the browser");
    }

    @Given("^user navigated to homepage$")
    public void navigateOnHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SiteURL"));
        LOGGER.info("User is in the Home Page");
    }

    @Then("^user mouse hover to Baby & Kids button$")
    public void mouseHoverToBabyAndKidsTab() {
        babyAndKids.mouseHoverToBabyAndKidsTab();
    }

    @And("^click on Kids Playroom$")
    public void clickOnKidsPlayroom() {
        babyAndKids.clickOnKidsPlayroom();
    }

    @Then("^user click on Indoor Play$")
    public void clickOnIndoorPlay() {
        babyAndKids.clickOnIndoorPlay();
    }

    @Then("^user click on Toddler Playhouses$")
    public void clickOnToddlerPlayhouses() {
        babyAndKids.clickOnToddlerPlayhouses();
    }

    @And("^Select Plastic from Material Option$")
    public void selectPlasticMaterial() {
        babyAndKids.selectPlasticMaterial();
    }

    @Then("^Select 3 to 4 years in Age and maximum Number of Kids 4 or more from Age and Number of Kids option$")
    public void selectAgeAndMaxNumberOfKids() {
        babyAndKids.selectAgeAndMaxNumberOfKids();
    }

    @Then("^click on Indoor OutDoor use Option and select outdoor and indoor option$")
    public void clickIndoorOutdoorUse() {
        babyAndKids.clickIndoorOutdoorUse();
    }

    @Then("^user click on color tab and select color Brown Red and Gray$")
    public void clickColorTab() {
        babyAndKids.clickColorTab();
    }

    @Then("^user click on Item Per Page dropdown and select 96$")
    public void clickItemPerPage() throws InterruptedException {
        babyAndKids.clickItemPerPage();
    }

    @Then("^user closed the browser page$")
    public void closingBrowser() {
        LOGGER.info("User closed the browser");
    }
}