package MyStoreWeb;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Store2Cucu.feature", plugin = {"pretty", "json:target/cucumber-reports/Cucumber2.json"
        , "junit:target/cucumber-reports/Cucumber2.xml"
        , "html:target/cucumber2-report.html"
})
public class StoreTask2Test {
}
