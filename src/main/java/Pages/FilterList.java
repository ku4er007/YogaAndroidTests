package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FilterList {
    public FilterList(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public FilterList clickOnTimeFilter() {
        WebElement timeFilter10Min = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'10 мин')]"));
        timeFilter10Min.click();
        return this;
    }

    public FilterList clickOnTopicFilter() {
        WebElement topicFilter = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Депрессия')]"));
        topicFilter.click();
        return this;
    }

    public FilterList clickOnConfirmFilter() {
        WebElement confirmFilter = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'btn_apply_filters')]"));
        confirmFilter.click();
        return this;
    }
}
