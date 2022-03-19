package BTA.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BaseFunction{
    private final By COOCKIE_ACCEPT_BTN = By.xpath(".//div[@class = 'container']/div[2]/button[2]");
    private final By CELOJUMI_BTN = By.xpath(".//div[@class = 'list']/a[2]/h4");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    public MainPage(BaseFunction baseFunction) {

    }


    public void lookingForAcceptCoockieBtn() {
        LOGGER.info("Looking for Coockie accept button to click on it");

        click(COOCKIE_ACCEPT_BTN);
    }

    public void lookingForCelojumiBtn() {
        LOGGER.info("Looking for Celojumi button to click on it");

        click(CELOJUMI_BTN);
    }

    public void typeIndijaClickOnIt (By locator, String text) {
        LOGGER.info("Typing Indija and clicking on the found");

        wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
    }



}
