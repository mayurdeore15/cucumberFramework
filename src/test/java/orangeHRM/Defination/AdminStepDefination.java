package orangeHRM.Defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangeHRM.PageObjects.AdminPage;
import orangeHRM.Utilities.TestSetup;

public class AdminStepDefination {


    TestSetup testSetup;
    AdminPage adminPage;
    public AdminStepDefination(TestSetup testSetup){
        this.testSetup = testSetup;
        adminPage = testSetup.pageObjectManager.getAdminPage();
    }

    @Given("User is already logged in with admin credentials {string} and {string} to application and navigate to admin panel")
    public void user_is_already_logged_in_with_admin_credentials_and_to_application_and_navigate_to_admin_panel(String string, String string2) {

    }
    @When("User fills username as {string}")
    public void user_fills_username_as(String string) {

    }
    @When("Clicks on search button")
    public void clicks_on_search_button() {

    }
    @Then("List of accounts is displayed")
    public void list_of_accounts_is_displayed() {

    }

}
