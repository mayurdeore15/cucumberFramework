package orangeHRM.Defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangeHRM.Utilities.TestSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginStepDefination {
    WebDriver driver;
    TestSetup testSetup;
    public LoginStepDefination(TestSetup testSetup){
        this.testSetup = testSetup;
    }
    @Given("User navigates to login page of OrangeHRM")
    public void user_navigates_to_login_page_of_orange_hrm() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        testSetup.driver = new ChromeDriver();
        testSetup.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }
    @When("User fills username as {string} and password as {string}")
    public void user_fills_username_as_and_password_as(String username, String password) {
        testSetup.driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        testSetup.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }
    @When("User Click on LoginButton")
    public void user_click_on_login_button() throws InterruptedException {
        Thread.sleep(2000);
        testSetup.driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
