package orangeHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){

        this.driver = driver;
    }
    public By username = By.xpath("//input[@name='username']");
    public By password = By.xpath("//input[@name='password']");
    public By LoginButton = By.xpath("//button[@type='submit']");
}
