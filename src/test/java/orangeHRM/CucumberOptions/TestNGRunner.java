package orangeHRM.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/java/orangeHRM/Features/Test.feature"},
        glue = {"orangeHRM.Defination"},
        dryRun = false,

        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                 "rerun:target/failed_scenarios.txt"}
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
