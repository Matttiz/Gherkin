package hellocucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/hellocucumber/" // Pełna ścieżka do features
        , plugin = {"pretty"}
        , glue = "stepdefinitions" // nazwa pakietu do step definitions
//        , tags = "@Day,@Examples,@Friday,@Sunday,@Today"
        ,tags = "@Day and not @Sunday"

)
public class RunCucumberTest {

}

