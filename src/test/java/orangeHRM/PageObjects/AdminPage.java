package orangeHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {

    WebDriver driver;
    public AdminPage(WebDriver driver){

        this.driver = driver;
    }
    public By adminPage = By.xpath("//input[@name='']");
}
