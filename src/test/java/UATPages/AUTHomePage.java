package UATPages;

import BasePage.BasePageClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import uitlity.CommonCode;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class AUTHomePage  {

    private WebDriver driver;

    @FindBy(xpath = "//*[text()='All Categories']")
    private WebElement allCategories;

    @FindBy(xpath = "//*[text()='Electronics & Mobiles']")
    private WebElement electronicsAndMobiles;

    @FindBy(xpath = "//*[text()='Most Popular' or text() = 'Top Brands']/following-sibling::div/a")
    private List<WebElement> mostPopularAndTopBrandsProductsList;

    @FindBy(xpath = "//*[text()='Mahali']")
    private WebElement Mahali;

    @FindBy(xpath = "//*[@class='sc-afnQL ioAMTg']//a")
    private WebElement imagesOnTop;



    public AUTHomePage( ){
      //  super.initialize();
        this.driver = CommonCode.driver;
        PageFactory.initElements(CommonCode.driver,this);
    }

    public String verifyUserIsOnHomePage(){
            return driver.getTitle();
    }

    public void hoverOnAllCategories(){
        CommonCode.hoverOnElement(allCategories);
    }

    public void hoverOnElectronicsAndMobiles(){
        CommonCode.hoverOnElement(electronicsAndMobiles);
    }


    public void getMostPopularAndTopBrandsProducts(){
        List<String> mostPopularAndTopBrandsProducts = mostPopularAndTopBrandsProductsList.stream().map(WebElement::getText).toList();
        System.out.println("Most pop and Brand Name = "+ mostPopularAndTopBrandsProducts);
        mostPopularAndTopBrandsProducts.forEach(System.out::println);

    }

    public void hoverOnMahali(){
        CommonCode.hoverOnElement(Mahali);
    }

    public void hoverOnSportsTab(){
      WebElement sports =  driver.findElement(RelativeLocator.with(By.xpath("//*[text()='Sports']")).toRightOf(By.xpath("//*[text()='Baby & Toys']")));
        CommonCode.hoverOnElement(sports);
    }


    public void getCategoriesOfProductsAvailableInTab(){
        List<WebElement> sportsCategoriesList = driver.findElements(RelativeLocator.with(By.tagName("li")).below(By.xpath("//*[text()='Categories']")).toLeftOf(By.xpath("//*[text()='Top Brands' and @class='heading']")));

        sportsCategoriesList.stream().map(WebElement::getText).forEach(System.out::println);

    }

    public void getAllAddsComingOnTopOfScreen() throws IOException, InterruptedException {



        String xpaths[] = { "//*[@alt='/sports-and-outdoors/sports-nutrition-sports?sort[by]=popularity&sort[dir]=desc']","//*[@alt='/sports-and-outdoors/exercise-and-fitness/yoga-16328?sort[by]=popularity&sort[dir]=desc']","//*[@alt='/sports-and-outdoors/exercise-and-fitness/strength-training-equipment?sort[by]=popularity&sort[dir]=desc']","//*[@alt='/sports-and-outdoors/boating-and-water-sports?sort[by]=popularity&sort[dir]=desc']"};
        AtomicInteger a1 = new AtomicInteger();
        driver.findElement(By.cssSelector("div.swiper-button-circle-right ")).click();

        for (String s:xpaths){

            Thread.sleep(2000);
            driver.findElement(By.cssSelector("div.swiper-button-circle-right ")).click();
            File f =  driver.findElement(By.xpath(s)).getScreenshotAs(OutputType.FILE);
            Thread.sleep(3000);
         //   File f = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
          //  a = FileUtils.readFileToByteArray(f);

            FileUtils.copyFile(f,new File("D://AewImages//images"+a1.getAndIncrement()+".jpg"));


        }


//        driver.findElements(By.xpath("//*[@class='sc-afnQL ioAMTg']//a//img ")).
//                stream().
//                map(e->e.getAttribute("alt")).forEach(System.out::println);



    /*    try {
            AtomicInteger i = new AtomicInteger();
            driver.findElements(By.xpath("//*[@class='sc-afnQL ioAMTg']//a//img ")).
                    stream().
                    map(e ->
                            e.getScreenshotAs(OutputType.FILE)).
                    forEach(e -> {
                        try {
                            i.getAndIncrement();
                            FileUtils.copyFile(e, new File("D://APhoto//images" + i + ".jpg"));
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    });
        }
        catch (Exception se){
            AtomicInteger i = new AtomicInteger();
            driver.findElements(By.xpath("//*[@class='sc-afnQL ioAMTg']//a//img ")).
                    stream().
                    map(e -> {
                        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
                     WebElement ee =   w.until(ExpectedConditions.elementToBeClickable(e));
                      return  ee.getScreenshotAs(OutputType.FILE);
                    }).
                    forEach(e -> {
                        try {
                            i.getAndIncrement();
                            FileUtils.copyFile(e, new File("D://APhoto1//images" + i + ".png"));
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    });
        }*/



   /* f.forEach(e -> {
        try {
            i.getAndIncrement();
            FileUtils.copyFile(e, new File("D://APhoto//images" + i + ".png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    });*/



      //  System.out.println("size is = "+l.size());
      //  l.forEach(System.out::println);
       // Actions a = new Actions(driver);
     //  driver.findElements(By.xpath("//*[@class='sc-afnQL ioAMTg']//a//img ")).stream().filter(WebElement::isDisplayed).forEach(a::contextClick);

    //    WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

     //  WebElement e = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='/sports-and-outdoors/exercise-and-fitness/yoga-16328?sort[by]=popularity&sort[dir]=desc']")));
    //    boolean t = driver.findElement(By.xpath("//*[@alt='/sports-and-outdoors/exercise-and-fitness/yoga-16328?sort[by]=popularity&sort[dir]=desc']")).isDisplayed();
        //System.out.println(e.isDisplayed());
      ///  System.out.println(t);





    }



}
