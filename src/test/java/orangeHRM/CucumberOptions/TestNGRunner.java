package orangeHRM.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/orangeHRM/Features"},
        glue = {"orangeHRM.Defination"}
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
