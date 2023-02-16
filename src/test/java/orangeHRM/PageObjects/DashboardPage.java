package orangeHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    WebDriver driver;
    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }
    public By Dashboard = By.xpath("//span[text()='Dashboard']");


}
