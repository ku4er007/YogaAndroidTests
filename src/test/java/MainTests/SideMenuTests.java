package MainTests;

import BaseSetting.BaseData;
import org.testng.annotations.Test;

public class SideMenuTests extends BaseData {

    @Test(priority = 1)
    public void mainElementsSideMenuTest(){
        yogaVideoMainList.waitVisibleElement();
        yogaVideoMainList.clickOnSideMenuButton();
        sideMenu.checkLanguageSwitcher();
        sideMenu.checkEnterClubTitle();
        sideMenu.checkLessonsTitle();
        sideMenu.checkYogaRecipes();
        sideMenu.checkAnswersSection();
        sideMenu.checkShareSection();
        sideMenu.checkYogaLogo();
        sideMenu.checkYoutubeIcon();
        sideMenu.checkFacebookIcon();
        sideMenu.checkVkIcon();
        sideMenu.checkInstagramIcon();
        sideMenu.clickOnChangeLanguageSwitcher();
        yogaVideoMainList.waitVisibleElement();
        yogaVideoMainList.clickOnSideMenuButton();
        sideMenu.checkLanguageSwitcher();
        sideMenu.checkEnterClubTitle();
        sideMenu.checkLessonsTitle();
        sideMenu.checkAnswersSection();
        sideMenu.checkShareSection();
        sideMenu.checkYogaLogo();
        sideMenu.clickOnChangeLanguageSwitcher();
        yogaVideoMainList.waitVisibleElement();
        yogaVideoMainList.checkMyVideoTitleOnRussian();

    }

    @Test(priority = 2)
    public void changeLanguageTest() {
        yogaVideoMainList.waitVisibleElement();
        yogaVideoMainList.clickOnSideMenuButton();
        sideMenu.clickOnChangeLanguageSwitcher();
        sideMenu.waitForPageLoad();
        yogaVideoMainList.checkMyVideoTitle();
    }
}

