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


public class BedroomFurniture {

    private static final By FurnitureTab = By.linkText("Furniture");
    private static final By BedRoomFurniture = By.xpath("//div/ul/li[2]/a/h3[text()='Bedroom']");
    private static final By BedRoomSets = By.xpath("//p[contains(text(),'Bedroom Sets')]");
    private static final By KingSizeBed = By.xpath("//div[5]/div/div/div/label[@data-enzyme-id='ImageCheckbox']");
    private static final By BedColorWhite = By.xpath("//*[@id='CollapsePanel-17']//div[1]/div/label/span[1]/span");
    private static final By BedColorGray = By.xpath("//*[@id='CollapsePanel-17']//div[2]/div/label/span[1]/span");
    private static final By BedType = By.xpath("//div[1]/p[text()='Bed Type']");
    private static final By BedPlatForm = By.xpath("//*[@id='CollapsePanel-18']//div[1]/div/label/span[1]/span");
    private static final By SortBy = By.xpath("//div/div/div[1]/div[1][@class='pl-DropdownInput-valueContainer']");
    private static final By PriceLowToHigh = By.xpath("//*[@id='downshift-0-item-3']/div/div[text()='Price Per Item: High-Low']");

    private static final Logger LOGGER = LogManager.getLogger(BedroomFurniture.class);
    WebDriver driver = Hooks.driver;

    @Given("^user navigate to the home page$")
    public void navigateToHomePage() throws InterruptedException {
        driver.get("https://www.wayfair.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        LOGGER.info("User is in the Home Page");
    }

    @When("^user mouse hover to furniture option$")
    public void mouseHoverOnFurnitureTab() throws InterruptedException {
        ActOn.element(driver, FurnitureTab).mouseHover();
        Thread.sleep(3000);
        LOGGER.info("User mouse hover to furniture tab");
    }

    @And("^click Bed Room Furniture$")
    public void clickBedRoomFurniture() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, BedRoomFurniture).click();
        LOGGER.info("User clicked on Bedroom Furniture$");
    }

    @Then("^user click on Bedroom Sets tab$")
    public void clickOnBedroomSets() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, BedRoomSets).click();
        LOGGER.info("User clicked on Bedroom sets tab");
    }

    @Then("^user select bed size$")
    public void selectBedSize() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, KingSizeBed).click();
        LOGGER.info("User clicked on Bed size");
    }

    @Then("^user select White color$")
    public void selectColorWhite() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, BedColorWhite).click();
        LOGGER.info("User clicked on Bed color white");
    }

    @And("^user select Gray color$")
    public void selectColorGray() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, BedColorGray).click();
        LOGGER.info("User clicked on Bed color gray");
    }

    @Then("^user click on Bed Type$")
    public void selectBedType() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, BedType).click();
        LOGGER.info("User select bed type");
    }

    @And("^select Bed Platform Type$")
    public void selectPlatformType() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, BedPlatForm).click();
        LOGGER.info("User select bed platform type");
    }

    @Then("^user click on Sort by dropdown menu$")
    public void clickSortByOption() throws InterruptedException {
        Thread.sleep(5000);
        ActOn.element(driver, SortBy).click();
        LOGGER.info("User click on Sort by dropdown menu");
    }

    @Then("^select price per item Low to High$")
    public void selectPriceRange() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, PriceLowToHigh).click();
        LOGGER.info("User select price per item Low to High");
    }
    @Then("^user closed the browser$")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        LOGGER.info("User closed the browser");
    }
}
