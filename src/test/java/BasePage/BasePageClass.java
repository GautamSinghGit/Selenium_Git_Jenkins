
package BasePage;

import StepDefinitions.HomePage;
import UATPages.Runner;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
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

import static UATPages.Runner.browser;

public class BasePageClass {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return driver.get();
    }

    @Before
    public  static void  initialize() {
        System.out.println("Browser in initialization  ===== +" );
        if (browser.equalsIgnoreCase("chrome")) {
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
        else if(browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver.set(new EdgeDriver());

            getDriver().manage().window().maximize();
            getDriver().get("https://www.noon.com/uae-en/sports-outdoors/");
            //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
            CommonCode.driver = getDriver();


        }
    }


/*

   public  static WebDriver driver  ;
    public static ThreadLocal<WebDriver> ndriver = new ThreadLocal<>();


    public WebDriver getDriver(){

        return ndriver.get();
    }


    public  static WebDriver  initialize(){
        System.out.println("========================  "+Runner.BROWSER.get()+"  ======================");
     //   System.out.println("nBrowser with .getMethod()============================================   "+nBrowser.get());
       //String  browser = nBrowser.get();
       // System.out.println("nBrowser with browser============================================   "+browser);
     //   Runner.BROWSER.set("home");
        String browser = Runner.browser;
       // String browser = Runner.BROWSER.get();
        System.out.println("Browser with RUnner.browser============================================   "+browser);
        if(browser.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriverManager.chromedriver().driverVersion("").setup();

            driver =  new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.noon.com/uae-en/sports-outdoors/");
          //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
            CommonCode.driver = driver;
            return driver;
        }
        else if(browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().driverVersion("").setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.noon.com/uae-en/sports-outdoors/");
          //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
            CommonCode.driver = driver;
            return driver;
        }

        else {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriverManager.chromedriver().driverVersion("").setup();

            driver =  new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.noon.com/uae-en/sports-outdoors/");
            //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
            CommonCode.driver = driver;
            return driver;
        }


    }





*/



}

