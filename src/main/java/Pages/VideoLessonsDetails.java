package Pages;

import BaseSetting.BaseData;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class VideoLessonsDetails extends BaseData {
    public VideoLessonsDetails(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean checkLessonsTitle() {
        WebElement lessonTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'POST-RUN')]"));
        return lessonTitle.isDisplayed();
    }

    public boolean checkLessonsDescription() {
        WebElement lessonDescription = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'text_description')]"));
        return lessonDescription.isDisplayed();
    }
}
