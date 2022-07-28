package Actions;

import UATPages.AUTHomePage;
import org.asynchttpclient.util.Assertions;

import uitlity.CommonCode;

import java.io.IOException;

public class ActionsHomePage {



    AUTHomePage autHomePage = new AUTHomePage();



    public void verifyUserIsOnHomePage(){

      //  Assert.assertEquals(CommonCode.homePageTitle,autHomePage.verifyUserIsOnHomePage());
    }

    public void hoverOnAllCategories(){
        autHomePage.hoverOnAllCategories();
    }

    public void hoverOnElectronicsAndMobiles(){
        autHomePage.hoverOnElectronicsAndMobiles();
    }

    public void getMostPopularAndTopBrandsProducts(){
        autHomePage.getMostPopularAndTopBrandsProducts();
    }

    public void hoverOnMahali(){
        autHomePage.hoverOnMahali();
    }

    public void hoverOnSportsTab(){
        autHomePage.hoverOnSportsTab();
    }

    public void getCategoriesOfProductsAvailableInTab(){
        autHomePage.getCategoriesOfProductsAvailableInTab();
    }

    public void getAllAddsComingOnTopOfScreen() throws IOException, InterruptedException {
        autHomePage.getAllAddsComingOnTopOfScreen();
    }


}
