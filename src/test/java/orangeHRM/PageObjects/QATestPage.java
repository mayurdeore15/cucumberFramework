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
    public List<WebElement> List3;
    @FindBy(xpath = "//select[@id='oldSelectMenu']/option")
    public List<WebElement> List1;
    @FindBy(xpath = "//select[@id='oldSelectMenu']/option")
    public List<WebElement> List2;

    public List<WebElement> getSelects(String dropdownName) {
        List<WebElement> List;
        String name = dropdownName;
        switch (name){
            case "N1":
                List = List1;
                break;
            case "N2":
                List = List2;
                break;
            case "N3":
                List = List3;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }
        return List;
//      if(dropdownName.equalsIgnoreCase("Program")){
//          return List;
//      }
//      else if(dropdownName.equalsIgnoreCase("date")){
//          return List1;
//      }
//      else {
//          return List2;
//      }
    }
}
