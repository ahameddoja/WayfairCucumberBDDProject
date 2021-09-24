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

public class LivingRoomFurniture {

    private static final By FurnitureTab = By.linkText("Furniture");
    private static final By LivingRoomFurniture = By.xpath("//h3[@class='DepartmentDropdown-title'][text()='Living Room']");
    private static final By SofasTab = By.xpath("//*[@id='45982']//div[1]/a[@data-hb-id='Card'][@class='pl-Card pl-Card--contained pl-Card--row']");
    private static final By SelectSofaType = By.xpath("//div[1]/div/div/div[2]/div/div/div/label[@class='pl-SelectableInput'][@data-enzyme-id='ImageCheckbox']");
    private static final By selectSofaDesign = By.xpath("//div[2]/div/div/div[1]/div/div/div/label[@data-hb-id='Selectable'][@data-enzyme-id='ImageCheckbox']");
    private static final By ClickPricePerItem = By.xpath("//p[@data-hb-id='Box'][text()='Price Per Item']");
    private static final By MinPriceRange = By.xpath("//input[@id='textInput-20'][@type='number'][@name='lowVal']");
    private static final By MaxPriceRange = By.xpath("//input[@id='textInput-21'][@type='number'][@name='highVal']");

    private static final Logger LOGGER = LogManager.getLogger(step_definitions.LivingRoomFurniture.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is in the home page$")
        public void navigateToHomePage() throws InterruptedException {
        driver.get("https://www.wayfair.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().deleteAllCookies();
        LOGGER.info("User is in the Home Page");
    }

    @When("^user mouse hover to furniture tab$")
    public void mouseHoverOnFurnitureTab() throws InterruptedException {
        ActOn.element(driver, FurnitureTab).mouseHover();
        Thread.sleep(3000);
        LOGGER.info("User mouse hover to furniture tab");
    }
    @Then("^click Living Room Furniture$")
    public void clickOnLivingRoomFurniture() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, LivingRoomFurniture).click();
        LOGGER.info("User clicked on Living Room Furniture Link");
    }
    @Then("^user click on Sofas tab$")
    public void clickOnSofasTab() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SofasTab).click();
        LOGGER.info("User clicked on Sofas tab");
    }
    @And("^select sofa type$")
    public void setSelectSofaType() throws InterruptedException {
        Thread.sleep(2000);
        ActOn.element(driver, SelectSofaType).click();
        LOGGER.info("User clicked on sofa type");
    }

    @And("^select sofa design$")
    public void setSelectSofaDesign() throws InterruptedException {
        Thread.sleep(2000);
        ActOn.element(driver, selectSofaDesign).click();
        LOGGER.info("User clicked on sofa design");
    }
    @Then("^user click on Price Per Item option$")
    public void clickOnPricePerItemOption() throws InterruptedException {
        Thread.sleep(2000);
        ActOn.element(driver, ClickPricePerItem).click();
        LOGGER.info("User clicked on Price Per Item option");
    }
    @And("^input min price range for an item$")
    public void inputMinMaxPrice() throws InterruptedException {
        Thread.sleep(3000);
        ActOn.element(driver, MinPriceRange).setValue("clear");
        ActOn.element(driver, MinPriceRange).setValue("100");
        LOGGER.info("User inputs min price range for an item");
    }
    @Then("^input max price range for an item$")
    public void inputMaxMaxPrice() throws InterruptedException {
        Thread.sleep(3000);
        ActOn.element(driver, MaxPriceRange).setValue("clear");
        ActOn.element(driver, MaxPriceRange).setValue("500");
        LOGGER.info("User inputs min and max price range for an item");
    }
    @Then("^user close the browser$")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        LOGGER.info("User close the browser");
    }
}
