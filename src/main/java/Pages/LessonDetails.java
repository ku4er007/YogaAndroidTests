package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LessonDetails {
    public LessonDetails(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void waitVisibleElement() {
        WebDriverWait wait = new WebDriverWait(appiumDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView")));
    }

    public LessonDetails clickOnFavoritesButton() {
        WebElement favoritesButton = appiumDriver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'img_favorite')]"));
        favoritesButton.click();
        return this;
    }

    public LessonDetails clickOnBackButton() {
        WebElement backButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
        backButton.click();
        return this;
    }

    public boolean check1NumberOfAsans() {
        WebElement numberOfAsans = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'9 асан')]"));
        return numberOfAsans.isDisplayed();
    }

    public boolean check1NumberOfPoints() {
        WebElement numberOfPoints = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'507 баллов')]"));
        return numberOfPoints.isDisplayed();
    }

    public boolean check1NumberOfKkal() {
        WebElement numberOfKkal = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'73 Ккал')]"));
        return numberOfKkal.isDisplayed();
    }

    public LessonDetails clickOn15MinTopic() {
        WebElement topic15Min = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]"));
        topic15Min.click();
        return this;
    }

    public boolean check2NumberOfAsans() {
        WebElement numberOfAsans = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'12 асан')]"));
        return numberOfAsans.isDisplayed();
    }

    public boolean check2NumberOfPoints() {
        WebElement numberOfPoints = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'801 балл')]"));
        return numberOfPoints.isDisplayed();
    }

    public boolean check2NumberOfKkal() {
        WebElement numberOfKkal = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'115 Ккал')]"));
        return numberOfKkal.isDisplayed();
    }

    public LessonDetails clickOn20MinTopic() {
        WebElement topic20Min = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[3]"));
        topic20Min.click();
        return this;
    }

    public boolean check3NumberOfAsans() {
        WebElement numberOfAsans = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'15 асан')]"));
        return numberOfAsans.isDisplayed();
    }

    public boolean check3NumberOfPoints() {
        WebElement numberOfPoints = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'1036 баллов')]"));
        return numberOfPoints.isDisplayed();
    }

    public boolean check3NumberOfKkal() {
        WebElement numberOfKkal = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'144 Ккал')]"));
        return numberOfKkal.isDisplayed();
    }

    public LessonDetails clickOn25MinTopic() {
        WebElement topic20Min = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[4]"));
        topic20Min.click();
        return this;
    }

    public boolean check4NumberOfAsans() {
        WebElement numberOfAsans = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'16 асан')]"));
        return numberOfAsans.isDisplayed();
    }

    public boolean check4NumberOfPoints() {
        WebElement numberOfPoints = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'1466 баллов')]"));
        return numberOfPoints.isDisplayed();
    }

    public boolean check4NumberOfKkal() {
        WebElement numberOfKkal = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'201 Ккал')]"));
        return numberOfKkal.isDisplayed();
    }

    public LessonDetails clickOn30MinTopic() {
        WebElement topic20Min = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[5]"));
        topic20Min.click();
        return this;
    }

    public boolean check5NumberOfAsans() {
        WebElement numberOfAsans = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'26 асан')]"));
        return numberOfAsans.isDisplayed();
    }

    public boolean check5NumberOfPoints() {
        WebElement numberOfPoints = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'1686 баллов')]"));
        return numberOfPoints.isDisplayed();
    }

    public boolean check5NumberOfKkal() {
        WebElement numberOfKkal = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'231 Ккал')]"));
        return numberOfKkal.isDisplayed();
    }


    public boolean checkNumberOfAsans1() {
        WebElement numberOfAsans = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'19 асан')]"));
        return numberOfAsans.isDisplayed();
    }

    public boolean checkNumberOfPoints1() {
        WebElement numberOfPoints = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'1525 баллов')]"));
        return numberOfPoints.isDisplayed();
    }

    public boolean checkNumberOfKkal1() {
        WebElement numberOfKkal = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'230 Ккал')]"));
        return numberOfKkal.isDisplayed();
    }

    public boolean chaeckLessonTitle() {
        WebElement lessonTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'ПОСЛЕ БЕГА')]"));
        return lessonTitle.isDisplayed();
    }
}
