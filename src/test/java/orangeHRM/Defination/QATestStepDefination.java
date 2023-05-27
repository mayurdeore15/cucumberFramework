package orangeHRM.Defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangeHRM.PageObjects.LoginPage;
import orangeHRM.PageObjects.QATestPage;
import orangeHRM.Utilities.TestSetup;
import org.openqa.selenium.WebElement;

import java.util.List;

public class QATestStepDefination {
    TestSetup testSetup;
    QATestPage qATestPage;
    public QATestStepDefination(TestSetup testSetup){
        this.testSetup = testSetup;
        qATestPage = testSetup.pageObjectManager.getQATestPage();
    }


    @Given("user is on website")
    public void user_is_on_website() throws InterruptedException {
        Thread.sleep(3000);
        testSetup.genericUtils.ClickElement(qATestPage.DropDown);
    }
    @When("user select {string} drop down value as {string}")
    public void user_select_drop_down_value_as(String dropdownName,String Value) throws InterruptedException {
        List<WebElement> allOptions = qATestPage.getSelects(dropdownName);
        // Iterate the list using for loop
        for(WebElement ele:allOptions){
            if(ele.getText().contains(Value)){
                ele.click();
            }
        }
//        for (int i = 0; i < allOptions.size(); i++) {
//            if (allOptions.get(i).getText().contains(Value)) {
//                allOptions.get(i).click();
//                System.out.println("clicked");
//                Thread.sleep(3000);
//                break;
//            }
//            System.out.println("no such element");
//        } Thread.sleep(3000);

    }
    @Then("value should be selected")
    public void value_should_be_selected() {

    }

}
