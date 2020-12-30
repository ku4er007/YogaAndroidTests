package BaseSetting;

import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.URL;

public class BaseData {
    AppiumDriver appiumDriver;
    public YogaVideoMainList yogaVideoMainList;
    public SideMenu sideMenu;
    public SearchResultList searchResultList;
    public VideoLessonsDetails videoLessonsDetails;
    public LoginPage loginPage;
    public FilterList filterList;
    public LessonDetails lessonDetails;

    @BeforeClass
    public void setup() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy J7 Neo");
        capabilities.setCapability(MobileCapabilityType.UDID, "52000f75b87e947d");
        URL serverAddress = new URL("http://0.0.0.0:4723/wd/hub");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 200);
        capabilities.setCapability("appPackage", "com.unagrande.yogaclub");
        capabilities.setCapability("appActivity", "com.unagrande.yogaclub.presentation.main.HostActivity");
        capabilities.setCapability("platformName", "Android");


        appiumDriver = new AndroidDriver(serverAddress, capabilities);
        yogaVideoMainList = new YogaVideoMainList(appiumDriver);
        sideMenu = new SideMenu(appiumDriver);
        searchResultList = new SearchResultList(appiumDriver);
        videoLessonsDetails = new VideoLessonsDetails(appiumDriver);
        loginPage = new LoginPage(appiumDriver);
        filterList = new FilterList(appiumDriver);
        lessonDetails = new LessonDetails(appiumDriver);

        loginPage.clickOnLoginButton();
        loginPage.waitForPageLoad();
        loginPage.clickOnGoogleAccount();

    }
}
