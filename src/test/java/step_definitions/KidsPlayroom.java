package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KidsPlayroom {

    private static final By BabyAndKids = By.linkText("Baby & Kids");
    private static final By SelectKidsPlayRoom = By.xpath("//*[@id='openDropdown9']/div/ul/li[9]/a/h3/span");
    private static final By SelectIndoorPlay = By.xpath("//p[contains(text(),'Indoor Play')]");
    private static final By SelectToddlerPlayhouses = By.xpath("//p[normalize-space()='Toddler Playhouses']");
    private static final By SelectMaterialPlastic = By.xpath("//*[@id='CollapsePanel-0']/div/div/div/div/div/div[2]/div/div/div/label");
    private static final By SelectAge = By.xpath("//*[@id='CollapsePanel-6']/div/div/div/div/div[1]/div/div/div/label/span[1]/span");
    private static final By SelectMaximumNumberOfKids1 = By.xpath("//*[@id='CollapsePanel-6']/div/div/div/div/div[2]/div/div[1]/div/label/span[1]/span");
    private static final By SelectMaximumNumberOfKids2 = By.xpath("//*[@id='CollapsePanel-6']/div/div/div/div/div[2]/div/div[2]/div/label/span[1]/span");
    private static final By ClickIndoorOutdoorUse = By.xpath("//p[contains(text(),'Indoor/Outdoor Use')]");
    private static final By SelectOutdoor = By.xpath("//*[@id='CollapsePanel-8']/div/div/div/div/div[2]/div/label/span[1]/span");
    private static final By SelectIndoor = By.xpath("//*[@id='CollapsePanel-8']/div/div/div/div/div[3]/div/label/span[1]/span");
    private static final By ClickColorTab = By.xpath("//*[@id='CollapseToggle-9']");
    private static final By SelectColorBrown = By.xpath("//*[@id='CollapsePanel-9']/div/div/div/div/div[1]/div/label/span[1]/span");
    private static final By SelectColorRed = By.xpath("//*[@id='CollapsePanel-9']/div/div/div/div/div[2]/div/label/span[1]/span");
    private static final By SelectColorGray = By.xpath("//*[@id='CollapsePanel-9']/div/div/div/div/div[4]/div/label/span[1]/span");
    private static final By SelectItemPerPage = By.xpath("//*[@id='sbprodgrid']/div[2]/div/div[1]/span/div/div[1]/div[1]/div[2]");
    private static final By SelectItemPerPage96 = By.xpath("//*[@id='downshift-29-item-2']/div/div");


    private static final Logger LOGGER = LogManager.getLogger(KidsPlayroom.class);
    WebDriver driver = Hooks.driver;

    @Given("^user navigated to homepage$")
    public void navigateToHomePage() throws InterruptedException {
        driver.get("https://www.wayfair.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        LOGGER.info("User is in the Home Page");
    }

    @Then("^user mouse hover to Baby & Kids button$")
    public void mouseHoverToBabyAndKids() throws InterruptedException {
        Thread.sleep(3000);
        ActOn.element(driver, BabyAndKids).mouseHover();
        LOGGER.info("User mouse hover to Baby & Kids tab");
    }

    @And("^click on Kids Playroom$")
    public void clickOnKidsPlayroom() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectKidsPlayRoom).click();
        LOGGER.info("User clicked on Kids Playroom");
    }

    @Then("^user click on Indoor Play$")
    public void clickOnIndoorPlay() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectIndoorPlay).click();
        LOGGER.info("User clicked on click on Indoor Play");
    }

    @Then("^user click on Toddler Playhouses$")
    public void clickOnToddlerPlayhouses() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectToddlerPlayhouses).click();
        LOGGER.info("User clicked on on Toddler Playhouses");
    }

    @And("^Select Plastic from Material Option$")
    public void selectPlasticMaterial() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectMaterialPlastic).click();
        LOGGER.info("User Selected Plastic From Material Option");
    }

    @Then("^Select 3 to 4 years in Age and maximum Number of Kids 4 or more from Age and Number of Kids option$")
    public void selectAgeAndMaxNumberOfKids() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, SelectAge).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectMaximumNumberOfKids1).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectMaximumNumberOfKids2).click();
        LOGGER.info("User Selected 3 to 4 years in Age and maximum Number of Kids 4 or more from Age and Number of Kids");
    }

    @Then("^click on Indoor OutDoor use Option and select outdoor and indoor option$")
    public void clickIndoorOutdoorUse() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, ClickIndoorOutdoorUse).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectOutdoor).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectIndoor).click();
        LOGGER.info("User Click on Indoor OutDoor use and selected outdoor and indoor");
    }

    @Then("^user click on color tab and select color Brown Red and Gray$")
    public void clickColorTab() throws InterruptedException {
        Thread.sleep(1000);
        ActOn.element(driver, ClickColorTab).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectColorBrown).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectColorRed).click();
        Thread.sleep(1000);
        ActOn.element(driver, SelectColorGray).click();
        LOGGER.info("User click on color tab and selected color Brown Red and Gray");
    }

    @Then("^user click on Item Per Page dropdown and select 96$")
    public void clickItemPerPage() throws InterruptedException {
        Thread.sleep(7000);
        ActOn.element(driver, SelectItemPerPage).click();
        Thread.sleep(3000);
        ActOn.element(driver, SelectItemPerPage96).click();
        LOGGER.info("User clicked on on Item Per Page dropdown and select 96");
    }

    @Then("^user closed the browser page$")
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        LOGGER.info("User closed the browser");
    }
}
