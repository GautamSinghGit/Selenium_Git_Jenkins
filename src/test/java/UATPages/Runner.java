package UATPages;


import BasePage.BasePageClass;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import uitlity.CommonCode;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.time.Duration;


@CucumberOptions(
        features = "C://Users//admin//IdeaProjects//Selenium4_Stream//src//test//resources//features//get_adds_coming_on_top.feature",
        glue = {"StepDefinitions","BasePage"},
        plugin = {"pretty","timeline:./Reports/","html:./Reports/cucureport.html","rerun:RerunFeatures/reruns.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish = true
      //  tags = "@Mobiles"
)

public class Runner extends AbstractTestNGCucumberTests {
    public static String browser = "";

   /* @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        //System.out.println("Browser in Scenaruos class agai====================  "+ browser);
        return super.scenarios();
    }*/

    public static  ThreadLocal<String> BROWSER = new ThreadLocal<>();




    @Parameters({"browser"})
    @BeforeTest(alwaysRun = true)
    public void defineBrowser(@Optional("") String browser) throws NoSuchFieldException {
        Runner.BROWSER.set(browser);
        Runner.browser = Runner.BROWSER.get();
     //   BasePageClass.nBrowser.set(Runner.BROWSER.get());
        System.out.println("Browser in runner class ====================  "+ browser);
        CommonCode.browser = Runner.BROWSER.get();

       // System.out.println("Browser in runner class again ====================  "+ browser);
    }
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return driver.get();
    }

    /*@Before
    public void setup(){
        System.out.println("Browser in Before Method ====================  "+Runner.BROWSER.get());
            if (Runner.BROWSER.get().equalsIgnoreCase("chrome")) {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());

                getDriver().manage().window().maximize();
                getDriver().get("https://www.noon.com/uae-en/sports-outdoors/");
                //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
                CommonCode.driver = getDriver();

            }
            else if(Runner.BROWSER.get().equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                driver.set(new EdgeDriver());

                getDriver().manage().window().maximize();
                getDriver().get("https://www.noon.com/uae-en/sports-outdoors/");
                //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
                CommonCode.driver = getDriver();



        }
    }*/










}
