package orangeHRM.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GenericUtils {
    String Value;
    public WebDriver driver;

    public GenericUtils(WebDriver driver){
        this.driver = driver;
    }
    public void sendKeys(By element, String value){
        driver.findElement(element).sendKeys(value);
    }
    public void ClickElement(By element){
        driver.findElement(element).click();
    }
    public WebElement getElement(By element){
        WebElement ele = driver.findElement(element);
        return ele;
    }
    public List<WebElement> getElements(By elements){
        List<WebElement> allOptions = driver.findElements(elements);
        return allOptions;
    }

}
