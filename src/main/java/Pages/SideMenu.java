package Pages;

import BaseSetting.BaseData;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SideMenu extends BaseData {
    public SideMenu(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public SideMenu clickOnChangeLanguageSwitcher() {
        WebElement changeLanguageSwitcher = appiumDriver.findElement(By.xpath("//android.widget.Switch[contains(@resource-id,'switch_content')]"));
        changeLanguageSwitcher.click();
        return this;



    }
}
