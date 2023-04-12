package orangeHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class QATestPage {
    WebDriver driver;
    public QATestPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public By DropDown = By.xpath("//select[@id='oldSelectMenu']");
    public By  DropDownValues = By.xpath("//select[@id='oldSelectMenu']/option");

    @FindBy(xpath = "//select[@id='oldSelectMenu']/option")
    public List<WebElement> List;

    public List<WebElement> getSelects(String dropdown) {
//        if(dropdown.equalsIgnoreCase("program")){
//            return List;
//        }
//        els
//        return List;
//        {
//
//        }
    }
}
