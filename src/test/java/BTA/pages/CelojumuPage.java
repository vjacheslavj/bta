package BTA.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class CelojumuPage extends BaseFunction{
    private final By CELOJUMA_GALAMERKIS_FIELD = By.xpath(".//button[@id = 'regionalSelectorRegion-open']");
    private final By IZVELIES_VALSTI_BTN = By.xpath(".//div[@id = 'regionalSelectorCountry']");
    private final By PIEVIENOT_VALSTI_BTN = By.xpath(".//span[@class = 'text add-text']");
    private final By INDIJA = By.xpath("");
    private final By PIELIETOT_BTN = By.xpath(".//button[@id = 'regionalSelectorCountry-applyButton']");
    private final By AKTIVITATES_FIELD = By.xpath(".//button[@id = 'travelActivities-open']");


    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    public CelojumuPage(BaseFunction baseFunction) {

    }

    public void scrollDownCelojumaPage() {
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;

        LOGGER.info("Scrolling down the page");
        scrollDown.executeScript("windows.scrollBy(0, 400)");
    }

    public void lookingForCelojumaGalamerkisField() {
        LOGGER.info("Looking for Celojuma Galamerkis field to click on it");

        click(CELOJUMA_GALAMERKIS_FIELD);
    }

    public void lookingForIzvelValstiBtnPopupWindow() {
        LOGGER.info("Looking for Izvelietis valsti button to click on it");

        click(IZVELIES_VALSTI_BTN);
    }

    public void clickEnterText() {
        LOGGER.info("Typing Indija and clicking on the found");

        clickEnterText(PIEVIENOT_VALSTI_BTN, "Indija");
    }

    public void clickOnIndija() {
        LOGGER.info("Looking for the found country and clicking on it");

        click(INDIJA);
    }

    public void clickOnPielietotBtn() {
        LOGGER.info("Looking for the Pielietot button to click on it");

        click(PIELIETOT_BTN);
    }

    public void lookingForAktivitatesField() {
        LOGGER.info("Looking for Aktivitates field to click on it");

        click(AKTIVITATES_FIELD);
    }
}
