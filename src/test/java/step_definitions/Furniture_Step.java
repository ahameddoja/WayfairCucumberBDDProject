package step_definitions;

import Page_Object.Furniture;
import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utilities.ReadConfigFiles;


public class Furniture_Step {

    private static final Logger LOGGER = LogManager.getLogger(Furniture_Step.class);
    WebDriver driver = Hooks.driver;

    Furniture furniture = new Furniture(driver);


    @Given("^user is in the home page$")
        public void navigateToHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SiteURL"));
        LOGGER.info("User is in the Home Page");
    }
    @When("^user mouse hover to furniture tab$")
    public void mouseHoverToFurnitureTab() throws InterruptedException {
        furniture.mouseHoverToFurnitureTab();
    }

    @Then("^click Living Room Furniture$")
    public void clickOnLivingRoomFurniture() {
        furniture.clickOnLivingRoomFurniture();
    }

    @Then("^user click on Sofas tab$")
    public void clickOnSofasTab() throws InterruptedException {
        furniture.clickOnSofasTab();
        furniture.clickOnTypeDesign();
    }

    @And("^select sofa type$")
    public void setSelectSofaType() {
        furniture.setSelectSofaType();
    }

    @And("^select sofa design$")
    public void setSelectSofaDesign() {
        furniture.setSelectSofaDesign();
    }

    @Then("^user click on Price Per Item option$")
    public void clickOnPricePerItemOption() {
        furniture.clickOnPricePerItemOption();
    }

    @And("^input min price range for an item$")
    public void inputFurnitureMinPrice() {
        furniture.inputFurnitureMinPrice();
    }

    @Then("^input max price range for an item$")
    public void inputFurnitureMaxPrice() {
        furniture.inputFurnitureMaxPrice();
    }

    @Then("^user close the browser$")
    public void closedTheBrowser() {
        LOGGER.info("User close the browser");
    }

    @Given("^user navigate to the home page$")
    public void navigateToTheHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SiteURL"));
        LOGGER.info("User is in the Home Page");
    }

    @When("^user mouse hover to furniture option$")
    public void mouseHoverOnFurnitureTab() {
        furniture.mouseHoverOnFurnitureTab();
    }

    @And("^click Bed Room Furniture$")
    public void clickBedRoomFurniture() {
        furniture.clickBedRoomFurniture();
    }

    @Then("^user click on Bedroom Sets tab$")
    public void clickOnBedroomSets() {
        furniture.clickOnBedroomSets();
    }

    @Then("^user select bed size$")
    public void selectBedSize() {
        furniture.selectBedSize();
    }

    @Then("^user select White color$")
    public void selectColorWhite() {
        furniture.selectColorWhite();
    }

    @And("^user select Gray color$")
    public void selectColorGray() {
        furniture.selectColorGray();
    }

    @Then("^user click on Bed Type$")
    public void selectBedType() {
        furniture.selectBedType();
    }

    @And("^select Bed Platform Type$")
    public void selectPlatformType() {
        furniture.selectPlatformType();
    }

    @Then("^user click on Sort by dropdown menu$")
    public void clickSortByOption() throws InterruptedException {
        furniture.clickSortByOption();
    }

    @Then("^select price per item Low to High$")
    public void selectPriceRange() {
        furniture.selectPriceRange();
    }

    @Then("^user closed the browser$")
    public void closeTheBrowser() {
        LOGGER.info("User close the browser");
    }

    @Given("^user navigated to the home page$")
    public void navigatingTheHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SiteURL"));
        LOGGER.info("User is in the Home Page");
    }

    @When("^user mouse hovered to furniture option$")
    public void mouseHoverOnFurnitureButton() {
        furniture.mouseHoverOnFurnitureButton();
    }

    @Then("click Kitchen and Dining Furniture")
    public void clickKitchenAndDiningFurniture() {
        furniture.clickKitchenAndDiningFurniture();
    }

    @And("user click on Dining Tables and Seating tab")
    public void clickOnDiningTablesAndSeating() {
        furniture.clickOnDiningTablesAndSeating();
    }

    @Then("user click on Kitchen and Dining Tables")
    public void clickOnKitchenAndDiningTables() {
        furniture.clickOnKitchenAndDiningTables();
    }

    @Then("user select Rectangular from Table Shape Option")
    public void selectTableShape() {
        furniture.selectTableShape();
    }

    @Then("user select Seats 2 and 4 from Seating Capacity Option")
    public void selectSeatsFromSeatingCapacityOption() {
        furniture.selectSeatsFromSeatingCapacityOption();
    }

    @Then("user click on Price Per Item options")
    public void clickPricePerItem() {
        furniture.clickPricePerItem();
    }

    @And("Input Min price 200 and Max price 600")
    public void inputKitchenFurnitureMinAndMaxPrice() {
        furniture.inputKitchenFurnitureMinAndMaxPrice();
    }

    @Then("^user closing the browser$")
    public void closingBrowser() {
        LOGGER.info("User close the browser");
    }

    @Given("^user open the homepage$")
    public void navigatingToTheHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SiteURL"));
        LOGGER.info("User is in the Home Page");
    }

    @When("^user mouse hover to furniture options$")
    public void mouseHoverOnOfficeFurnitureTab() {
        furniture.mouseHoverOnOfficeFurnitureTab();
    }

    @And("^click on Office Furniture$")
    public void clickOnOfficeLink() {
        furniture.clickOnOfficeLink();
    }

    @Then("^user click on Office Chair tab$")
    public void clickOnOfficeChairButton() {
        furniture.clickOnOfficeChairButton();
    }

    @Then("^Input Min price 75 and Max price 250 in Price Per item section$")
    public void inputOfficeChairMinMaxPrice() {
        furniture.inputOfficeChairMinMaxPrice();
    }

    @Then("^user click on Executive Chair under Type section$")
    public void clickExecutiveChair() {
        furniture.clickExecutiveChair();
    }

    @Then("^user click on Arm Type tab$")
    public void clickArmType() {
        furniture.clickArmType();
    }

    @Then("^select Arm Style as Armless$")
    public void selectArmStyle() {
        furniture.selectArmStyle();
    }
    @Then("^user click on next button$")
    public void clickOnNextButton() {
        furniture.clickOnNextButton();
    }

    @Then("^user did close the browser$")
    public void closingTheBrowser() {
        LOGGER.info("User close the browser");
    }

    @Given("^user is navigated to home page$")
    public void navigatedToTheHomePage() {
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("SiteURL"));
        LOGGER.info("User is in the Home Page");
    }

    @When("^user mouse hovering to furniture tab$")
    public void mouseHoverOnFurnitureLink() {
        furniture.mouseHoverOnFurnitureLink();
    }

    @And("^click on Game Room Furniture$")
    public void clickOnGameRoomFurniture() {
        furniture.clickOnGameRoomFurniture();
    }

    @Then("^user click on gaming Chair tab$")
    public void clickOnGamingChair() {
        furniture.clickOnGamingChair();
    }

    @Then("^Input Min price 100 and Max price 400 in Price Per item section$")
    public void inputGamingChairMinMaxPrice() {
        furniture.inputGamingChairMinMaxPrice();
    }
    @Then("^user clicked on PC & Racing Chair under Chair Type section$")
    public void clickPCAndRacingChair() {
        furniture.clickPCAndRacingChair();
    }

    @Then("^user click on Weight Capacity tab$")
    public void clickOnWeightCapacity() {
        furniture.clickOnWeightCapacity();
    }

    @Then("^select Up to 200 lbs and 200lbs-300lbs option$")
    public void selectWeight() {
        furniture.selectWeight();
    }

    @Then("^user click on Sort by tab and select Price per Item High to Low$")
    public void clickSortByAndSelectPriceHighToLow() {
        furniture.clickSortByAndSelectPriceHighToLow();
    }

    @Then("^user close the webbrowser$")
    public void closeBrowser() {
        LOGGER.info("User close the browser");
    }
}
