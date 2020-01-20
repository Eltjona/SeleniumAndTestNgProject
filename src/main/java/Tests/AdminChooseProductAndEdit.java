package Tests;

import PageObject.AdminChooseFromCatalogAProduct;
import PageObject.FormOfAdminElement;
import PageObject.HomePageObject;
import Steps.AdminChooseAProduct;
import Steps.FillFormOfAdmin;
import Steps.HomePageSteps;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class AdminChooseProductAndEdit {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws IOException {
        driver=utils.Driver.open("chrome");
        driver.get("https://www.nopcommerce.com/demo");
        driver.manage().window().maximize();

    }



    @Test
    public void setBaseUrl() throws InterruptedException, IOException {


        HomePageObject homePageObject = new HomePageObject(driver);
        HomePageSteps homePageSteps = new HomePageSteps(driver);
        homePageSteps.setHomePage(homePageObject);
        homePageSteps.clickAdminButton();

        FormOfAdminElement formOfAdminElement = new FormOfAdminElement(driver);
        FillFormOfAdmin fillFormOfAdmin = new FillFormOfAdmin(driver);
        fillFormOfAdmin.setFormOfAdmin(formOfAdminElement);
        fillFormOfAdmin.openNewWindowAfterFillTheForm();
        fillFormOfAdmin.fillFormOfAdmin();

        AdminChooseFromCatalogAProduct adminChooseFromCatalogAProduct = new AdminChooseFromCatalogAProduct(driver);
        AdminChooseAProduct adminChooseAProduct = new AdminChooseAProduct(driver);
        adminChooseAProduct.setAdminChooseFromCatalogAProduct(adminChooseFromCatalogAProduct);
        adminChooseAProduct.adminChooseFromCatalogProduct();
        adminChooseAProduct.searchForProduct();
        adminChooseAProduct.uploadImage();
        adminChooseAProduct.verifyTheMessage();


    }

  //  @AfterMethod
   // public void closeWindow(){
      //  driver.quit();
   // }
}
