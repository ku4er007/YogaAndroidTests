package SideMenuTests;

import BaseSetting.BaseData;
import org.testng.annotations.Test;

public class FilterTests extends BaseData {
    @Test(priority = 3)
    public void selectFilterTest() {
        yogaVideoMainList.waitVisibleElement();
        yogaVideoMainList.clickOnFilterButton();
        filterList.waitForPageLoad();
        filterList.clickOnTimeFilter();
        filterList.clickOnTopicFilter();
        filterList.clickOnConfirmFilter();
        yogaVideoMainList.checkFilteredLesson();
        yogaVideoMainList.unselectTimeFilter();
        yogaVideoMainList.unselectTopicFilter();
        yogaVideoMainList.checkMyVideoTitleOnRussian();
    }

    @Test(priority = 2)
    public void addAndRemoveLessonFromFavoritesTest() {
        yogaVideoMainList.waitVisibleElement();
        yogaVideoMainList.scrollPageDown();
        yogaVideoMainList.waitForPageLoad();
        yogaVideoMainList.clickOnLesson();
        lessonDetails.waitVisibleElement();
        lessonDetails.clickOnFavoritesButton();
        lessonDetails.clickOnBackButton();
        yogaVideoMainList.firstScrollPageOnTop1();
        yogaVideoMainList.checkAddedFavoritesLesson();
        yogaVideoMainList.clickOnFavoritesLesson();
        lessonDetails.clickOnFavoritesButton();
        lessonDetails.clickOnBackButton();
        yogaVideoMainList.checkFavoritesPlaceholder();
    }

    @Test(priority = 1)
    public void transitionToLessonDetailsUseTopics() {
        yogaVideoMainList.waitVisibleElement();
        yogaVideoMainList.clickOnTopicFilter();
        yogaVideoMainList.clickOnTimeFilter();
        yogaVideoMainList.clickOnFilteredLesson();
        lessonDetails.check1NumberOfAsans();
        lessonDetails.check1NumberOfPoints();
        lessonDetails.check1NumberOfKkal();
        lessonDetails.clickOn15MinTopic();
        lessonDetails.check2NumberOfAsans();
        lessonDetails.check2NumberOfPoints();
        lessonDetails.check2NumberOfKkal();
        lessonDetails.clickOn20MinTopic();
        lessonDetails.check3NumberOfAsans();
        lessonDetails.check3NumberOfPoints();
        lessonDetails.check3NumberOfKkal();
        lessonDetails.clickOn25MinTopic();
        lessonDetails.check4NumberOfAsans();
        lessonDetails.check4NumberOfPoints();
        lessonDetails.check4NumberOfKkal();
        lessonDetails.clickOn30MinTopic();
        lessonDetails.check5NumberOfAsans();
        lessonDetails.check5NumberOfPoints();
        lessonDetails.check5NumberOfKkal();
        lessonDetails.clickOnBackButton();
        yogaVideoMainList.clickOnTopicFilter();
        yogaVideoMainList.clickOnTimeFilter();
        yogaVideoMainList.checkMyVideoTitleOnRussian();
    }
    @Test(priority = 4)
    public void swipeTopicsAndAddToFavoritesAndRemoveTest(){
        yogaVideoMainList.waitVisibleElement();
        yogaVideoMainList.swipeTopicsFilter();
        yogaVideoMainList.clickOnTopicFilterKidney();
        yogaVideoMainList.scrollPageDown3Time();
        yogaVideoMainList.clickOnLessonHealthyKidneys();
        lessonDetails.waitVisibleElement();
        lessonDetails.checkNumberOfAsans1();
        lessonDetails.checkNumberOfPoints1();
        lessonDetails.checkNumberOfKkal1();
        lessonDetails.clickOnFavoritesButton();
        lessonDetails.clickOnBackButton();
        yogaVideoMainList.firstScrollPageOnTop();
        yogaVideoMainList.clickOnTopicFilterKidney();
        yogaVideoMainList.scrollPagaTopTwice();
        yogaVideoMainList.checkAddedFavoritesLesson1();
        yogaVideoMainList.clickOnAddedFavoriteLesson();
        lessonDetails.clickOnFavoritesButton();
        lessonDetails.clickOnBackButton();
        yogaVideoMainList.checkMyFavoriteVideoPlaceholderOnRussian();

    }
}