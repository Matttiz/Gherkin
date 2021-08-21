package hellocucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/hellocucumber/" // Pełna ścieżka
        ,plugin = {"pretty"}
        ,glue = "stepdefinitions" // nazwa pakietu
)
public class RunCucumberTest {

}
