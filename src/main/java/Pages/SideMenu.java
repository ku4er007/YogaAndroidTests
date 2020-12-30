package Pages;

import BaseSetting.BaseData;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.input.BOMInputStream;
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

    public boolean checkLanguageSwitcher() {
        WebElement languageSwitcher = appiumDriver.findElement(By.id("com.unagrande.yogaclub:id/switch_content"));
        return languageSwitcher.isDisplayed();
    }

    public boolean checkEnterClubTitle() {
        WebElement enterClubTitle = appiumDriver.findElement(By.id("com.unagrande.yogaclub:id/nav_item_subscriptions"));
        return enterClubTitle.isDisplayed();
    }

    public boolean checkLessonsTitle() {
        WebElement lessonsTitle = appiumDriver.findElement(By.id("com.unagrande.yogaclub:id/nav_item_lessons"));
        return lessonsTitle.isDisplayed();
    }

    public boolean checkYogaRecipes() {
        WebElement yogaRecipes = appiumDriver.findElement(By.id("com.unagrande.yogaclub:id/nav_item_recipes"));
        return yogaRecipes.isDisplayed();

    }

    public boolean checkAnswersSection() {
        WebElement yogaRecipes = appiumDriver.findElement(By.id("com.unagrande.yogaclub:id/nav_item_faq"));
        return yogaRecipes.isDisplayed();
    }

    public boolean checkShareSection() {
        WebElement shareSection = appiumDriver.findElement(By.id("com.unagrande.yogaclub:id/nav_item_share_app"));
        return shareSection.isDisplayed();

    }

    public boolean checkYogaLogo() {
        WebElement yogaLogo = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[1]"));
        return yogaLogo.isDisplayed();
    }

    public boolean checkYoutubeIcon() {
        WebElement youtubeIcon = appiumDriver.findElement(By.id("com.unagrande.yogaclub:id/nav_open_youtube"));
        return youtubeIcon.isDisplayed();
    }

    public boolean checkFacebookIcon() {
        WebElement facebookIcon = appiumDriver.findElement(By.id("com.unagrande.yogaclub:id/nav_open_facebook"));
        return facebookIcon.isDisplayed();

    }

    public boolean checkVkIcon() {
        WebElement vkIcon = appiumDriver.findElement(By.id("com.unagrande.yogaclub:id/nav_open_vk"));
        return vkIcon.isDisplayed();
    }

    public boolean checkInstagramIcon() {
        WebElement vkIcon = appiumDriver.findElement(By.id("com.unagrande.yogaclub:id/nav_open_instagram"));
        return vkIcon.isDisplayed();

    }
}
