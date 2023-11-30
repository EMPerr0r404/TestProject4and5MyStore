package MyStoreWeb;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/StoreCucu.feature", plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"
        , "junit:target/cucumber-reports/Cucumber.xml"
        , "html:target//cucumber-reports/cucumber-report.html"
})
public class StoreTask1Test {
}
