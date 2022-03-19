package BTA.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class CelojumuPage extends BaseFunction{
    private final By CELOJUMA_GALAMERKIS_FIELD = By.xpath(".//button[@id = 'regionalSelectorRegion-open']");
    private final By IZVELIES_VALSTI_BTN = By.xpath(".//div[@id = 'regionalSelectorCountry']");
    private final By PIEVIENOT_VALSTI_BTN = By.xpath(".//span[@class = 'text add-text']");


    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    public CelojumuPage(BaseFunction baseFunction) {

    }

    public void scrollDownCelojumaPage() {
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;

        LOGGER.info("Scrolling down the page");
        scrollDown.executeScript("windows.scrollBy(0, 400)");
    }

    public void lookingForCelojumaGalamerkisField() {
        LOGGER.info("Looking for Celojuma Galamerkis Field to click on it");

        click(CELOJUMA_GALAMERKIS_FIELD);
    }

    public void lookingForIzvelValstiBtnPopupWindow() {
        LOGGER.info("Looking for Izvelietis valsti button to click on it");

        click(IZVELIES_VALSTI_BTN);
    }

    public void lookingForPievienValstBtn(){
        LOGGER.info("Looking for Pienienot valsti field to click on it ");

        click(PIEVIENOT_VALSTI_BTN);
    }
}
