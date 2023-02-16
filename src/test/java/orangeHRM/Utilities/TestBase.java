package orangeHRM.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public WebDriver driver;
    public WebDriver WebDriverManager(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        }
        return driver;
    }
}
