package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeadlineNewsPage extends BasePage{
    public HeadlineNewsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[@class=\"ssrcss-1lgj0ki-StyledHeading e1fj1fc10\"]")
    private WebElement articleOfNews;

    @FindBy(xpath = "//span[@class=\"ssrcss-1hhm2vt-SearchText eki2hvo2\"]")
    private WebElement buttonSearchBar;

    public String getTextFromArticleOfNews(){
        return articleOfNews.getText();
    }

    public void clickButtonSearchbar(){
        buttonSearchBar.click();
    }






}
