package orangeHRM.Defination;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import orangeHRM.PageObjects.LoginPage;
import orangeHRM.Utilities.TestSetup;



public class LoginStepDefination {

    TestSetup testSetup;
    public LoginStepDefination(TestSetup testSetup){
        this.testSetup = testSetup;
    }
    @Given("User navigates to login page of OrangeHRM")
    public void user_navigates_to_login_page_of_orange_hrm() throws InterruptedException {

        Thread.sleep(4000);
    }
    @When("User fills username as {string} and password as {string}")
    public void user_fills_username_as_and_password_as(String username, String password) {
        LoginPage loginPage = testSetup.pageObjectManager.getLoginPage();
        testSetup.genericUtils.sendKeys(loginPage.username,username);
        testSetup.genericUtils.sendKeys(loginPage.password,password);

    }

    @When("User Click on LoginButton")
    public void user_click_on_login_button() throws InterruptedException {
        Thread.sleep(2000);
        LoginPage loginPage = testSetup.pageObjectManager.getLoginPage();
        testSetup.genericUtils.ClickElement(loginPage.LoginButton);

    }



}
