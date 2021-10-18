package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    @FindBy(xpath = "//button[@aria-label=\"Consent\"]//p[@class=\"fc-button-label\"]")
    private WebElement buttonConsent;

    @FindBy(xpath = "//div[@id=\"orb-nav-links\"]/ul/li[@class=\"orb-nav-newsdotcom\"]/a")
    private WebElement buttonNewsOnTop;

    @FindBy(xpath = "//div[@id=\"orb-nav-links\"]//*[contains(text(),'Sport')]")
    private WebElement buttonSportOnHeader;

    public void clickOnButtonConsent(){
        buttonConsent.click();
    }

    public void clickOnButtonMewsOnTop(){
        buttonNewsOnTop.click();
    }

    public void clickOnButtonSportOnHeader(){
        buttonSportOnHeader.click();
    }

}
