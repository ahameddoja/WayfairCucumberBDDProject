package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NurseryBedding {

    private static final By BabyAndKids = By.linkText("Baby & Kids");
    private static final By NurseryBedding = By.xpath("//*[@id='openDropdown9']/div/ul/li[2]/a/h3/span");
    private static final By CribSheets = By.xpath("//p[contains(text(),'Crib Sheets')]");
    private static final By SelectGenderBoy = By.xpath("//*[@id='CollapsePanel-3']/div/div/div/div/div[1]/div/label/span[1]/span");
    private static final By SelectGenderGirl = By.xpath("//*[@id='CollapsePanel-3']/div/div/div/div/div[3]/div/label/span[1]/span");
    private static final By SelectMiniCrib = By.xpath("//*[@id='CollapsePanel-8']/div/div/div/div/div[1]/div/label/span[1]/span");
    private static final By ClickColorTab = By.xpath("//p[contains(text(),'Color')]");
    private static final By SelectColorBlack = By.xpath("//*[@id='CollapsePanel-9']/div/div/div/div/div[2]/div/label/span[1]/span");
    private static final By SelectColorBlue = By.xpath("//*[@id='CollapsePanel-9']/div/div/div/div/div[3]/div/label/span[1]/span");
    private static final By ClickTypeTab = By.xpath("//*[@id='CollapseToggle-10']/div[1]/p");
    private static final By SelectFittedSheet = By.xpath("//*[@id='CollapsePanel-10']/div/div/div/div/div[1]/div/label/span[1]/span");
    private static final By SelectFlatSheet = By.xpath("//*[@id='CollapsePanel-10']/div/div/div/div/div[2]/div/label/span[1]/span");
    private static final By ClickNextButton = By.xpath("//a[@aria-label='Next']");

    private static final Logger LOGGER = LogManager.getLogger(NurseryBedding.class);
    WebDriver driver = Hooks.driver;

    @Given("^user navigated to home page$")
    public void navigateToHomePage() throws InterruptedException {
        driver.get("https://www.wayfair.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        LOGGER.info("User is in the Home Page");
    }

    @Then("^user mouse hovered to Baby & Kids tab$")
    public void mouseHoverToBabyAndKids() throws InterruptedException {
        Thread.sleep(2000);
        ActOn.element(driver, BabyAndKids).mouseHover();
        LOGGER.info("User mouse hover to Baby & Kids tab");
    }

    @And("^click on Nursery Bedding$")
    public void clickOnNurseryBedding() throws InterruptedException {
        Thread.sleep(3000);
        ActOn.element(driver, NurseryBedding).click();
        LOGGER.info("User clicked on Nursery Bedding Link");
    }

    @Then("^user click on Crib Sheets$")
    public void clickOnCribSheets() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, CribSheets).click();
        LOGGER.info("User clicked on Crib Sheets");
    }

    @Then("^select Gender Boy and Girl$")
    public void selectGender() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectGenderBoy).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectGenderGirl).click();
        LOGGER.info("User Selected Gender Boy+ And Girl+");
    }

    @Then("^select color Crib Type Mini Crib$")
    public void selectCribTypeMini() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectMiniCrib).click();
        LOGGER.info("User clicked on Crib Type as Mini");
    }

    @Then("^user click on colors tab$")
    public void clickOnColorsTab() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, ClickColorTab).click();
        LOGGER.info("User clicked on color tab");
    }

    @And("^select Black and Blue$")
    public void selectColors() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectColorBlack).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectColorBlue).click();
        LOGGER.info("User clicked on color Black and Blue");
    }

    @Then("^user click on Type and select Fitted sheet and Flat sheet$")
    public void selectSheets() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, ClickTypeTab).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectFittedSheet).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectFlatSheet).click();
        LOGGER.info("User clicked on Type and select Fitted sheet and Flat sheet");
    }

    @Then("^user click on next button to go to next page$")
    public void clickNextButton() throws InterruptedException {
        Thread.sleep(3000);
        ActOn.element(driver, ClickNextButton).click();
        LOGGER.info("User clicked on on next button to go to next page");
    }

    @Then("^close the browser$")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        LOGGER.info("User closed the browser");
    }
}
