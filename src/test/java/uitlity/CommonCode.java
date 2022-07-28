package uitlity;

import UATPages.Runner;
import io.cucumber.java.bs.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonCode {



    public static WebDriver driver = null;

    public static String homePageTitle = "Online Shopping UAE | Fashion, Electronics, Beauty, Baby, Groceries";

    public static String current_Scenario = "";

    public static String browser = "";

    public static void hoverOnElement(WebElement ele){

        Actions actions = new Actions(driver);
        waitTillElementIsClickable(5,ele);
        actions.moveToElement(ele).build().perform();

    }

    public static void waitTillElementIsClickable(int time , WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
    }

}
