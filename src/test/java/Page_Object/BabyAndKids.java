package Page_Object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabyAndKids {

    public WebDriver driver;

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

    private static final By SelectKidsPlayRoom = By.xpath("//h3[text()='Kids']");
    private static final By SelectIndoorPlay = By.xpath("//p[contains(text(),'Indoor Play')]");
    private static final By SelectToddlerPlayhouses = By.xpath("//*[@id='545073']//div[7]/a/div[@data-hb-id='Box']");
    private static final By SelectMaterialPlastic = By.xpath("//div[2]/div/div/div/label[@data-hb-id='Selectable']");
    private static final By SelectAge = By.xpath("//*[@id='CollapsePanel-6']//div[1]/div/div/div/label/span[1]/span");
    private static final By SelectMaximumNumberOfKids1 = By.xpath("//div[2]/div/div[1]/div/label/span[1]/span");
    private static final By SelectMaximumNumberOfKids2 = By.xpath("//div[2]/div/label/span[1]/span");
    private static final By ClickIndoorOutdoorUse = By.xpath("//p[@data-hb-id='Box'][contains(text(),'Indoor/Outdoor Use')]");
    private static final By SelectOutdoor = By.xpath("//*[@id='CollapsePanel-8']//div[2]/div/label/span[1]/span");
    private static final By SelectIndoor = By.xpath("//*[@id='CollapsePanel-8']//div[3]/div/label/span[1]/span");
    private static final By ClickColorTab = By.xpath("//p[@data-hb-id='Box'][text()='Color']");
    private static final By SelectColorBrown = By.xpath("//*[@id='CollapsePanel-9']//div[1]/div/label/span[1]/span");
    private static final By SelectColorRed = By.xpath("//*[@id='CollapsePanel-9']//div[2]/div/label/span[1]/span");
    private static final By SelectColorGray = By.xpath("//*[@id='CollapsePanel-9']//div[4]/div/label/span[1]/span");
    private static final By SelectItemPerPage = By.xpath("//span/div/div[1]/div[1][@class='pl-DropdownInput-valueContainer']");
    private static final By SelectItemPerPage96 = By.xpath("//div/div[@data-hb-id='Box'][text()='96']");

    private static final By NurseryBedding = By.xpath("//li[2]/a/h3/span[@class='DepartmentDropdown-iconContainer'][text()=' Bedding']");
    private static final By CribSheets = By.xpath("//p[@data-hb-id='Text'][text()='Crib Sheets']");
    private static final By SelectGenderBoy = By.xpath("//*[@id='CollapsePanel-3']//div[1]/div/label/span[1]/span");
    private static final By SelectGenderGirl = By.xpath("//*[@id='CollapsePanel-3']//div[3]/div/label/span[1]/span");
    private static final By SelectMiniCrib = By.xpath("//*[@id='CollapsePanel-8']//div[1]/div/label/span[1]/span");
    private static final By ClickColorButton = By.xpath("//p[contains(text(),'Color')]");
    private static final By SelectColorBlack = By.xpath("//*[@id='CollapsePanel-9']//div[2]/div/label/span[1]/span");
    private static final By SelectColorBlue = By.xpath("//*[@id='CollapsePanel-9']//div[3]/div/label/span[1]/span");
    private static final By ClickTypeTab = By.xpath("//p[@class='pl-Box--defaultColor'][text()='Type']");
    private static final By SelectFittedSheet = By.xpath("//*[@id='CollapsePanel-10']//div[1]/div/label/span[1]/span");
    private static final By SelectFlatSheet = By.xpath("//*[@id='CollapsePanel-10']//div[2]/div/label/span[1]/span");
    private static final By ClickNextButton = By.xpath("//a[@data-click-location='PAGINATION:NEXT'][@aria-label='Next']");

    private static final By TeenBedRoomFurniture = By.xpath("//h3[@class='DepartmentDropdown-title'][text()='Teen Bedroom']");
    private static final By TeenBeds = By.xpath("//div[1]/a[@data-hb-id='Card'][@class='pl-Card pl-Card--contained pl-Card--row']");
    private static final By SelectBedSize = By.xpath("//*[@id='CollapsePanel-0']//div[4]/div/div/div/label[@class='pl-SelectableInput'][@data-hb-id='Selectable']");
    private static final By SelectBedType = By.xpath("//div[2]/div/div/div/div/div/label[@class='pl-SelectableInput'][@data-enzyme-id='ImageCheckbox']");
    private static final By SelectProductType  = By.xpath("//div[3]/div/div[1]/div/div/div/label[@class='pl-SelectableInput']");
    private static final By ClickOnColorButton = By.xpath("//button[@id='CollapseToggle-2'][@type='button'][@aria-controls='CollapsePanel-2']");
    private static final By SelectColorBronze = By.xpath("//*[@id='CollapsePanel-2']//div[1]/div/label/span[1]/span");
    private static final By SelectColorChrome = By.xpath("//*[@id='CollapsePanel-2']//div[2]/div/label/span[1]/span");
    private static final By SelectBlackColor = By.xpath("//*[@id='CollapsePanel-2']//div[4]/div/label/span[1]/span");
    private static final By ClickMaterial = By.xpath("//p[@class='pl-Box--defaultColor'][@data-hb-id='Box'][text()='Material']");
    private static final By SelectMetal = By.xpath("//*[@id='CollapsePanel-4']//div[1]/div/div[1]/div/div/div/label");
    private static final By SelectIron = By.xpath("//div[2]/div/div[2]/div/div/div/label[@data-enzyme-id='ImageCheckbox']");
    private static final By ItemsPerPage = By.xpath("//*[@id='sbprodgrid']//div[2][@class='pl-DropdownInput-inputContainer'][@aria-haspopup='listbox']");
    private static final By Select96 = By.xpath("//div[@class='pl-Box--defaultColor'][normalize-space()='96']");

    private static final By ToddlerAndKidsBedRoomFurniture = By.xpath("//h3[@class='DepartmentDropdown-title'][text()='Toddler & Kids Bedroom']");
    private static final By KidsBeds = By.xpath("//p[@data-hb-id='Text'][text()='Kids Beds']");
    private static final By SelectToddler  = By.xpath("//*[@id='CollapsePanel-0']//div[1]/div/div/div/label[@class='pl-SelectableInput'][@data-hb-id='Selectable']");
    private static final By ColorWhite  = By.xpath("//*[@id='CollapsePanel-23']//div[1]/div/label/span[1]/span");
    private static final By ColorBlack = By.xpath("//*[@id='CollapsePanel-23']//div[3]/div/label/span[1]/span");
    private static final By ClickOnMaterial = By.xpath("//p[@data-hb-id='Box'][text()='Material']");
    private static final By SelectWood = By.xpath("//*[@id='CollapsePanel-24']//div[1]/div/div[1]/div/label/span[1]/span");
    private static final By SelectedMetal = By.xpath("//*[@id='CollapsePanel-24']//div[1]/div/div[2]/div/label/span[1]/span");
    private static final By PricePerItem = By.xpath("//p[@data-hb-id='Box'][text()='Price Per Item']");
    private static final By Select100To250 = By.xpath("//*[@id='CollapsePanel-26']//div[3]/label/span[1]/span");
    private static final By Select500To750 = By.xpath("//*[@id='CollapsePanel-26']//div[5]/label/span[1]/span");
    private static final By ItemPerPageSelect = By.xpath("//*[@id='sbprodgrid']//div[2][@class='pl-DropdownInput-iconWrapper']");
    private static final By Select24PerPage = By.xpath("//div[@class='pl-Box--defaultColor'][normalize-space()='24']");

    private static final Logger LOGGER = LogManager.getLogger(Page_Object.BabyAndKids.class);

    public BabyAndKids(WebDriver driver) {
        this.driver = driver;
    }

    public BabyAndKids mouseHoverToBabyAndKids() {
        ActOn.wait(driver, BabyAndKids).waitForElementToBEVisible();
        ActOn.element(driver, BabyAndKids).mouseHover();
        LOGGER.info("User mouse hover to Baby & Kids tab");
        return this;
    }

    public BabyAndKids clickOnNurseryFurniture() {
        ActOn.wait(driver, NurseryFurniture).waitForElementToBEVisible();
        ActOn.element(driver, NurseryFurniture).click();
        LOGGER.info("User clicked on Nursery Furniture Link");
        return this;
    }

    public BabyAndKids clickOnCribs() {
        ActOn.wait(driver, SelectCribs).waitForElementToBEVisible();
        ActOn.element(driver, SelectCribs).click();
        LOGGER.info("User clicked on Cribs Tab$");
        return this;
    }

    public BabyAndKids selectColor() {
        ActOn.wait(driver, SelectWhiteColor).waitForElementToBEVisible();
        ActOn.element(driver, SelectWhiteColor).click();
        ActOn.wait(driver, SelectGrayColor).waitForElementToBEVisible();
        ActOn.element(driver, SelectGrayColor).click();
        LOGGER.info("User clicked on selected colors$");
        return this;
    }

    public BabyAndKids inputNurseryFurnitureMinMaxPrice() throws InterruptedException {
        ActOn.wait(driver, MinPriceInput).waitForElementToBEVisible();
        ActOn.element(driver, MinPriceInput).setValue("clear");
        ActOn.wait(driver, MinPriceInput).waitForElementToBEVisible();
        ActOn.element(driver, MinPriceInput).setValue("200");
        ActOn.wait(driver, MaxPriceInput).waitForElementToBEVisible();
        ActOn.element(driver, MaxPriceInput).setValue("clear");
        ActOn.wait(driver, MaxPriceInput).waitForElementToBEVisible();
        ActOn.element(driver, MaxPriceInput).setValue("500");
        LOGGER.info("User inputs min max price range for an item");
        return this;
    }

    public BabyAndKids clickOnCribType() {
        ActOn.wait(driver, CribType).waitForElementToBEVisible();
        ActOn.element(driver, CribType).click();
        LOGGER.info("User clicked on Cribs Type$");
        return this;
    }

    public BabyAndKids selectSizeShape() {
        ActOn.wait(driver, SelectMini).waitForElementToBEVisible();
        ActOn.element(driver, SelectMini).click();
        ActOn.wait(driver, SelectStandardSize).waitForElementToBEVisible();
        ActOn.element(driver, SelectStandardSize).click();
        LOGGER.info("User selected Mini and Standard Size Shape");
        return this;
    }

    public BabyAndKids selectCustomerRatings() {
        ActOn.wait(driver, CustomerRating).waitForElementToBEVisible();
        ActOn.element(driver, CustomerRating).click();
        ActOn.wait(driver, SelectFiveStar).waitForElementToBEVisible();
        ActOn.element(driver, SelectFiveStar).click();
        LOGGER.info("User clicked on Customer Rating option and Select five star$");
        return this;
    }

    public BabyAndKids selectItemPerPage() throws InterruptedException {
        Thread.sleep(5000);
        ActOn.element(driver, ItemPerPage).click();
        ActOn.wait(driver, Select24).waitForElementToBEVisible();
        ActOn.element(driver, Select24).click();
        LOGGER.info("User clicked on Item Per Page dropdown and select 24$");
        return this;
    }

    public BabyAndKids mouseHoverToBabyAndKidsTab() {
        ActOn.wait(driver, BabyAndKids).waitForElementToBEVisible();
        ActOn.element(driver, BabyAndKids).mouseHover();
        LOGGER.info("User mouse hover to Baby & Kids tab");
        return this;
    }

    public BabyAndKids clickOnKidsPlayroom() {
        ActOn.wait(driver, SelectKidsPlayRoom).waitForElementToBEVisible();
        ActOn.element(driver, SelectKidsPlayRoom).click();
        LOGGER.info("User clicked on Kids Playroom");
        return this;
    }

    public BabyAndKids clickOnIndoorPlay() {
        ActOn.wait(driver, SelectIndoorPlay).waitForElementToBEVisible();
        ActOn.element(driver, SelectIndoorPlay).click();
        LOGGER.info("User clicked on click on Indoor Play");
        return this;
    }

    public BabyAndKids clickOnToddlerPlayhouses() {
        ActOn.wait(driver, SelectToddlerPlayhouses).waitForElementToBEVisible();
        ActOn.element(driver, SelectToddlerPlayhouses).click();
        LOGGER.info("User clicked on on Toddler Playhouses");
        return this;
    }

    public BabyAndKids selectPlasticMaterial() {
        ActOn.wait(driver, SelectMaterialPlastic).waitForElementToBEVisible();
        ActOn.element(driver, SelectMaterialPlastic).click();
        LOGGER.info("User Selected Plastic From Material Option");
        return this;
    }

    public BabyAndKids selectAgeAndMaxNumberOfKids() {
        ActOn.wait(driver, SelectAge).waitForElementToBEVisible();
        ActOn.element(driver, SelectAge).click();
        ActOn.wait(driver, SelectMaximumNumberOfKids1).waitForElementToBEVisible();
        ActOn.element(driver, SelectMaximumNumberOfKids1).click();
        ActOn.wait(driver, SelectMaximumNumberOfKids2).waitForElementToBEVisible();
        ActOn.element(driver, SelectMaximumNumberOfKids2).click();
        LOGGER.info("User Selected 3 to 4 years in Age and maximum Number of Kids 4 or more from Age and Number of Kids");
        return this;
    }

    public BabyAndKids clickIndoorOutdoorUse() {
        ActOn.wait(driver, ClickIndoorOutdoorUse).waitForElementToBEVisible();
        ActOn.element(driver, ClickIndoorOutdoorUse).click();
        ActOn.wait(driver, SelectOutdoor).waitForElementToBEVisible();
        ActOn.element(driver, SelectOutdoor).click();
        ActOn.wait(driver, SelectIndoor).waitForElementToBEVisible();
        ActOn.element(driver, SelectIndoor).click();
        LOGGER.info("User Click on Indoor OutDoor use and selected outdoor and indoor");
        return this;
    }

    public BabyAndKids clickColorTab() {
        ActOn.wait(driver, ClickColorTab).waitForElementToBEVisible();
        ActOn.element(driver, ClickColorTab).click();
        ActOn.wait(driver, SelectColorBrown).waitForElementToBEVisible();
        ActOn.element(driver, SelectColorBrown).click();
        ActOn.wait(driver, SelectColorRed).waitForElementToBEVisible();
        ActOn.element(driver, SelectColorRed).click();
        ActOn.wait(driver, SelectColorGray).waitForElementToBEVisible();
        ActOn.element(driver, SelectColorGray).click();
        LOGGER.info("User click on color tab and selected color Brown Red and Gray");
        return this;
    }

    public BabyAndKids clickItemPerPage() throws InterruptedException {
        Thread.sleep(5000);
        ActOn.element(driver, SelectItemPerPage).click();
        ActOn.wait(driver, SelectItemPerPage96).waitForElementToBEVisible();
        ActOn.element(driver, SelectItemPerPage96).click();
        LOGGER.info("User clicked on on Item Per Page dropdown and select 96");
        return this;
    }

    public BabyAndKids mouseHoverToBabyAndKidsLink() {
        ActOn.wait(driver, BabyAndKids).waitForElementToBEVisible();
        ActOn.element(driver, BabyAndKids).mouseHover();
        LOGGER.info("User mouse hover to Baby & Kids tab");
        return this;
    }

    public BabyAndKids clickOnNurseryBedding() {
        ActOn.wait(driver, NurseryBedding).waitForElementToBEVisible();
        ActOn.element(driver, NurseryBedding).click();
        LOGGER.info("User clicked on Nursery Bedding Link");
        return this;
    }

    public BabyAndKids clickOnCribSheets() {
        ActOn.wait(driver, CribSheets).waitForElementToBEVisible();
        ActOn.element(driver, CribSheets).click();
        LOGGER.info("User clicked on Crib Sheets");
        return this;
    }

    public BabyAndKids selectGender() {
        ActOn.wait(driver, SelectGenderBoy).waitForElementToBEVisible();
        ActOn.element(driver, SelectGenderBoy).click();
        ActOn.wait(driver, SelectGenderGirl).waitForElementToBEVisible();
        ActOn.element(driver, SelectGenderGirl).click();
        LOGGER.info("User Selected Gender Boy+ And Girl+");
        return this;
    }

    public BabyAndKids selectCribTypeMini() {
        ActOn.wait(driver, SelectMiniCrib).waitForElementToBEVisible();
        ActOn.element(driver, SelectMiniCrib).click();
        LOGGER.info("User clicked on Crib Type as Mini");
        return this;
    }

    public BabyAndKids clickOnColorsTab() {
        ActOn.wait(driver, ClickColorButton).waitForElementToBEVisible();
        ActOn.element(driver, ClickColorButton).click();
        LOGGER.info("User clicked on color tab");
        return this;
    }

    public BabyAndKids selectColors() {
        ActOn.wait(driver, SelectColorBlack).waitForElementToBEVisible();
        ActOn.element(driver, SelectColorBlack).click();
        ActOn.wait(driver, SelectColorBlue).waitForElementToBEVisible();
        ActOn.element(driver, SelectColorBlue).click();
        LOGGER.info("User clicked on color Black and Blue");
        return this;
    }

    public BabyAndKids selectSheets() {
        ActOn.wait(driver, ClickTypeTab).waitForElementToBEVisible();
        ActOn.element(driver, ClickTypeTab).click();
        ActOn.wait(driver, SelectFittedSheet).waitForElementToBEVisible();
        ActOn.element(driver, SelectFittedSheet).click();
        ActOn.wait(driver, SelectFlatSheet).waitForElementToBEVisible();
        ActOn.element(driver, SelectFlatSheet).click();
        LOGGER.info("User clicked on Type and select Fitted sheet and Flat sheet");
        return this;
    }

    public BabyAndKids clickNextButton() {
        ActOn.wait(driver, ClickNextButton).waitForElementToBEVisible();
        ActOn.element(driver, ClickNextButton).click();
        LOGGER.info("User clicked on on next button to go to next page");
        return this;
    }

    public BabyAndKids mouseHoverToBabyAndKidsButton() {
        ActOn.wait(driver, BabyAndKids).waitForElementToBEVisible();
        ActOn.element(driver, BabyAndKids).mouseHover();
        LOGGER.info("User mouse hover to Baby & Kids tab");
        return this;
    }

    public BabyAndKids clickOnTeenBedroomFurniture() {
        ActOn.wait(driver, TeenBedRoomFurniture).waitForElementToBEVisible();
        ActOn.element(driver, TeenBedRoomFurniture).click();
        LOGGER.info("User clicked on Teen Bedroom Furniture");
        return this;
    }

    public BabyAndKids clickOnTeenBeds() {
        ActOn.wait(driver, TeenBeds).waitForElementToBEVisible();
        ActOn.element(driver, TeenBeds).click();
        LOGGER.info("User clicked on Teen Beds");
        return this;
    }

    public BabyAndKids selectBedSize() {
        ActOn.wait(driver, SelectBedSize).waitForElementToBEVisible();
        ActOn.element(driver, SelectBedSize).click();
        LOGGER.info("User clicked on Teen Beds");
        return this;
    }

    public BabyAndKids selectBedTypeAndProductType() {
        ActOn.wait(driver, SelectBedType).waitForElementToBEVisible();
        ActOn.element(driver, SelectBedType).click();
        ActOn.wait(driver, SelectProductType).waitForElementToBEVisible();
        ActOn.element(driver, SelectProductType).click();
        LOGGER.info("User selected Bed Type Standard Bed and select Product Type Bunk Bed");
        return this;
    }

    public BabyAndKids clickOnColorButton() {
        ActOn.wait(driver, ClickOnColorButton).waitForElementToBEVisible();
        ActOn.element(driver, ClickOnColorButton).click();
        ActOn.wait(driver, SelectColorBronze).waitForElementToBEVisible();
        ActOn.element(driver, SelectColorBronze).click();
        ActOn.wait(driver, SelectColorChrome).waitForElementToBEVisible();
        ActOn.element(driver, SelectColorChrome).click();
        ActOn.wait(driver, SelectBlackColor).waitForElementToBEVisible();
        ActOn.element(driver, SelectBlackColor).click();
        LOGGER.info("User selected Color button and select color Bronze Chrome and Black");
        return this;
    }

    public BabyAndKids clickOnMaterial() {
        ActOn.wait(driver, ClickMaterial).waitForElementToBEVisible();
        ActOn.element(driver, ClickMaterial).click();
        ActOn.wait(driver, SelectMetal).waitForElementToBEVisible();
        ActOn.element(driver, SelectMetal).click();
        ActOn.wait(driver, SelectIron).waitForElementToBEVisible();
        ActOn.element(driver, SelectIron).click();
        LOGGER.info("User clicked on Material Tab and selected Metal and Iron");
        return this;
    }

    public BabyAndKids clickOnSortByOption() {
        ActOn.wait(driver, ItemsPerPage).waitForElementToBEVisible();
        ActOn.element(driver, ItemsPerPage).click();
        ActOn.wait(driver, Select96).waitForElementToBEVisible();
        ActOn.element(driver, Select96).click();
        LOGGER.info("Clicked On item per page and select 24");
        return this;
    }

    public BabyAndKids mouseHoverOnBabyAndKids() {
        ActOn.wait(driver, BabyAndKids).waitForElementToBEVisible();
        ActOn.element(driver, BabyAndKids).mouseHover();
        LOGGER.info("User mouse hover to Baby & Kids tab");
        return this;
    }

    public BabyAndKids clickToddlerAndKidsBedroomFurniture() {
        ActOn.wait(driver, ToddlerAndKidsBedRoomFurniture).waitForElementToBEVisible();
        ActOn.element(driver, ToddlerAndKidsBedRoomFurniture).click();
        LOGGER.info("User clicked on Toddler and Kids Bedroom Furniture");
        return this;
    }

    public BabyAndKids clickOnKidsBeds() {
        ActOn.wait(driver, KidsBeds).waitForElementToBEVisible();
        ActOn.element(driver, KidsBeds).click();
        LOGGER.info("User clicked on Kids Beds");
        return this;
    }

    public BabyAndKids selectToddlerBed() {
        ActOn.wait(driver, SelectToddler).waitForElementToBEVisible();
        ActOn.element(driver, SelectToddler).click();
        LOGGER.info("User Selected Bed Size as Toddler");
        return this;
    }

    public BabyAndKids selectBlackAndWhiteColor() {
        ActOn.wait(driver, ColorWhite).waitForElementToBEVisible();
        ActOn.element(driver, ColorWhite).click();
        ActOn.wait(driver, ColorBlack).waitForElementToBEVisible();
        ActOn.element(driver, ColorBlack).click();
        LOGGER.info("User Selected color as White and Black");
        return this;
    }

    public BabyAndKids selectMaterials() {
        ActOn.wait(driver, ClickOnMaterial).waitForElementToBEVisible();
        ActOn.element(driver, ClickOnMaterial).click();
        ActOn.wait(driver, SelectWood).waitForElementToBEVisible();
        ActOn.element(driver, SelectWood).click();
        ActOn.wait(driver, SelectedMetal).waitForElementToBEVisible();
        ActOn.element(driver, SelectedMetal).click();
        LOGGER.info("User Clicked on Material and selected Wood and Metal");
        return this;
    }

    public BabyAndKids clickOnPricePerItem() {
        ActOn.wait(driver, PricePerItem).waitForElementToBEVisible();
        ActOn.element(driver, PricePerItem).click();
        ActOn.wait(driver, Select100To250).waitForElementToBEVisible();
        ActOn.element(driver, Select100To250).click();
        ActOn.wait(driver, Select500To750).waitForElementToBEVisible();
        ActOn.element(driver, Select500To750).click();
        LOGGER.info("User Clicked on Price Per item and select option 100 to 250 and 500 to 750");
        return this;
    }

    public BabyAndKids clickOnSortByAndSelectCustomerRating() throws InterruptedException {
        Thread.sleep(5000);
        ActOn.element(driver, ItemPerPageSelect).click();
        ActOn.wait(driver, Select24PerPage).waitForElementToBEVisible();
        ActOn.element(driver, Select24PerPage).click();
        LOGGER.info("User Clicked On item per page and select 24");
        return this;
    }
}
