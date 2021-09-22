package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToddlerAndKidsBedroomFurniture {

    private static final By BabyAndKids = By.linkText("Baby & Kids");
    private static final By ToddlerAndKidsBedRoomFurniture = By.xpath("//div[@id='openDropdown9']//li[5]//a[1]//h3[1]");
    private static final By KidsBeds = By.xpath("//p[contains(text(),'Kids Beds')]");
    private static final By SelectToddler  = By.xpath("//*[@id='CollapsePanel-0']/div/div/div/div/div/div[1]/div/div/div/label");
    private static final By ColorWhite  = By.xpath("//*[@id='CollapsePanel-23']/div/div/div/div/div[1]/div/label/span[1]/span");
    private static final By ColorBlack = By.xpath("//*[@id='CollapsePanel-23']/div/div/div/div/div[3]/div/label/span[1]/span");
    private static final By ClickMaterial = By.xpath("//*[@id='CollapseToggle-24']/div[1]/p");
    private static final By SelectWood = By.xpath("//*[@id='CollapsePanel-24']/div/div/div/div/div[1]/div/div[1]/div/label/span[1]/span");
    private static final By SelectMetal = By.xpath("//*[@id='CollapsePanel-24']/div/div/div/div/div[1]/div/div[2]/div/label/span[1]/span");
    private static final By PricePerItem = By.xpath("//p[contains(text(),'Price Per Item')]");
    private static final By Select100To250 = By.xpath("//*[@id='CollapsePanel-26']/div/div/div/div/div[3]/label/span[1]/span");
    private static final By Select500To750 = By.xpath("//*[@id='CollapsePanel-26']/div/div/div/div/div[5]/label/span[1]/span");
    private static final By SelectSortBy = By.xpath("//*[@id='bd']/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div[2]");
    private static final By SelectCustomerRating = By.xpath("//*[@id='downshift-0-item-1']/div/div");

    private static final Logger LOGGER = LogManager.getLogger(ToddlerAndKidsBedroomFurniture.class);
    WebDriver driver = Hooks.driver;

    @Given("^user open the home page$")
    public void navigateToHomePage() throws InterruptedException {
        driver.get("https://www.wayfair.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        LOGGER.info("User is in the Home Page");
    }

    @Then("^user mouse hovered to Baby & Kids button$")
    public void mouseHoverToBabyAndKids() throws InterruptedException {
        Thread.sleep(3000);
        ActOn.element(driver, BabyAndKids).mouseHover();
        LOGGER.info("User mouse hover to Baby & Kids tab");
    }

    @And("^click on Toddler and Kids Bedroom Furniture$")
    public void clickToddlerAndKidsBedroomFurniture() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, ToddlerAndKidsBedRoomFurniture).click();
        LOGGER.info("User clicked on Toddler and Kids Bedroom Furniture");
    }

    @Then("^user click on Kids Beds$")
    public void clickOnKidsBeds() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, KidsBeds).click();
        LOGGER.info("User clicked on Kids Beds");
    }

    @And("^Select Bed Size Toddler$")
    public void selectToddlerBed() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectToddler).click();
        LOGGER.info("User Selected Bed Size as Toddler");
    }

    @Then("^select color as White and Black$")
    public void selectBlackAndWhiteColor() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, ColorWhite).click();
        Thread.sleep(1000);
        ActOn.element(driver, ColorBlack).click();
        LOGGER.info("User Selected color as White and Black");
    }

    @Then("^click on Material and select Wood and Metal$")
    public void selectMaterials() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, ClickMaterial).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectWood).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectMetal).click();
        LOGGER.info("User Clicked on Material and selected Wood and Metal");
    }

    @Then("^Click on Price Per item and select option 100 to 250 and 500 to 750$")
    public void clickOnPricePerItem() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, PricePerItem).click();
        Thread.sleep(1000);
        ActOn.element(driver, Select100To250).click();
        Thread.sleep(1000);
        ActOn.element(driver, Select500To750).click();
        LOGGER.info("User Clicked on Price Per item and select option 100 to 250 and 500 to 750");
    }

    @Then("^Click On Sort By Option and Select Customer Rating$")
    public void clickOnSortByAndSelectCustomerRating() throws InterruptedException {
        Thread.sleep(7000);
        ActOn.element(driver, SelectSortBy).click();
        Thread.sleep(2000);
        ActOn.element(driver, SelectCustomerRating).click();
        LOGGER.info("User Clicked On Sort By Option and Select Customer Rating");
    }

    @Then("^user closed the webbrowser$")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        LOGGER.info("User closed the browser");
    }
}
