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

public class KitchenAndDiningFurniture {

    private static final By FurnitureTab = By.linkText("Furniture");
    private static final By KitchenAndDining = By.xpath("//h3[@class='DepartmentDropdown-title'][text()='Kitchen &']");
    private static final By DiningTableAndSeating = By.xpath("//p[@data-hb-id='Text'][text()='Dining Tables & Seating']");
    private static final By KitchenAndDiningTable = By.xpath("//p[@data-hb-id='Text'][text()='Kitchen & Dining Tables']");
    private static final By SelectShape = By.xpath("//div[1]/div/div/div[1]/div/div/div/label[@data-hb-id='Selectable']");
    private static final By Seat2 = By.xpath("//*[@id='CollapsePanel-8']//div[1]/div/div[1]/div/label/span[1]/span");
    private static final By Seat4 = By.xpath("//*[@id='CollapsePanel-8']//div[1]/div/div[2]/div/label/span[1]/span");
    private static final By PricePerItem = By.xpath("//p[@data-hb-id='Box'][text()='Price Per Item']");
    private static final By MinPrice = By.xpath("//input[@id='textInput-13'][@type='number'][@name='lowVal']");
    private static final By MaxPrice = By.xpath("//input[@id='textInput-14'][@type='number'][@name='highVal']");


    private static final Logger LOGGER = LogManager.getLogger(KitchenAndDiningFurniture.class);
    WebDriver driver = Hooks.driver;

    @Given("^user navigated to the home page$")
    public void navigateToHomePage() throws InterruptedException {
        driver.get("https://www.wayfair.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().deleteAllCookies();
        LOGGER.info("User is in the Home Page");
    }

    @When("^user mouse hovered to furniture option$")
    public void mouseHoverOnFurnitureTab() throws InterruptedException {
        ActOn.element(driver, FurnitureTab).mouseHover();
        Thread.sleep(3000);
        LOGGER.info("User mouse hover to furniture tab");
    }

    @Then("click Kitchen and Dining Furniture")
    public void clickKitchenAndDiningFurniture() {
        ActOn.element(driver, KitchenAndDining).click();
        LOGGER.info("User clicked on Kitchen and Dining Furniture Link");
    }

    @And("user click on Dining Tables and Seating tab")
    public void ClickOnDiningTablesAndSeating() {
        ActOn.element(driver, DiningTableAndSeating).click();
        LOGGER.info("User clicked on Dining Tables and Seating tab");
;
    }

    @Then("user click on Kitchen and Dining Tables")
    public void ClickOnKitchenAndDiningTables() {
        ActOn.element(driver, KitchenAndDiningTable).click();
        LOGGER.info("User clicked on Kitchen and Dining Room Sets");
    }

    @Then("user select Rectangular from Table Shape Option")
    public void SelectTableShape() {
        ActOn.element(driver, SelectShape).click();
        LOGGER.info("User selected Rectangular from Table Shape Option");
    }

    @Then("user select Seats 2 and 4 from Seating Capacity Option")
    public void SelectSeats2FromSeatingCapacityOption() throws InterruptedException {
        ActOn.element(driver, Seat2).click();
        ActOn.element(driver, Seat4).click();
        Thread.sleep(7000);
        LOGGER.info("User selected Seats 2 and 4 from Seating Capacity Option");
    }

    @Then("user click on Price Per Item options")
    public void clickPricePerItem() {
        ActOn.element(driver, PricePerItem).click();
        LOGGER.info("User clicked Price Per Item option");
    }

    @And("Input Min price 200 and Max price 600")
    public void inputMinAndMaxPrice() throws InterruptedException {
        Thread.sleep(2000);
        ActOn.element(driver, MinPrice).setValue("clear");
        ActOn.element(driver, MinPrice).setValue("200");
        Thread.sleep(2000);
        ActOn.element(driver, MaxPrice).setValue("clear");
        ActOn.element(driver, MaxPrice).setValue("600");
        LOGGER.info("User inputs min and max price range for an item");
    }

    @Then("^user closing the browser$")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        LOGGER.info("User closed the browser");
    }
}
