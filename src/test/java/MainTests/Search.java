package MainTests;

import BaseSetting.BaseData;
import org.testng.annotations.Test;

public class Search extends BaseData {

    @Test(priority = 1)
    public void correctSearchResultTest(){
        yogaVideoMainList.waitVisibleElement();
        yogaVideoMainList.clickOnSearchInputField();
        searchResultList.enterCorrectSearchQuery();
        searchResultList.clickOnSearchResult();
        lessonDetails.waitVisibleElement();
        lessonDetails.chaeckLessonTitle();
        lessonDetails.clickOnBackButton();
        yogaVideoMainList.checkMyVideoTitleOnRussian();
    }
    @Test(priority = 2)
    public void noSearchResultTest(){
        yogaVideoMainList.waitVisibleElement();
        yogaVideoMainList.clickOnSearchInputField();
        searchResultList.enterIncorrectSearchQuery();
        searchResultList.checkNoResultIcon();
        searchResultList.clickOnBackButton();
        yogaVideoMainList.checkMyVideoTitleOnRussian();
    }

    @Test(priority = 3)
    public void noResultThenCorrectResultTest(){
        yogaVideoMainList.waitVisibleElement();
        yogaVideoMainList.clickOnSearchInputField();
        searchResultList.enterIncorrectSearchQuery();
        searchResultList.checkNoResultIcon();
        searchResultList.clearSearchInputField();
        searchResultList.enterCorrectSearchQuery();
        searchResultList.clickOnSearchResult();
        lessonDetails.waitVisibleElement();
        lessonDetails.chaeckLessonTitle();
        lessonDetails.clickOnBackButton();
        yogaVideoMainList.checkMyVideoTitleOnRussian();
    }
}
