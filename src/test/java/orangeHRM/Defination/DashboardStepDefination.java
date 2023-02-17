package orangeHRM.Defination;

import io.cucumber.java.en.Then;
import orangeHRM.PageObjects.DashboardPage;

import orangeHRM.Utilities.TestSetup;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DashboardStepDefination {

    TestSetup testSetup;
    DashboardPage dashboardPage;
    public DashboardStepDefination(TestSetup testSetup){
        this.testSetup = testSetup;
        dashboardPage = testSetup.pageObjectManager.getDashboardPage();
    }
    @Then("Login must be successfull")
    public void login_must_be_successfull() throws InterruptedException {
        Thread.sleep(2000);
        WebElement ele = testSetup.genericUtils.getElement(dashboardPage.Dashboard);
        Assert.assertTrue(ele.isDisplayed(), "Login Successfull");
    }
}
