package BTA.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class TestBta {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    @Test
    public void btaTest() {
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
        celojumuPage.clickOnPielietotBtn();
        celojumuPage.lookingForAktivitatesField();

    }
}
