package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MachPage extends BasePage{
    public MachPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div/div/section/article/div[1]/span[1]/span[1]/span/span")
    private WebElement nameLeftCommand;

    @FindBy(xpath = "//div/div/section/article/div[1]/span[1]/span[2]/span")
    private WebElement scoreLeftCommand;

    @FindBy(xpath = "//section/article/div[1]/span[3]/span[1]/span/span")
    private WebElement nameRightCommand;

    @FindBy(xpath = "//section/article/div[1]/span[3]/span[2]/span")
    private WebElement scoreRightCommand;

    public String getNameLeftCommand(){
        return nameLeftCommand.getText();
    }

    public String getScoreLeftCommand(){
        return scoreLeftCommand.getText();
    }

    public String getNameRightCommand(){
        return nameRightCommand.getText();
    }

    public String getScoreRightCommand(){
        return scoreRightCommand.getText();
    }


}
