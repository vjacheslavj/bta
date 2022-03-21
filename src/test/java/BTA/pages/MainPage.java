package BTA.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class MainPage {
    private final By COOCKIE_ACCEPT_BTN = By.xpath(".//div[@class = 'container']/div[2]/button[2]");
    private final By CELOJUMI_BTN = By.xpath(".//div[@class = 'list']/a[2]/h4");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunction baseFunction;

    public MainPage (BaseFunction baseFunction){
        this.baseFunction = baseFunction;
    }

    public void lookingForAcceptCoockieBtn() {
        LOGGER.info("Looking for Coockie accept button to click on it");

        baseFunction.click(COOCKIE_ACCEPT_BTN);
    }

    public void lookingForCelojumiBtn() {
        LOGGER.info("Looking for Celojumi button to click on it");

        baseFunction.click(CELOJUMI_BTN);
    }
}
