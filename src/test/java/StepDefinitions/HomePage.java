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
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import uitlity.CommonCode;

import java.io.File;
import java.io.IOException;

public class HomePage  {


ActionsHomePage actionsHomePage = new ActionsHomePage();





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
