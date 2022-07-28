package BasePage;

import StepDefinitions.HomePage;
import UATPages.Runner;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import uitlity.CommonCode;

import java.time.Duration;

public class BasePageClass {



   public  WebDriver driver  ;

    public  void   initialize(){

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriverManager.chromedriver().driverVersion("").setup();

            driver =  new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.noon.com/uae-en/sports-outdoors/");
            //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
            CommonCode.driver = driver;


    }









}
