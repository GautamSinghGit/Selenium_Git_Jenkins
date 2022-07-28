package StepDefinitions;

import Actions.ActionsHomePage;

import UATPages.Runner;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import uitlity.CommonCode;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static UATPages.Runner.browser;

public class HomePage  {


ActionsHomePage actionsHomePage = new ActionsHomePage();

   /*public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return driver.get();
    }

    @Before
    public  static void  initialize() {
        System.out.println(" Inside Before ===================================================  ");
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

            WebDriverManager.chromedriver().setup();

            driver.set(new ChromeDriver());

         //   WebDriverManager.chromedriver().driverVersion("").setup();

            //  driver =  new ChromeDriver();
            getDriver().manage().window().maximize();
            getDriver().get("https://www.noon.com/uae-en/sports-outdoors/");
            //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
            CommonCode.driver = getDriver();

        }


    }
*/



    public byte[] takeScreenShot() throws IOException {

        File f = ((TakesScreenshot)CommonCode.driver).getScreenshotAs(OutputType.FILE);

        byte[] b = FileUtils.readFileToByteArray(f);
        return  b;
    }




    @BeforeStep()
    public void before_step(Scenario s) throws IOException {
        s.attach(takeScreenShot(),"image/png","beforeStepSS");
    }


    @AfterStep()
    public void after_step(Scenario s) throws IOException {
        s.attach(takeScreenShot(),"image/png","afterStepSS");
    }


    @Given("User is on homepage to validate {string}")
    public void userIsOnHomepageToValidate(String scenario) {

        CommonCode.current_Scenario = scenario;
        actionsHomePage.verifyUserIsOnHomePage();
    }


    @Then("Hover on Electronics and Mobiles")
    public void hoverOnElectronicsAndMobiles() {
        actionsHomePage.hoverOnElectronicsAndMobiles();
    }


    @Then("Hover on All Categories section")
    public void hoverOnAllCategoriesSection() {
        actionsHomePage.hoverOnAllCategories();
    }


    @And("Get Most popular and top brands products name")
    public void getMostPopularAndTopBrandsProductsName() {
        actionsHomePage.getMostPopularAndTopBrandsProducts();
    }


    @Then("Hover on Mahali")
    public void hoverOnMahali() {
        actionsHomePage.hoverOnMahali();
    }


    @Then("Hover on Sports tab")
    public void hoverOnSportsTab() {
        actionsHomePage.hoverOnSportsTab();
    }


    @Then("Get different categories available")
    public void getDifferentCategoriesAvailable() {
        actionsHomePage.getCategoriesOfProductsAvailableInTab();
    }


    @Then("User get all the adds coming on top of screen")
    public void userGetAllTheAddsComingOnTopOfScreen() throws IOException, InterruptedException {
        actionsHomePage.getAllAddsComingOnTopOfScreen();
    }


}
