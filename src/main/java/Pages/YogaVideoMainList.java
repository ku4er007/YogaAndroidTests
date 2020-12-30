package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class YogaVideoMainList {

    public YogaVideoMainList(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void waitVisibleElement() {
        WebElement element;
        WebDriverWait wait = new WebDriverWait(appiumDriver, 10);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout")));


    }

    public YogaVideoMainList clickOnSideMenuButton() {
        WebElement sideMenuButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
        sideMenuButton.click();
        return this;
    }

    public boolean checkMyVideoTitle() {
        WebElement myVideoTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'My Videos')]"));
        return myVideoTitle.isDisplayed();

    }

    public YogaVideoMainList clickOnSearchInputField() {
        WebElement searchInputField = appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_search')]"));
        searchInputField.click();
        return this;

    }

    public YogaVideoMainList enterSearchQuery() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_search')]")).sendKeys("run" + Keys.ENTER);
        return this;
    }

    public YogaVideoMainList clickOnFilterButton() {
        WebElement filterButton = appiumDriver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'menu_filters')]"));
        filterButton.click();
        return this;
    }

    public boolean checkFilteredLesson() {
        WebElement lessonName = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Выход из депрессии')]"));
        return lessonName.isDisplayed();
    }

    public YogaVideoMainList unselectTimeFilter() {
        WebElement timeFilterButton = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView[2]/android.widget.TextView[2]"));
        timeFilterButton.click();
        return this;

    }

    public YogaVideoMainList unselectTopicFilter() {
        WebElement timeFilterButton = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.TextView[5]"));
        timeFilterButton.click();
        return this;
    }

    public boolean checkMyVideoTitleOnRussian() {
        WebElement myVideoTitleOnRussian = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView"));
        return myVideoTitleOnRussian.isDisplayed();
    }


    public void scrollDown(int startx, int starty, int endx, int endy) {

        TouchAction touchAction = new TouchAction(appiumDriver);

        touchAction.longPress(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, endy))
                .release()
                .perform();
    }

    public void scrollPageDown() {
        Dimension size = appiumDriver.manage().window().getSize();
        //Starting y location set to 80% of the height (near bottom)
        int starty = (int) (size.height * 0.80);
        //Ending y location set to 20% of the height (near top)
        int endy = (int) (size.height * 0.20);
        //x position set to mid-screen horizontally
        int startx = (int) size.width / 2;
        scrollDown(startx, starty, startx, endy);
        scrollDown(startx, starty, startx, endy);

    }

    public YogaVideoMainList clickOnLesson() {
        WebElement lessonCard = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView[1]"));
        lessonCard.click();
        return this;
    }
    public void firstScrollPageOnTop() {
        Dimension size = appiumDriver.manage().window().getSize();
        //Starting y location set to 80% of the height (near bottom)
        int starty = (int) (size.height * 0.40);
        //Ending y location set to 20% of the height (near top)
        int endy = (int) (size.height * 0.99);
        //x position set to mid-screen horizontally
        int startx = (int) size.width / 2;
        scrollDown(startx, starty, startx, endy);
//        scrollDown(startx, starty, startx, endy);
//        scrollDown(startx, starty, startx, endy);

    }

    public void firstScrollPageOnTop1() {
        Dimension size = appiumDriver.manage().window().getSize();
        //Starting y location set to 80% of the height (near bottom)
        int starty = (int) (size.height * 0.40);
        //Ending y location set to 20% of the height (near top)
        int endy = (int) (size.height * 0.99);
        //x position set to mid-screen horizontally
        int startx = (int) size.width / 2;
        scrollDown(startx, starty, startx, endy);
        scrollDown(startx, starty, startx, endy);
//        scrollDown(startx, starty, startx, endy);

    }
    public void secondScrollPageOnTop() {
        Dimension size = appiumDriver.manage().window().getSize();
        //Starting y location set to 80% of the height (near bottom)
        int starty = (int) (size.height * 0.40);
        //Ending y location set to 20% of the height (near top)
        int endy = (int) (size.height * 0.90);
        //x position set to mid-screen horizontally
        int startx = (int) size.width / 2;
        scrollDown(startx, starty, startx, endy);

    }



    public boolean checkAddedFavoritesLesson() {
        WebElement myFavoritesVideoTitleOnRussian = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'До бега')]"));
        return myFavoritesVideoTitleOnRussian.isDisplayed();
    }

    public boolean checkFavoritesPlaceholder() {
        WebElement favoritesPlaceholder = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.TextView"));
        return favoritesPlaceholder.isDisplayed();

    }

    public YogaVideoMainList clickOnFavoritesLesson() {
        WebElement favoritesLessonCard = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView"));
        favoritesLessonCard.click();
        return this;

    }

    public YogaVideoMainList clickOnTopicFilter() {
        WebElement topicFilter = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.TextView[4]"));
        topicFilter.click();
        return this;
    }

    public YogaVideoMainList clickOnTimeFilter() {
        WebElement timeFilter = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'10 мин')]"));
        timeFilter.click();
        return this;
    }

    public YogaVideoMainList clickOnFilteredLesson() {
        WebElement filteredLesson = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup"));
        filteredLesson.click();
        return this;
    }
//swipe to element by Name
    public void swipeTopicsFilter() {
        MobileElement element = (MobileElement) appiumDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +
                        ".scrollIntoView(new UiSelector().text(\"Похудение\"))"));

    }

    public YogaVideoMainList clickOnTopicFilterKidney() {
        WebElement weightLossTopic = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.TextView[4]"));
        weightLossTopic.click();
        return this;
    }

        public void scrollPageDown3Time() {
            Dimension size = appiumDriver.manage().window().getSize();
            //Starting y location set to 80% of the height (near bottom)
            int starty = (int) (size.height * 0.80);
            //Ending y location set to 20% of the height (near top)
            int endy = (int) (size.height * 0.20);
            //x position set to mid-screen horizontally
            int startx = (int) size.width / 2;
            scrollDown(startx, starty, startx, endy);
            scrollDown(startx, starty, startx, endy);
            scrollDown(startx, starty, startx, endy);


        }

    public YogaVideoMainList clickOnLessonHealthyKidneys() {
        WebElement weightLossTopic = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView"));
        weightLossTopic.click();
        return this;
    }

    public boolean checkAddedFavoritesLesson1() {
        WebElement myFavoritesVideoTitleOnRussian = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Здоровые почки')]"));
        return myFavoritesVideoTitleOnRussian.isDisplayed();
    }

    public YogaVideoMainList clickOnAddedFavoriteLesson() {
        WebElement HealthyKidneysLesson = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup"));
        HealthyKidneysLesson.click();
        return this;

    }

    public boolean checkMyFavoriteVideoPlaceholderOnRussian() {
        WebElement myFavoriteVideoPlaceholderOnRussian = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.TextView"));
        return myFavoriteVideoPlaceholderOnRussian.isDisplayed();
    }

    public void scrollPagaTopTwice() {
        Dimension size = appiumDriver.manage().window().getSize();
        //Starting y location set to 80% of the height (near bottom)
        int starty = (int) (size.height * 0.40);
        //Ending y location set to 20% of the height (near top)
        int endy = (int) (size.height * 0.99);
        //x position set to mid-screen horizontally
        int startx = (int) size.width / 2;
        scrollDown(startx, starty, startx, endy);
        scrollDown(startx, starty, startx, endy);
        scrollDown(startx, starty, startx, endy);

    }
}
