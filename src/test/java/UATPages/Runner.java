package UATPages;

import BasePage.BasePageClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import uitlity.CommonCode;


@CucumberOptions(
        features = "C://Users//admin//IdeaProjects//Selenium4_Stream//src//test//resources//features",
        glue = "StepDefinitions",
        plugin = {"pretty","timeline:./Reports/","html:./Reports/report.html","rerun:RerunFeatures/reruns.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish = true
      //  tags = "@Mobiles"
)

public class Runner extends  AbstractTestNGCucumberTests {
    public static String browser = "";

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }








}
