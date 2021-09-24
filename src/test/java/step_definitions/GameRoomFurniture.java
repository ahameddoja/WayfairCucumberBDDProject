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

public class GameRoomFurniture {

    private static final By FurnitureTab = By.linkText("Furniture");
    private static final By GameRoomFurniture = By.xpath("//h3[text()='Game Room']");
    private static final By GamingChairs = By.xpath("//p[contains(text(),'Gaming Chairs')]");
    private static final By MinPriceItem = By.xpath("//*[@id='textInput-0']");
    private static final By MaxPriceItem = By.xpath("//*[@id='textInput-1']");
    private static final By SelectChairType = By.xpath("//div[1]/div/div/div/label[@data-hb-id='Selectable']");
    private static final By WeightCapacity = By.xpath("//p[contains(text(),'Weight Capacity')]");
    private static final By WeightUpTo200LB = By.xpath("//*[@id='CollapsePanel-12']//div[2]/div/label/span[1]/span");
    private static final By WeightUpTo300LB = By.xpath("//*[@id='CollapsePanel-12']//div[3]/div/label/span[1]/span");
    private static final By SortBy = By.xpath("//div/div/div[1]/div[1][@class='pl-DropdownInput-valueContainer']");
    private static final By PriceHighToLow = By.xpath("//*[@id='downshift-0-item-3']//div[text()='Price Per Item: High-Low']");

    private static final Logger LOGGER = LogManager.getLogger(GameRoomFurniture.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is navigated to home page$")
    public void navigateToHomePage() throws InterruptedException {
        driver.get("https://www.wayfair.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        LOGGER.info("User is in the Home Page");
    }

    @When("^user mouse hovering to furniture tab$")
    public void mouseHoverOnFurnitureTab() throws InterruptedException {
        ActOn.element(driver, FurnitureTab).mouseHover();
        Thread.sleep(3000);
        LOGGER.info("User mouse hover to furniture tab");
    }

    @And("^click on Game Room Furniture$")
    public void clickOnGameRoomFurniture() throws InterruptedException {
        Thread.sleep(2000);
        ActOn.element(driver, GameRoomFurniture).click();
        LOGGER.info("user clicked on Game Room Furniture");
    }

    @Then("^user click on gaming Chair tab$")
    public void clickOnGamingChair() throws InterruptedException {
        Thread.sleep(2000);
        ActOn.element(driver, GamingChairs).click();
        LOGGER.info("user clicked on gaming Chair tab");
    }

    @Then("^Input Min price 100 and Max price 400 in Price Per item section$")
    public void inputMinMaxPrice() throws InterruptedException {
        Thread.sleep(2000);
        ActOn.element(driver, MinPriceItem).setValue("clear");
        ActOn.element(driver, MinPriceItem).setValue("100");
        Thread.sleep(2000);
        ActOn.element(driver, MaxPriceItem).setValue("clear");
        ActOn.element(driver, MaxPriceItem).setValue("400");
        LOGGER.info("User inputs min and max price range for an item");
    }

    @Then("^user clicked on PC & Racing Chair under Chair Type section$")
    public void clickPCAndRacingChair() throws InterruptedException {
        Thread.sleep(2000);
        ActOn.element(driver, SelectChairType).click();
        LOGGER.info("user clicked PC & Racing Chair");
    }

    @Then("^user click on Weight Capacity tab$")
    public void clickOnWeightCapacity() throws InterruptedException {
        Thread.sleep(2000);
        ActOn.element(driver, WeightCapacity).click();
        LOGGER.info("user clicked on Weight Capacity");
    }

    @Then("^select Up to 200 lbs and 200lbs-300lbs option$")
    public void selectWeight() throws InterruptedException {
        Thread.sleep(2000);
        ActOn.element(driver, WeightUpTo200LB).click();
        ActOn.element(driver, WeightUpTo300LB).click();
        LOGGER.info("User selected Weight Capacity Up to 200 lbs and 200lbs-300lbs");
    }

    @Then("^user click on Sort by tab and select Price per Item High to Low$")
    public void clickSortByAndSelectPriceHighToLow() throws InterruptedException {
        Thread.sleep(7000);
        ActOn.element(driver, SortBy).click();
        Thread.sleep(3000);
        ActOn.element(driver, PriceHighToLow).click();
        LOGGER.info("User clicked on Sort by tab and select Price per Item High to Low");
    }

    @Then("^user close the webbrowser$")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        LOGGER.info("User closed the browser");
    }
}
