package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabyAndKidsNurseryFurniture {

    private static final By BabyAndKids = By.linkText("Baby & Kids");
    private static final By NurseryFurniture = By.xpath("//div/ul/li[1]//h3[@class='DepartmentDropdown-title'][text()='Nursery']");
    private static final By SelectCribs = By.xpath("//div/p[text()='Cribs']");
    private static final By SelectWhiteColor = By.xpath("//*[@id='CollapsePanel-18']//div[1]/div/label/span[1]/span");
    private static final By SelectGrayColor = By.xpath("//*[@id='CollapsePanel-18']//div[2]/div/label/span[1]/span");
    private static final By MinPriceInput = By.xpath("//input[@id='textInput-19']");
    private static final By MaxPriceInput = By.xpath("//input[@id='textInput-20']");
    private static final By CribType = By.xpath("//p[contains(text(),'Crib Type')]");
    private static final By SelectMini = By.xpath("//*[@id='CollapsePanel-28']//div[1]/div/div[1]/div/label/span[1]/span");
    private static final By SelectStandardSize = By.xpath("//*[@id='CollapsePanel-28']//div[1]/div/div[3]/div/label/span[1]/span");
    private static final By CustomerRating = By.xpath("//p[contains(text(),'Customer Rating')]");
    private static final By SelectFiveStar = By.xpath("//*[@id='CollapsePanel-30']//div[1]/label/span[1]/span");
    private static final By ItemPerPage = By.xpath("//*[@id='sbprodgrid']//div[2][@aria-haspopup='listbox']");
    private static final By Select24 = By.xpath("//div[@class='pl-Box--defaultColor'][normalize-space()='24']");

    private static final Logger LOGGER = LogManager.getLogger(BabyAndKidsNurseryFurniture.class);
    WebDriver driver = Hooks.driver;

    @Given("^user is in the baby and kids home page$")
    public void navigateToHomePage() throws InterruptedException {
        driver.get("https://www.wayfair.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        LOGGER.info("User is in the Home Page");
    }

    @Then("^user mouse hover to Baby & Kids tab$")
    public void mouseHoverToBabyAndKids() throws InterruptedException {
        Thread.sleep(3000);
        ActOn.element(driver, BabyAndKids).mouseHover();
        LOGGER.info("User mouse hover to Baby & Kids tab");
    }

    @And("^click on Nursery Furniture$")
    public void clickONNurseryFurniture() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, NurseryFurniture).click();
        LOGGER.info("User clicked on Nursery Furniture Link");
    }

    @Then("^user click on Cribs$")
    public void clickOnCribs() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectCribs).click();
        LOGGER.info("User clicked on Cribs Tab$");
    }

    @Then("^select color White and Gray$")
    public void selectColor() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectWhiteColor).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectGrayColor).click();
        LOGGER.info("User clicked on selected colors$");
    }
    @Then("^Input Min price 200 Per item$")
    public void inputMinPrice() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, MinPriceInput).setValue("clear");
        Thread.sleep(1000);
        ActOn.element(driver, MinPriceInput).setValue("200");
        LOGGER.info("User inputs min price range for an item");
    }
    @Then("^Input Max price 500 Per item$")
    public void inputMaxMaxPrice() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, MaxPriceInput).setValue("clear");
        Thread.sleep(1000);
        ActOn.element(driver, MaxPriceInput).setValue("500");
        LOGGER.info("User inputs max price range for an item");
    }
    @Then("^click on crib type option$")
    public void clickOnCribType() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, CribType).click();
        LOGGER.info("User clicked on Cribs Type$");
    }
    @And("^Select Size Shape as Mini and Standard Size$")
    public void selectSizeShape() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectMini).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectStandardSize).click();
        LOGGER.info("User selected Mini and Standard Size Shape");
    }
    @Then("^Click on Customer Rating option and Select five star$")
    public void selectCustomerRatings() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, CustomerRating).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectFiveStar).click();
        LOGGER.info("User clicked on Customer Rating option and Select five star$");
    }
    @And("^user click on Item Per Page dropdown and select 24$")
    public void selectItemPerPage() throws InterruptedException {
        Thread.sleep(5000);
        ActOn.element(driver, ItemPerPage).click();
        Thread.sleep(3000);
        ActOn.element(driver, Select24).click();
        LOGGER.info("User clicked on Item Per Page dropdown and select 24$");
    }

    @Then("^user close the baby and kids browser$")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        LOGGER.info("User closed the browser");
    }

}
