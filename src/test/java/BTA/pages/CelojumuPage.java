package BTA.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CelojumuPage {
    private final By CELOJUMA_GALAMERKIS_FIELD = By.xpath(".//button[@id = 'regionalSelectorRegion-open']/span[2]");
    private final By IZVELIES_VALSTI_BTN = By.id("regionalSelectorCountry");
    private final By PIEVIENOT_VALSTI_BTN = By.xpath(".//span[@class = 'text add-text']");
    private final By INDIJA = By.xpath(".//button[@data-value = 'Indija']");
    private final By PIELIETOT_BTN = By.id("regionalSelectorCountry-applyButton");
    private final By AKTIVITATES_FIELD = By.id("travelActivities-open");
    private final By SPORTS_PAGE = By.id("travelActivities-popup-select-option-3");
    private final By SANEMT_PIEDAVAJUMU_BTN = By.xpath(".//button[@data-button = 'submit']");
    private final By SELECTED_COUNTRY = By.xpath(".//div[@class = 'selected-countries']/button[1]");
    private final By SELECTED_AKTIVITATE = By.id("travelActivities-open");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    WebDriver driver;
    private BaseFunction baseFunction;

    public CelojumuPage (BaseFunction baseFunction){
        this.baseFunction = baseFunction;
    }

    public void scrollDownCelojumaPage() {
        JavascriptExecutor scrollDown = (JavascriptExecutor) baseFunction.driver;

        LOGGER.info("Scrolling down the page");
        scrollDown.executeScript("window.scrollBy(0, 400)");

        baseFunction.sleep();
    }

    public void lookingForCelojumaGalamerkisField() {
        LOGGER.info("Looking for Celojuma Galamerkis field to click on it");

        baseFunction.click(CELOJUMA_GALAMERKIS_FIELD);
    }

    public void lookingForIzvelValstiBtnPopupWindow() {
        LOGGER.info("Looking for Izvelietis valsti button to click on it");

        baseFunction.click(IZVELIES_VALSTI_BTN);
    }

    public void clickEnterText() {
        LOGGER.info("Typing Indija and clicking on the found");

        baseFunction.clickEnterText(PIEVIENOT_VALSTI_BTN, "Indija");
    }

    public void clickOnIndija() {
        LOGGER.info("Looking for the found country and clicking on it");

        baseFunction.click(INDIJA);
    }

    public void clickOnPielietotBtn() {
        LOGGER.info("Looking for the Pielietot button to click on it");

        baseFunction.click(PIELIETOT_BTN);
    }

    public void lookingForAktivitatesField() {
        LOGGER.info("Looking for Aktivitates field to click on it");

        baseFunction.click(AKTIVITATES_FIELD);
    }

    public void lookingForSportsBtn() {
        LOGGER.info("Looking for Aktivitates field to click on it");

        baseFunction.click(SPORTS_PAGE);
    }

    public void loogingForSanemtPiedavajumuBtn() {
        LOGGER.info("Looking for Sanemt Piedavajumu button to click on it");

        baseFunction.click(SANEMT_PIEDAVAJUMU_BTN);
    }

    public String getSelectedCountryText() {
        LOGGER.info("Looking for the Selected Country");

        return baseFunction.driver.findElement(SELECTED_COUNTRY).getText();
    }

    public String getSelectedAktivitateText() {
        LOGGER.info("Looking for the Selected Aktivitate");

        return baseFunction.driver.findElement(SELECTED_AKTIVITATE).getText();
    }
}

