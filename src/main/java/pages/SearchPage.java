package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class=\"ssrcss-1qt5at0-StyledDiv e56i0qu1\"]//input")
    private WebElement searchBar;

    @FindBy(xpath = "//div[@class=\"ssrcss-1qt5at0-StyledDiv e56i0qu1\"]//button")
    private WebElement buttonSearch;

    @FindBy(xpath = "//ul[1]//p[@class=\"ssrcss-7sxcrr-PromoHeadline e1f5wbog4\"]")
    private WebElement firstSearchResult;

    @FindBy(xpath = "//h1[@tabindex=\"-1\"]")
    private WebElement articleOfNews;

    @FindBy(xpath = "//span[@class=\"ssrcss-1hhm2vt-SearchText eki2hvo2\"]")
    private WebElement buttonSearchBar;

    public void clickOnSearchbar(){
        searchBar.click();
    }

    public void putInSearchbarString(String s){
        searchBar.sendKeys(s);
    }

    public void clickOnButtonSearch(){
        buttonSearch.click();
    }

    public String getTextFirstSearchResult(){
        return firstSearchResult.getText();
    }

    public String getTextFromArticleOfNews(){
        return articleOfNews.getText();
    }

    public void clickButtonSearchbar(){
        buttonSearchBar.click();
    }





}
