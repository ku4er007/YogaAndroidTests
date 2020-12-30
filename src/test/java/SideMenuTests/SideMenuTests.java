package SideMenuTests;

import BaseSetting.BaseData;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SideMenuTests extends BaseData {

    @Test(priority = 1)
    public void changeLanguageTest() {
        yogaVideoMainList.waitForPageLoad();
        yogaVideoMainList.clickOnSideMenuButton();
        sideMenu.clickOnChangeLanguageSwitcher();
        sideMenu.waitForPageLoad();
        yogaVideoMainList.checkMyVideoTitle();

    }
}

