package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeenBedroomFurniture {

    private static final By BabyAndKids = By.linkText("Baby & Kids");
    private static final By TeenBedRoomFurniture = By.xpath("//*[@id='openDropdown9']/div/ul/li[6]/a/h3");
    private static final By TeenBeds = By.xpath("//p[normalize-space()='Teen Beds']");
    private static final By SelectBedSize = By.xpath("//*[@id='CollapsePanel-0']/div/div/div/div/div/div[4]/div/div/div/label");
    private static final By SelectBedType = By.xpath("//*[@id='CollapsePanel-1']/div/div/div/div[2]/div/div/div/div/div/label");
    private static final By SelectProductType  = By.xpath("//*[@id='CollapsePanel-1']/div/div/div/div[3]/div/div[1]/div/div/div/label");
    private static final By ClickOnColorButton = By.xpath("//button[@id='CollapseToggle-2']");
    private static final By SelectColorBronze = By.xpath("//*[@id='CollapsePanel-2']/div/div/div/div/div[1]/div/label/span[1]/span");
    private static final By SelectColorChrome = By.xpath("//*[@id='CollapsePanel-2']/div/div/div/div/div[2]/div/label/span[1]/span");
    private static final By SelectColorBlack = By.xpath("//*[@id='CollapsePanel-2']/div/div/div/div/div[4]/div/label/span[1]/span");
    private static final By ClickMaterial = By.xpath("//p[normalize-space()='Material']");
    private static final By SelectMetal = By.xpath("//*[@id='CollapsePanel-4']/div/div/div/div[1]/div/div[1]/div/div/div/label");
    private static final By SelectIron = By.xpath("//*[@id='CollapsePanel-4']/div/div/div/div[2]/div/div[2]/div/div/div/label");
    private static final By SortBy = By.xpath("//*[@id='bd']/div[1]/div[1]/div[3]//div[@class='pl-DropdownInput-valueContainer']");
    private static final By PriceLowToHigh = By.xpath("//*[@id='downshift-0-item-2']/div/div");

    private static final Logger LOGGER = LogManager.getLogger(TeenBedroomFurniture.class);
    WebDriver driver = Hooks.driver;

    @Given("^user navigate to the homepage$")
    public void navigateToHomePage() throws InterruptedException {
        driver.get("https://www.wayfair.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        LOGGER.info("User is in the Home Page");
    }

    @Then("^user mouse hover to the Baby & Kids tab$")
    public void mouseHoverToBabyAndKids() throws InterruptedException {
        Thread.sleep(3000);
        ActOn.element(driver, BabyAndKids).mouseHover();
        LOGGER.info("User mouse hover to Baby & Kids tab");
    }

    @And("^click on Teen Bedroom Furniture$")
    public void clickOnTeenBedroomFurniture() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, TeenBedRoomFurniture).click();
        LOGGER.info("User clicked on Teen Bedroom Furniture");
    }

    @Then("^user click on Teen Beds$")
    public void clickOnTeenBeds() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, TeenBeds).click();
        LOGGER.info("User clicked on Teen Beds");
    }

    @And("^Select Bed Size Queen$")
    public void selectBedSize() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectBedSize).click();
        LOGGER.info("User clicked on Teen Beds");
    }

    @Then("^select Bed Type Standard Bed and select Product Type Bunk Bed$")
    public void selectBedTypeAndProductType() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectBedType).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectProductType).click();
        LOGGER.info("User selected Bed Type Standard Bed and select Product Type Bunk Bed");
    }

    @Then("^click on Color button and select color Bronze Chrome and Black$")
    public void clickOnColorButton() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, ClickOnColorButton).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectColorBronze).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectColorChrome).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectColorBlack).click();
        LOGGER.info("User selected Color button and select color Bronze Chrome and Black");
    }

    @Then("^click on Material Tab and select Metal and Iron$")
    public void clickOnMaterial() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, ClickMaterial).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectMetal).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectIron).click();
        LOGGER.info("User clicked on Material Tab and selected Metal and Iron");
    }

    @Then("^Click On Sort By Option and Select Price per Item Low to High$")
    public void clickOnSortByOption() throws InterruptedException {
        Thread.sleep(7000);
        ActOn.element(driver, SortBy).click();
        Thread.sleep(2000);
        ActOn.element(driver, PriceLowToHigh).click();
        LOGGER.info("Clicked On Sort By Option and Selected Price per Item Low to High");
    }

    @Then("^user has close the browser$")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        LOGGER.info("User closed the browser");
    }
}
