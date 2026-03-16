import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.example.Hook", "com.example.stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true,
        stepNotifications = true,
        tags = "@OpenWebsite"
)

public class cucumberRunner {

}
