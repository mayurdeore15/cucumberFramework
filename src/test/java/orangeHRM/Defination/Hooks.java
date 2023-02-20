package orangeHRM.Defination;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import orangeHRM.Utilities.TestSetup;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Hooks {
    TestSetup testSetup;
    public Hooks(TestSetup testSetup){

         this.testSetup = testSetup;
    }

    @After
    public void AfterScenario() throws IOException {
        testSetup.testBase.WebDriverManager().quit();
    }

    @AfterStep
    public void AddScreenshot(Scenario scenario) throws IOException {
        WebDriver driver = testSetup.testBase.WebDriverManager();
        if(scenario.isFailed()){
            File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(sourcepath);
            scenario.attach(fileContent,"image/png","error");
        }
    }
}
