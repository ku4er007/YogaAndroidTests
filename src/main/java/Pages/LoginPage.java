package Pages;

import BaseSetting.BaseData;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseData {
    public LoginPage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public LoginPage clickOnLoginButton() {
        WebElement loginButton = appiumDriver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'login_google_btn')]"));
        loginButton.click();
        return this;
    }

    public LoginPage clickOnGoogleAccount() {
        WebElement loginButton = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout"));
        loginButton.click();
        return this;
    }
}
