import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags="@emrecandan",
        plugin = { "pretty", "json:target/cucumber-reports.json" }
)

public class RunCuke {
}
