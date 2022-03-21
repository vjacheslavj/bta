package BTA.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;


public class CelotajuDatuPage {
    public final By VARDS_FIELDS = By.id("travelerFirstName0-text");
    public final By UZVARDS_FIELD = By.id("trvelerLastName0-text");
    public final By PERSONAS_KODS_FIELD = By.id("travelaerIdentityNumber0-text");


    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunction baseFunction;

    public CelotajuDatuPage (BaseFunction baseFunction){
        this.baseFunction = baseFunction;
    }

    public String getFieldVardsText() {
        LOGGER.info("Looking for the value of Vards field");

        return baseFunction.driver.findElement(VARDS_FIELDS).getAttribute("value");
    }

    public String getFieldUzvardsText() {
        LOGGER.info("Looking for the value of Uzvards field");

        return baseFunction.driver.findElement(UZVARDS_FIELD).getAttribute("value");
    }

    public String getFieldPersonasKodsText() {
        LOGGER.info("Looking for the value of Personas kods field");

        return baseFunction.driver.findElement(PERSONAS_KODS_FIELD).getAttribute("value");
    }
}
