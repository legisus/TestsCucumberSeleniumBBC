package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import stepdefinitions.DefinitionSteps;

public class NewsPage extends BasePage {
    public NewsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class=\"gs-c-promo-body gs-u-display-none gs-u-display-inline-block@m gs-u-mt@xs gs-u-mt0@m gel-1/3@m\"]//h3")
    private WebElement topNews;

    @FindBy(xpath = "//div[@class=\"gs-c-promo-body gs-u-display-none gs-u-display-inline-block@m gs-u-mt@xs gs-u-mt0@m gel-1/3@m\"]//a[contains(@class,'heading')]")
    private WebElement topNewClickableElement;
    @FindBy(xpath = "//div[contains(@class, 'secondary-item--1')]//h3")
    private WebElement firstBottomNews;

    @FindBy(xpath = "//div[contains(@class, 'secondary-item--2')]//h3")
    private WebElement secondBottomNews;

    @FindBy(xpath = "//div[contains(@class, 'secondary-item--3')]//h3")
    private WebElement thirdBottomNews;

    @FindBy(xpath = "//div[contains(@class, 'secondary-item--4')]//h3")
    private WebElement fourthBottomNews;

    @FindBy(xpath = "//div[contains(@class, 'secondary-item--5')]//h3")
    private WebElement fifthBottomNews;

    public String getTheNameOfTheHeadlineArticle() {
        return topNews.getText().replaceAll("'","");
    }

    public String checkFirstBottomNews() {
        return firstBottomNews.getText().replaceAll("'","");
    }



    public String checkSecondBottomNews() {
        return secondBottomNews.getText().replaceAll("'","");
    }

    public String checkThirdBottomNews() {
        return thirdBottomNews.getText().replaceAll("'","");
    }

    public String checkFourthBottomNews() {
        return fourthBottomNews.getText().replaceAll("'","");
    }

    public String checkFifthBottomNews(){
        return fifthBottomNews.getText().replaceAll("'", "");
    }

    public void clickOnTheHeadlineNews(){
        topNewClickableElement.click();
    }


}
