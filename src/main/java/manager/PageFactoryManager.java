package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {
    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return new HomePage(driver);
    }

    public NewsPage getNewsPage(){
        return new NewsPage(driver);
    }

    public HeadlineNewsPage getHeadlineNewsPage(){
        return new HeadlineNewsPage(driver);
    }

    public SearchPage getSearchPage(){
        return new SearchPage(driver);
    }

    public SportPage getSportPage(){
        return new SportPage(driver);
    }

    public MachPage getMachPage(){
        return new MachPage(driver);
    }



}
