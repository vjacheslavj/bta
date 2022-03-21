package BTA.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class IzveliesProgrammuPage {
    public final By OPTIMALA_PLUSS_BTN = By.xpath(".//button[@datatype = 'selectPolicyPlanOPP']");
    public final By KAS_IR_APDROS_BTN = By.xpath(".//section[@id = 'form-travel-policy']/section/div[2]/button/span[2]");
    public final By POPUP_WINDOW_CLOSE_BTN = By.xpath(".//button[@class = 'popup-close close']");
    public final By TURPINAT_BTN = By.xpath(".//footer/div/button");
    public final By POPUP_WINDOW = By.xpath(".//aside[@class = 'single-popup covered-travel']/div");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    WebDriver driver;
    private BaseFunction baseFunction;

    public IzveliesProgrammuPage (BaseFunction baseFunction){
        this.baseFunction = baseFunction;
    }

    public void scrollDownCelojumaPage() {
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;

        LOGGER.info("Scrolling down the page");
        scrollDown.executeScript("windows.scrollBy(0, 500)");
    }
    public void lookingForOptimalPlussBtn() {
        LOGGER.info("Looking for Optimal pluss button to click on it");

        baseFunction.click(OPTIMALA_PLUSS_BTN);
    }

    public void lookingForKasIrApdrosBtn() {
        LOGGER.info("Looking for Apskati, kas ir aprosinats button to click on it");

        baseFunction.click(KAS_IR_APDROS_BTN);
    }

    public boolean isPopupWindowDisplayed() {
        LOGGER.info("Looking for Popup window that it is displayed");

        return baseFunction.driver.findElement(POPUP_WINDOW).isDisplayed();
    }

    public void lookingForCloseBtn() {
        LOGGER.info("Looking for Popup window close button to click on it");

        baseFunction.click(POPUP_WINDOW_CLOSE_BTN);
    }

    public void lookingForTurpinatBtn() {
        LOGGER.info("Looking for Turpinat button to click on it");

        baseFunction.click(TURPINAT_BTN);
    }
}
