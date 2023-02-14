package orangeHRM.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/orangeHRM/Features"},
        glue = {"orangeHRM.Defination"},
        stepNotifications = true
)
public class JunitRunner {

}
