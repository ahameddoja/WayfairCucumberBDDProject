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

public class OfficeFurniture {

    private static final By FurnitureTab = By.linkText("Furniture");
    private static final By OfficeFurniture = By.xpath("//span[normalize-space()='Office']");
    private static final By OfficeChairs = By.xpath("//p[text()='Office Chairs']");
    private static final By MinItemPrice = By.xpath("//*[@id='textInput-0']");
    private static final By MaxItemPrice = By.xpath("//input[@id='textInput-1']");
    private static final By ChairType = By.xpath("//*[@id='CollapsePanel-9']/div/div/div/div/div/div[2]/div/div/div/label");
    private static final By ChairArmType = By.xpath("//*[@id='CollapseToggle-11']");
    private static final By ArmStyle = By.xpath("//*[@id='CollapsePanel-11']/div/div/div/div/div[1]/div/div/div[2]/div/div/div/label");
    private static final By ClickNextButton = By.xpath("//a[@aria-label='Next']");


    private static final Logger LOGGER = LogManager.getLogger(OfficeFurniture.class);
    WebDriver driver = Hooks.driver;

    @Given("^user open the homepage$")
    public void navigateToHomePage() throws InterruptedException {
        driver.get("https://www.wayfair.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        LOGGER.info("User is in the Home Page");
    }

    @When("^user mouse hover to furniture options$")
    public void mouseHoverOnFurnitureTab() throws InterruptedException {
        ActOn.element(driver, FurnitureTab).mouseHover();
        Thread.sleep(3000);
        LOGGER.info("User mouse hover to furniture tab");
    }

    @And("^click on Office Furniture$")
    public void clickOnOfficeLink() {
        ActOn.element(driver, OfficeFurniture).click();
        LOGGER.info("user clicked on office Furniture$ link");
    }

    @Then("^user click on Office Chair tab$")
    public void clickOnOfficeChairButton() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, OfficeChairs).click();
        LOGGER.info("user clicked on office Chair Tab");
    }

    @Then("^Input Min price 75 and Max price 250 in Price Per item section$")
    public void inputMinMaxPrice() throws InterruptedException {
        Thread.sleep(3000);
        ActOn.element(driver, MinItemPrice).setValue("clear");
        ActOn.element(driver, MinItemPrice).setValue("75");
        Thread.sleep(3000);
        ActOn.element(driver, MaxItemPrice).setValue("clear");
        ActOn.element(driver, MaxItemPrice).setValue("250");
        LOGGER.info("User inputs min and max price range for an item");

    }

    @Then("^user click on Executive Chair under Type section$")
    public void clickExecutiveChair() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, ChairType).click();
        LOGGER.info("user clicked on Executive Chair under Type section");
    }

    @Then("^user click on Arm Type tab$")
    public void clickArmType() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, ChairArmType).click();
        LOGGER.info("user clicked on Arm Type Tab");
    }

    @Then("^select Arm Style as Armless$")
    public void selectArmStyle() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, ArmStyle).click();
        LOGGER.info("user selected Arm style type as Armless");
    }
    @Then("^user click on next button$")
    public void clickOnNextButton() throws InterruptedException {
        Thread.sleep(2000);
        ActOn.element(driver, ClickNextButton).click();
        LOGGER.info("user clicked on next button");
    }

    @Then("^user did close the browser$")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        LOGGER.info("User closed the browser");
    }
}

