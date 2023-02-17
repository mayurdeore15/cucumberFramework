package orangeHRM.Defination;

import io.cucumber.java.After;
import orangeHRM.Utilities.TestSetup;

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
}
