package BTA.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBta {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    @Test
    public void btaTest()  {
        LOGGER.info("This test is doing some actions with Travel insurance and do some checks");

        BaseFunction baseFunction = new BaseFunction();
        baseFunction.openPage("www.bta.lv");

        MainPage mainPage = new MainPage(baseFunction);
        mainPage.lookingForAcceptCoockieBtn();
        mainPage.lookingForCelojumiBtn();

        CelojumuPage celojumuPage = new CelojumuPage(baseFunction);
        celojumuPage.scrollDownCelojumaPage();
        celojumuPage.lookingForCelojumaGalamerkisField();
        celojumuPage.lookingForIzvelValstiBtnPopupWindow();
        celojumuPage.clickEnterText();
        celojumuPage.clickEnterText();
        celojumuPage.clickOnIndija();
        String selectedCountry = celojumuPage.getSelectedCountryText();
        celojumuPage.clickOnPielietotBtn();
        celojumuPage.lookingForAktivitatesField();
        celojumuPage.lookingForSportsBtn();
        String selectedAktivitate = celojumuPage.getSelectedAktivitateText();
        celojumuPage.loogingForSanemtPiedavajumuBtn();

        IzveliesProgrammuPage izveliesProgrammuPage = new IzveliesProgrammuPage(baseFunction);
        izveliesProgrammuPage.scrollDownCelojumaPage();
        izveliesProgrammuPage.lookingForOptimalPlussBtn();
        izveliesProgrammuPage.lookingForKasIrApdrosBtn();
        boolean isPopupWindowDisplayed = izveliesProgrammuPage.isPopupWindowDisplayed();
        izveliesProgrammuPage.lookingForCloseBtn();
        izveliesProgrammuPage.lookingForTurpinatBtn();

        CelotajuDatuPage celotajuDatuPage = new CelotajuDatuPage(baseFunction);

        LOGGER.info("Checking the existance of the fields on the Celojumu datu page and that all the fields are empty");

        assertAll("Some information is not correct",
                () -> assertTrue(baseFunction.driver.findElement(celotajuDatuPage.VARDS_FIELDS).isDisplayed(), "Vards field is not visable"),
                () -> assertTrue(baseFunction.driver.findElement(celotajuDatuPage.UZVARDS_FIELD).isDisplayed(), "Uzvards field is nor visable"),
                () -> assertTrue(baseFunction.driver.findElement(celotajuDatuPage.PERSONAS_KODS_FIELD).isDisplayed(), "Personas kods field is not visable"),
                () -> assertTrue(isPopupWindowDisplayed, "Popup window is not displayed"),
                () -> assertEquals("", celotajuDatuPage.getFieldVardsText(), "Vards field is not empty"),
                () -> assertEquals("", celotajuDatuPage.getFieldUzvardsText(), "Uzvards field is not empty"),
                () -> assertEquals("", celotajuDatuPage.getFieldPersonasKodsText(), "Personas kods field is not empty"),
                () -> assertEquals("Indija", selectedCountry, "Selected country is incorrect"),
                () -> assertEquals("Sports", selectedAktivitate, "Selected Activitate is incorrect"));
        baseFunction.closeBrowser();
    }
}
