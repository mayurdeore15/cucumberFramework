package orangeHRM.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public WebDriver driver;
    public WebDriver WebDriverManager() throws IOException {

        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
        Properties prop = new Properties();
        prop.load(file);
        String URL = prop.getProperty("URL");
        String browser_properties = prop.getProperty("browser");
        String browser_maven = System.getProperty("browser");
        String browser = browser_maven != null? browser_maven : browser_properties;

        if(driver==null){
            if(browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("msedge")){
                System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//src//test//resources//msedgedriver.exe");
                driver = new EdgeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(URL);
        }
        return driver;
    }
}
