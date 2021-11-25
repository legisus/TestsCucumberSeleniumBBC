package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.HashMap;
import java.util.Map;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertEquals;

public class DefinitionSteps {
    private static final long DEFAULT_TIMEOUT = 60;
    WebDriver driver;
    PageFactoryManager pageFactoryManager;
    HomePage homePage;
    NewsPage newsPage;
    SearchPage searchPage;
    SportPage sportPage;
    MachPage machPage;
    Map<String, String> map = new HashMap<>();


    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
        homePage = pageFactoryManager.getHomePage();
        newsPage = pageFactoryManager.getNewsPage();
        searchPage = pageFactoryManager.getSearchPage();
        sportPage = pageFactoryManager.getSportPage();
        machPage = pageFactoryManager.getMachPage();
    }

    @And("User opens {string} page")
    public void openPage(final String url) {
        homePage.openHomePage(url);
    }

    @And("user click button consent")
    public void userClickButtonConsent() {
        homePage.implicitWaiater(DEFAULT_TIMEOUT);
        homePage.clickOnButtonConsent();
    }

    @And("user click button news")
    public void userClickButtonNews() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.clickOnButtonMewsOnTop();
    }


    @And("user check the name of the {string} article")
    public void userCheckTheNameOfTheHeadlineArticle(String headline) {
        newsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(newsPage.getTheNameOfTheHeadlineArticle(), headline);
    }

    @And("user checks firstBottomNews {string} article titles")
    public void userChecksFirstBottomNewsFirstBottomNewsArticleTitles(String firstBottomNews) {
        newsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(newsPage.checkFirstBottomNews(), firstBottomNews);
    }

    @And("user checks secondBottomNews {string} article titles")
    public void userChecksSecondBottomNewsSecondBottomNewsArticleTitles(String s) {
        newsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(newsPage.checkSecondBottomNews(), s);
    }

    @And("user checks thirdBottomNews {string} article titles")
    public void userChecksThirdBottomNewsThirdBottomNewsArticleTitles(String s) {
        newsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(newsPage.checkThirdBottomNews(), s);
    }

    @And("user checks fourthBottomNews {string} article titles")
    public void userChecksFourthBottomNewsFourthBottomNewsArticleTitles(String s) {
        newsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(newsPage.checkFourthBottomNews(), s);
    }

    @And("user checks fifthBottomNews {string} article titles")
    public void userChecksFifthBottomNewsFifthBottomNewsArticleTitles(String s) {
        newsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertEquals(newsPage.checkFifthBottomNews(), s);
    }

    @And("user click on button search bar")
    public void userClickOnSearchbar() {
        searchPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchPage.clickButtonSearchbar();
    }


    @And("user click on headline news")
    public void userClickOnHeadlineNews() {
        newsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        newsPage.clickOnTheHeadlineNews();
    }


    @And("user get name article of headline news")
    public void userGetNameArticleOfHeadlineNews() {
        searchPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        map.put("articleName", searchPage.getTextFromArticleOfNews());
    }


    @And("user click on search bar")
    public void userClickOnSearchBar() {
        searchPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchPage.clickOnSearchbar();
    }


    @And("user put name headline article")
    public void userPutNameHeadlineArticle() {
        searchPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchPage.putInSearchbarString(map.get("articleName"));
    }

    @And("user click on button search")
    public void userClickOnButtonSearch() {
        searchPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        searchPage.clickOnButtonSearch();
    }

    @And("user click on search button")
    public void userClickOnSearchButton() {
        searchPage.clickOnButtonSearch();
    }

    @And("user check names articles")
    public void userCheckNamesArticles() {
        searchPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);

        assertEquals(searchPage.getTextFirstSearchResult(), map.get("articleName"));
    }

    @And("User click on button Sport")
    public void userClickOnButtonSport() {
        homePage.implicitWaiater(DEFAULT_TIMEOUT);
        homePage.clickOnButtonSportOnHeader();

    }

    @And("User click on button Football")
    public void userClickOnButtonFootball() {
        sportPage.implicitWaiater(DEFAULT_TIMEOUT);
        sportPage.clickOnButtonFootball();
    }

    @And("User click on button Scores & Fixtures")
    public void userClickOnButtonScoresFixtures() {
        sportPage.implicitWaiater(DEFAULT_TIMEOUT);
        sportPage.clickOnButtonScoresAndFixtures();
    }

    @And("User click on search bar on sport page")
    public void userClickOnSearchBarOnSportPage() {
        sportPage.implicitWaiater(DEFAULT_TIMEOUT);
        sportPage.clickOnSearchBar();
    }

    @And("User put {string} in search bar")
    public void userPutKeyInSearchBar(String key) {
        sportPage.implicitWaiater(DEFAULT_TIMEOUT);
        sportPage.putKeyInSearchBar(key);
    }

    @And("User select and click on search world")
    public void userSelectAndClickOnSearchWorld() {
        sportPage.implicitWaiater(DEFAULT_TIMEOUT);
        sportPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, sportPage.getSelectResults());

        sportPage.clickOnSelectResults();
    }

    @And("User click on January 2021")
    public void userClickOnJanuary() {
        sportPage.implicitWaiater(DEFAULT_TIMEOUT);
        sportPage.clickOnResultsJanuary2021();
    }

    @And("User click on February 2021")
    public void userClickOnFebruary() {
        sportPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        sportPage.clickOnResultsFebruary2021();
    }

    @And("User click on March 2021")
    public void userClickOnMarch() {
        sportPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        sportPage.clickOnResultsMarch2021();
    }

    @And("User click on April 2021")
    public void userClickOnApril() {
        sportPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        sportPage.clickOnResultsApril2021();
    }

    @And("User click on May 2021")
    public void userClickOnMay() {
        sportPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        sportPage.clickOnResultsMay2021();
    }

    @And("User click on June 2021")
    public void userClickOnJune() {
        sportPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        sportPage.clickOnResultsJune2021();
    }

    @And("User click on July 2021")
    public void userClickOnJuly() {
        sportPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        sportPage.clickOnResultsJuly2021();
    }

    @And("User click on August 2021")
    public void userClickOnAugust() {
        sportPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        sportPage.clickOnResultsAugust2021();
    }

    @And("User click on September 2021")
    public void userClickOnSeptember() {
        sportPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        sportPage.clickOnResultsSeptember2021();
    }

    @And("User click on October 2021")
    public void userClickOnOctober() {
        sportPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        sportPage.clickOnOctober2021();
    }

    @And("User click on November 2021")
    public void userClickOnNovember() {
        sportPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        sportPage.clickOnNovember2021();
    }

    @And("User click on December 2021")
    public void userClickOnDecember() {
        sportPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        sportPage.clickOnDecember2021();
    }

    @And("User store first match")
    public void userStoreFirstMatch() {
        sportPage.implicitWaiater(DEFAULT_TIMEOUT);
        sportPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, sportPage.nameFirstLeftCommand());
        sportPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, sportPage.nameFirstRightCommand());

        String firstMach =
                sportPage.getNameFirstLeftCommand() + "." + sportPage.getScoreFirstLeftCommand()+ "."
                        +sportPage.getScoreFirstRightCommand()+ "." +sportPage.getNameFirstRightCommand();
        map.put("firstMach", firstMach);
    }

    @And("User click on first match")
    public void userClickOnFirstMatch() {
        sportPage.implicitWaiater(DEFAULT_TIMEOUT);
        sportPage.clickNameFirstLeftCommand();
    }


    @And("User verify name of commands and scores")
    public void userVerifyNameOfCommandsAndScores() {
        machPage.implicitWaiater(DEFAULT_TIMEOUT);
        String namesCommandAndScoresOfMach =
                machPage.getNameLeftCommand() +"."+ machPage.getScoreLeftCommand()+"."
                        +machPage.getScoreRightCommand()+"."+machPage.getNameRightCommand();
        map.put("namesCommandAndScoresOfMachFromMachPage", namesCommandAndScoresOfMach);
        assertEquals(map.get("firstMach"), map.get("namesCommandAndScoresOfMachFromMachPage"));
    }
}
