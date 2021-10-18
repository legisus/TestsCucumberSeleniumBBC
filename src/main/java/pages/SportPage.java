package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportPage extends BasePage {
    public SportPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class=\"sp-c-sport-navigation__inner gs-o-list-inline\"]//*[contains(text(),'Football')]")
    private WebElement buttonFootball;

    @FindBy(xpath = "//ul[@id=\"sp-nav-secondary\"]//*[contains(text(),'Scores & Fixtures')]")
    private WebElement buttonScoresAndFixtures;

    @FindBy(xpath = "//input[@id=\"downshift-0-input\"]")
    private WebElement searchBar;

    @FindBy(xpath = "//a[contains(@id,'downshift-0-item-0')]")
    private WebElement selectResults;

    public WebElement getSelectResults() {
        return selectResults;
    }

    @FindBy(xpath = "//a[contains(@href,'/2021-01')]")
    private WebElement january2021;

    @FindBy(xpath = "//a[contains(@href,'/2021-02')]")
    private WebElement february2021;

    @FindBy(xpath = "//a[contains(@href,'/2021-03')]")
    private WebElement march2021;

    @FindBy(xpath = "//a[contains(@href,'/2021-04')]")
    private WebElement april2021;

    @FindBy(xpath = "//a[contains(@href,'/2021-05')]")
    private WebElement may2021;

    @FindBy(xpath = "//a[contains(@href,'/2021-06')]")
    private WebElement june2021;

    @FindBy(xpath = "//a[contains(@href,'/2021-07')]")
    private WebElement july2021;

    @FindBy(xpath = "//a[contains(@href,'/2021-08')]")
    private WebElement august2021;

    @FindBy(xpath = "//a[contains(@href,'/2021-09')]")
    private WebElement september2021;

    @FindBy(xpath = "//a[contains(@href,'/2021-10?filter=results')]")
    private WebElement october2021;

    @FindBy(xpath = "//a[contains(@href,'/2021-11')]")
    private WebElement november2021;

    @FindBy(xpath = "//a[contains(@href,'/2021-12')]")
    private WebElement december2021;


    @FindBy(xpath = "(//span[1]/span[1]/span/span)[1]")
    private WebElement nameFirstLeftCommand;

    @FindBy(xpath = "//span/div/div[1]/ul/li[1]/a/article/div/span[1]/span[2]/span")
    private WebElement scoreFirstLeftCommand;

    @FindBy(xpath = "//span/div/div[1]/ul/li[1]/a/article/div/span[3]/span[1]/span/span")
    private WebElement nameFirstRightCommand;


    @FindBy(xpath = "//span/div/div[1]/ul/li[1]/a/article/div/span[3]/span[2]/span")
    private WebElement scoreFirstRightCommand;


    public void clickOnButtonFootball() {
        buttonFootball.click();
    }

    public void clickOnButtonScoresAndFixtures() {
        buttonScoresAndFixtures.click();
    }

    public void clickOnSearchBar() {
        searchBar.click();
    }

    public void putKeyInSearchBar(String key) {
        searchBar.sendKeys(key);
    }

    public void clickOnSelectResults() {
        selectResults.click();
    }

    public void clickOnResultsJanuary2021() {
        january2021.click();
    }

    public void clickOnResultsFebruary2021() {
        february2021.click();
    }

    public void clickOnResultsMarch2021() {
        march2021.click();
    }

    public void clickOnResultsApril2021() {
        april2021.click();
    }

    public void clickOnResultsMay2021() {
        may2021.click();
    }

    public void clickOnResultsJune2021() {
        june2021.click();
    }

    public void clickOnResultsJuly2021() {
        july2021.click();
    }

    public void clickOnResultsAugust2021() {
        august2021.click();
    }

    public void clickOnResultsSeptember2021() {
        september2021.click();
    }

    public void clickOnOctober2021() {
        october2021.click();
    }

    public void clickOnNovember2021() {
        november2021.click();
    }

    public void clickOnDecember2021() {
        december2021.click();
    }

    public String getNameFirstLeftCommand() {
        return nameFirstLeftCommand.getText();
    }

    public WebElement nameFirstLeftCommand(){
        return nameFirstLeftCommand;
    }

    public void clickNameFirstLeftCommand() {
        nameFirstLeftCommand.click();
    }

    public String getScoreFirstLeftCommand() {
        return scoreFirstLeftCommand.getText();
    }

    public String getNameFirstRightCommand() {
        return nameFirstRightCommand.getText();
    }

    public String getScoreFirstRightCommand() {
        return scoreFirstRightCommand.getText();
    }

    public WebElement nameFirstRightCommand(){
        return nameFirstLeftCommand;
    }
}
