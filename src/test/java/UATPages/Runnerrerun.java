
package UATPages;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "C://Users//admin//IdeaProjects//Selenium4_Stream//src//test//resources//features",
        glue = "StepDefinitions",
        plugin = {"pretty","timeline:./Reports/","html:./Reports/report.html","rerun:RerunFeatures/reruns.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish = true

)

public class Runnerrerun {
}

