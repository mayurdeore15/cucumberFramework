package orangeHRM.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericUtils {
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

}
