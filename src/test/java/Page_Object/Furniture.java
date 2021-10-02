package Page_Object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Furniture {

    public WebDriver driver;

    private static final By FurnitureTab = By.linkText("Furniture");
    private static final By LivingRoomFurniture = By.xpath("//a/h3[text()='Living Room']");
    private static final By SofasTab = By.xpath("//div/div/nav/div/div[1]/a[@data-hb-id='Card'][@class='pl-Card pl-Card--contained pl-Card--row']");
    private static final By ClickTypeDesign = By.xpath("//p[@class='pl-Box--defaultColor'][text()='Type / Design']");
    private static final By SelectSofaType = By.xpath("//div[1]/div/div/div[2]/div/div/div/label[@class='pl-SelectableInput'][@data-enzyme-id='ImageCheckbox']");
    private static final By selectSofaDesign = By.xpath("//div[2]/div/div/div[1]/div/div/div/label[@data-hb-id='Selectable'][@data-enzyme-id='ImageCheckbox']");
    private static final By ClickPricePerItem = By.xpath("//p[@class='pl-Box--defaultColor'][text()='Price Per Item']");
    private static final By MinPriceRange = By.xpath("//input[@id='textInput-7'][@type='number'][@name='lowVal']");
    private static final By MaxPriceRange = By.xpath("//input[@id='textInput-8'][@type='number'][@name='highVal']");

    private static final By BedRoomFurniture = By.xpath("//a/h3[text()='Bedroom']");
    private static final By BedRoomSets = By.xpath("//p[contains(text(),'Bedroom Sets')]");
    private static final By SelectBedSize = By.xpath("//p[@class='pl-Box--defaultColor'][text()='Bed Size']");
    private static final By KingSizeBed = By.xpath("//div[5]/div/div/div/label[@data-enzyme-id='ImageCheckbox']");
    private static final By SelectColor = By.xpath("//p[@class='pl-Box--defaultColor'][text()='Color']");
    private static final By BedColorWhite = By.xpath("//*[@id='CollapsePanel-2']/div/div/div/div/div[1]/div/label/span[1]/span");
    private static final By BedColorGray = By.xpath("//*[@id='CollapsePanel-2']/div/div/div/div/div[2]/div/label/span[1]/span");
    private static final By SelectBedType = By.xpath("//p[@class='pl-Box--defaultColor'][text()='Bed Type']");
    private static final By BedPlatForm = By.xpath("//*[@id='CollapsePanel-3']/div/div/div/div/div[1]/div/div[2]/div/label/span[1]/span");
    private static final By SortBy = By.xpath("//div/div/div[1]/div[1][@class='pl-DropdownInput-valueContainer']");
    private static final By PriceLowToHigh = By.xpath("//div[@class='pl-Box--defaultColor'][text()='Price Per Item: Low-High']");

    private static final By GameRoomFurniture = By.xpath("//h3[text()='Game Room']");
    private static final By GamingChairs = By.xpath("//p[contains(text(),'Gaming Chairs')]");
    private static final By MinPriceItem = By.xpath("//*[@id='textInput-0']");
    private static final By MaxPriceItem = By.xpath("//*[@id='textInput-1']");
    private static final By SelectChairType = By.xpath("//div[1]/div/div/div/label[@data-hb-id='Selectable']");
    private static final By WeightCapacity = By.xpath("//p[contains(text(),'Weight Capacity')]");
    private static final By WeightUpTo200LB = By.xpath("//*[@id='CollapsePanel-12']//div[2]/div/label/span[1]/span");
    private static final By WeightUpTo300LB = By.xpath("//*[@id='CollapsePanel-12']//div[3]/div/label/span[1]/span");
    private static final By PriceHighToLow = By.xpath("//*[@id='downshift-0-item-3']//div[text()='Price Per Item: High-Low']");

    private static final By KitchenAndDining = By.xpath("//h3[@class='DepartmentDropdown-title'][text()='Kitchen &']");
    private static final By DiningTableAndSeating = By.xpath("//p[@data-hb-id='Text'][text()='Dining Tables & Seating']");
    private static final By KitchenAndDiningTable = By.xpath("//p[@data-hb-id='Text'][text()='Kitchen & Dining Tables']");
    private static final By SelectShape = By.xpath("//div[1]/div/div/div[1]/div/div/div/label[@data-hb-id='Selectable']");
    private static final By Seat2 = By.xpath("//*[@id='CollapsePanel-8']//div[1]/div/div[1]/div/label/span[1]/span");
    private static final By Seat4 = By.xpath("//*[@id='CollapsePanel-8']//div[1]/div/div[2]/div/label/span[1]/span");
    private static final By PricePerItem = By.xpath("//p[@data-hb-id='Box'][text()='Price Per Item']");
    private static final By MinPrice = By.xpath("//input[@id='textInput-13'][@type='number'][@name='lowVal']");
    private static final By MaxPrice = By.xpath("//input[@id='textInput-14'][@type='number'][@name='highVal']");

    private static final By OfficeFurniture = By.xpath("//span[@class='DepartmentDropdown-iconContainer'][text()='Office']");
    private static final By OfficeChairs = By.xpath("//p[@data-hb-id='Text'][text()='Office Chairs']");
    private static final By MinItemPrice = By.xpath("//input[@id='textInput-0'][@type='number'][@name='lowVal']");
    private static final By MaxItemPrice = By.xpath("//input[@id='textInput-1'][@type='number'][@name='highVal']");
    private static final By ChairType = By.xpath("//*[@id='CollapsePanel-9']//div[2]/div/div/div/label");
    private static final By ChairArmType = By.xpath("//p[@data-hb-id='Box'][text()='Arm Type']");
    private static final By ArmStyle = By.xpath("//*[@id='CollapsePanel-11']//div[1]/div/div/div[2]/div/div/div/label");
    private static final By ClickNextButton = By.xpath("//a[4][@aria-label='Next'][@data-click-location='PAGINATION:NEXT']");

    private static final Logger LOGGER = LogManager.getLogger(Furniture.class);

    public Furniture(WebDriver driver) {
        this.driver = driver;
    }

    public Furniture mouseHoverToFurnitureTab() {
        ActOn.wait(driver, FurnitureTab).waitForElementToBEVisible();
        ActOn.element(driver, FurnitureTab).mouseHover();
        LOGGER.info("User mouse hover to furniture tab");
        return this;
    }

    public Furniture clickOnLivingRoomFurniture() {
        ActOn.wait(driver, LivingRoomFurniture).waitForElementToBEVisible();
        ActOn.element(driver,LivingRoomFurniture).click();
        LOGGER.info("User clicked on Living Room Furniture Link");
        return this;
    }

    public Furniture clickOnSofasTab(){
        ActOn.wait(driver, SofasTab).waitForElementToBEVisible();
        ActOn.element(driver, SofasTab).click();
        LOGGER.info("User clicked on Sofas tab");
        return this;
    }

    public Furniture clickOnTypeDesign() {
        ActOn.wait(driver, ClickTypeDesign).waitForElementToBEVisible();
        ActOn.element(driver, ClickTypeDesign).click();
        LOGGER.info("User clicked on Sofas Type Design Tab");
        return this;
    }

    public Furniture setSelectSofaType() {
        ActOn.wait(driver, SelectSofaType).waitForElementToBEVisible();
        ActOn.element(driver, SelectSofaType).click();
        LOGGER.info("User clicked on sofa type");
        return this;
    }

    public Furniture setSelectSofaDesign() {
        ActOn.wait(driver, selectSofaDesign).waitForElementToBEVisible();
        ActOn.element(driver, selectSofaDesign).click();
        LOGGER.info("User clicked on sofa design");
        return this;
    }

    public Furniture clickOnPricePerItemOption() {
        ActOn.wait(driver, ClickPricePerItem).waitForElementToBEVisible();
        ActOn.element(driver, ClickPricePerItem).click();
        LOGGER.info("User clicked on Price Per Item option");
        return this;
    }
    public Furniture inputFurnitureMinPrice() {
        ActOn.wait(driver, MinPriceRange).waitForElementToBEVisible();
        ActOn.element(driver, MinPriceRange).setValue("clear");
        ActOn.element(driver, MinPriceRange).setValue("100");
        LOGGER.info("User inputs min price range for an item");
        return this;
    }

    public Furniture inputFurnitureMaxPrice() {
        ActOn.wait(driver, MaxPriceRange).waitForElementToBEVisible();
        ActOn.element(driver, MaxPriceRange).setValue("clear");
        ActOn.element(driver, MaxPriceRange).setValue("500");
        LOGGER.info("User inputs min and max price range for an item");
        return this;
    }

    public Furniture mouseHoverOnFurnitureTab() {
        ActOn.wait(driver, FurnitureTab).waitForElementToBEVisible();
        ActOn.element(driver, FurnitureTab).mouseHover();
        LOGGER.info("User mouse hover to furniture tab");
        return this;
    }

    public Furniture clickBedRoomFurniture() {
        ActOn.wait(driver, BedRoomFurniture).waitForElementToBEVisible();
        ActOn.element(driver, BedRoomFurniture).click();
        LOGGER.info("User clicked on Bedroom Furniture$");
        return this;
    }

    public Furniture clickOnBedroomSets() {
        ActOn.wait(driver, BedRoomSets).waitForElementToBEVisible();
        ActOn.element(driver, BedRoomSets).click();
        LOGGER.info("User clicked on Bedroom sets tab");
        return this;
    }

    public Furniture selectBedSize() {
        ActOn.wait(driver, SelectBedSize).waitForElementToBEVisible();
        ActOn.element(driver, SelectBedSize).click();
        ActOn.element(driver, KingSizeBed).click();
        LOGGER.info("User clicked on Bed size");
        return this;
    }

    public Furniture selectColorWhite() {
        ActOn.wait(driver, SelectColor).waitForElementToBEVisible();
        ActOn.element(driver, SelectColor).click();
        ActOn.element(driver, BedColorWhite).click();
        LOGGER.info("User clicked on Bed color white");
        return this;
    }

    public Furniture selectColorGray() {
        ActOn.wait(driver, BedColorGray).waitForElementToBEVisible();
        ActOn.element(driver, BedColorGray).click();
        LOGGER.info("User clicked on Bed color gray");
        return this;
    }

    public Furniture selectBedType() {
        ActOn.wait(driver, SelectBedType).waitForElementToBEVisible();
        ActOn.element(driver, SelectBedType).click();
        LOGGER.info("User select bed type");
        return this;
    }

    public Furniture selectPlatformType() {
        ActOn.wait(driver,BedPlatForm).waitForElementToBEVisible();
        ActOn.element(driver, BedPlatForm).click();
        LOGGER.info("User select bed platform type");
        return this;
    }

    public Furniture clickSortByOption() throws InterruptedException {
        Thread.sleep(7000);
        ActOn.element(driver, SortBy).click();
        LOGGER.info("User click on Sort by dropdown menu");
        return this;
    }

    public Furniture selectPriceRange() {
        ActOn.wait(driver, PriceLowToHigh).waitForElementToBEVisible();
        ActOn.element(driver, PriceLowToHigh).click();
        LOGGER.info("User select price per item Low to High");
        return this;
    }
    public Furniture mouseHoverOnFurnitureLink() {
        ActOn.element(driver, FurnitureTab).mouseHover();
        ActOn.wait(driver, FurnitureTab).waitForElementToBEVisible();
        LOGGER.info("User mouse hover to furniture tab");
        return this;
    }

    public Furniture clickOnGameRoomFurniture() {
        ActOn.wait(driver, GameRoomFurniture).waitForElementToBEVisible();
        ActOn.element(driver, GameRoomFurniture).click();
        LOGGER.info("user clicked on Game Room Furniture");
        return this;
    }

    public Furniture clickOnGamingChair() {
        ActOn.wait(driver, GamingChairs).waitForElementToBEVisible();
        ActOn.element(driver, GamingChairs).click();
        LOGGER.info("user clicked on gaming Chair tab");
        return this;
    }

    public Furniture inputGamingChairMinMaxPrice() {
        ActOn.wait(driver, MinPriceItem).waitForElementToBEVisible();
        ActOn.element(driver, MinPriceItem).setValue("clear");
        ActOn.element(driver, MinPriceItem).setValue("100");
        ActOn.wait(driver, MaxPriceItem).waitForElementToBEVisible();
        ActOn.element(driver, MaxPriceItem).setValue("clear");
        ActOn.element(driver, MaxPriceItem).setValue("400");
        LOGGER.info("User inputs min and max price range for an item");
        return this;
    }

    public Furniture clickPCAndRacingChair() {
        ActOn.wait(driver, SelectChairType).waitForElementToBEVisible();
        ActOn.element(driver, SelectChairType).click();
        LOGGER.info("user clicked PC & Racing Chair");
        return this;
    }

    public Furniture clickOnWeightCapacity() {
        ActOn.wait(driver, WeightCapacity).waitForElementToBEVisible();
        ActOn.element(driver, WeightCapacity).click();
        LOGGER.info("user clicked on Weight Capacity");
        return this;
    }

    public Furniture selectWeight() {
        ActOn.wait(driver, WeightUpTo200LB).waitForElementToBEVisible();
        ActOn.element(driver, WeightUpTo200LB).click();
        ActOn.wait(driver, WeightUpTo300LB).waitForElementToBEVisible();
        ActOn.element(driver, WeightUpTo300LB).click();
        LOGGER.info("User selected Weight Capacity Up to 200 lbs and 200lbs-300lbs");
        return this;
    }

    public Furniture clickSortByAndSelectPriceHighToLow() {
        ActOn.wait(driver,SortBy).waitForElementToBEVisible();
        ActOn.element(driver, SortBy).click();
        ActOn.wait(driver, PriceHighToLow).waitForElementToBEVisible();
        ActOn.element(driver, PriceHighToLow).click();
        LOGGER.info("User clicked on Sort by tab and select Price per Item High to Low");
        return this;
    }

    public Furniture mouseHoverOnFurnitureButton() {
        ActOn.element(driver, FurnitureTab).mouseHover();
        ActOn.wait(driver, FurnitureTab).waitForElementToBEVisible();
        LOGGER.info("User mouse hover to furniture tab");
        return this;
    }

    public Furniture clickKitchenAndDiningFurniture() {
        ActOn.wait(driver, KitchenAndDining).waitForElementToBEVisible();
        ActOn.element(driver, KitchenAndDining).click();
        LOGGER.info("User clicked on Kitchen and Dining Furniture Link");
        return this;
    }

    public Furniture clickOnDiningTablesAndSeating() {
        ActOn.wait(driver, DiningTableAndSeating).waitForElementToBEVisible();
        ActOn.element(driver, DiningTableAndSeating).click();
        LOGGER.info("User clicked on Dining Tables and Seating tab");
        return this;
    }

    public Furniture clickOnKitchenAndDiningTables() {
        ActOn.wait(driver, KitchenAndDiningTable).waitForElementToBEVisible();
        ActOn.element(driver, KitchenAndDiningTable).click();
        LOGGER.info("User clicked on Kitchen and Dining Room Sets");
        return this;
    }

    public Furniture selectTableShape() {
        ActOn.wait(driver, SelectShape).waitForElementToBEVisible();
        ActOn.element(driver, SelectShape).click();
        LOGGER.info("User selected Rectangular from Table Shape Option");
        return this;
    }

    public Furniture selectSeatsFromSeatingCapacityOption() {
        ActOn.wait(driver, Seat2).waitForElementToBEVisible();
        ActOn.element(driver, Seat2).click();
        ActOn.wait(driver, Seat4).waitForElementToBEVisible();
        ActOn.element(driver, Seat4).click();
        LOGGER.info("User selected Seats 2 and 4 from Seating Capacity Option");
        return this;
    }

    public Furniture clickPricePerItem() {
        ActOn.wait(driver, PricePerItem).waitForElementToBEVisible();
        ActOn.element(driver, PricePerItem).click();
        LOGGER.info("User clicked Price Per Item option");
        return this;
    }

    public Furniture inputKitchenFurnitureMinAndMaxPrice() {
        ActOn.wait(driver, MinPrice).waitForElementToBEVisible();
        ActOn.element(driver, MinPrice).setValue("clear");
        ActOn.element(driver, MinPrice).setValue("200");
        ActOn.wait(driver, MaxPrice).waitForElementToBEVisible();
        ActOn.element(driver, MaxPrice).setValue("clear");
        ActOn.element(driver, MaxPrice).setValue("600");
        LOGGER.info("User inputs min and max price range for an item");
        return this;
    }

    public Furniture mouseHoverOnOfficeFurnitureTab() {
        ActOn.wait(driver, FurnitureTab).waitForElementToBEVisible();
        ActOn.element(driver, FurnitureTab).mouseHover();
        LOGGER.info("User mouse hover to furniture tab");
        return this;
    }

    public Furniture clickOnOfficeLink() {
        ActOn.wait(driver, OfficeFurniture).waitForElementToBEVisible();
        ActOn.element(driver, OfficeFurniture).click();
        LOGGER.info("user clicked on office Furniture$ link");
        return this;
    }

    public Furniture clickOnOfficeChairButton() {
        ActOn.wait(driver, OfficeChairs).waitForElementToBEVisible();
        ActOn.element(driver, OfficeChairs).click();
        LOGGER.info("user clicked on office Chair Tab");
        return this;
    }

    public Furniture inputOfficeChairMinMaxPrice() {
        ActOn.wait(driver, MinItemPrice).waitForElementToBEVisible();
        ActOn.element(driver, MinItemPrice).setValue("clear");
        ActOn.element(driver, MinItemPrice).setValue("75");
        ActOn.wait(driver, MaxItemPrice).waitForElementToBEVisible();
        ActOn.element(driver, MaxItemPrice).setValue("clear");
        ActOn.element(driver, MaxItemPrice).setValue("250");
        LOGGER.info("User inputs min and max price range for an item");
        return this;
    }

    public Furniture clickExecutiveChair() {
        ActOn.wait(driver, ChairType).waitForElementToBEVisible();
        ActOn.element(driver, ChairType).click();
        LOGGER.info("user clicked on Executive Chair under Type section");
        return this;
    }

    public Furniture clickArmType() {
        ActOn.wait(driver, ChairArmType).waitForElementToBEVisible();
        ActOn.element(driver, ChairArmType).click();
        LOGGER.info("user clicked on Arm Type Tab");
        return this;
    }

    public Furniture selectArmStyle() {
        ActOn.wait(driver, ArmStyle).waitForElementToBEVisible();
        ActOn.element(driver, ArmStyle).click();
        LOGGER.info("user selected Arm style type as Armless");
        return this;
    }

    public Furniture clickOnNextButton() {
        ActOn.wait(driver, ClickNextButton).waitForElementToBEVisible();
        ActOn.element(driver, ClickNextButton).click();
        LOGGER.info("user clicked on next button");
        return this;
    }
}
