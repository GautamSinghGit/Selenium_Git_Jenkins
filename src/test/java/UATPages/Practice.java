package UATPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Practice {


   @BeforeTest
    public void beforetest(){

       System.out.println("before Test");
   }
    @BeforeTest
    public void beforetestq(){

        System.out.println("before Testq");
    }

    //added a coment

    @Parameters({"browser"})
    @BeforeSuite
    public void beforetests(String browser){

        System.out.println("before Tests  "+browser);
    }



}
