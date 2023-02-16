package orangeHRM.Defination;

import io.cucumber.java.en.Then;
import orangeHRM.PageObjects.DashboardPage;
import orangeHRM.Utilities.TestSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DashboardStepDefination {

    TestSetup testSetup;
    public DashboardStepDefination(TestSetup testSetup){
        this.testSetup = testSetup;
    }
    @Then("Login must be successfull")
    public void login_must_be_successfull() throws InterruptedException {
        Thread.sleep(2000);
        DashboardPage dashboardPage = new DashboardPage(testSetup.driver);
        WebElement ele = testSetup.driver.findElement(dashboardPage.Dashboard);
        Assert.assertTrue(ele.isDisplayed(), "Login Successfull");
    }
}
