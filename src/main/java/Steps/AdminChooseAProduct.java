package Steps;

import PageObject.AdminChooseFromCatalogAProduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.SeleniumElement;

import java.io.IOException;

public class AdminChooseAProduct {
    AdminChooseFromCatalogAProduct adminChooseFromCatalogAProduct;
    SeleniumElement seleniumElement = new SeleniumElement();
    String nameOfProduct = "Apple Iphone xs";
    WebDriver driver;

    public AdminChooseAProduct(WebDriver driver) {
        this.driver = driver;
        seleniumElement.setDriver(driver);
    }


    public void adminChooseFromCatalogProduct() throws InterruptedException {

        String shortDescriptionForProduct = "The iPhone XS and iPhone XS Max  are smartphones designed, developed and marketed by Apple Inc.";


        seleniumElement.clickElement(adminChooseFromCatalogAProduct.getCatalogButton());

        seleniumElement.clickElement(adminChooseFromCatalogAProduct.getProduct());

        seleniumElement.clickElement(adminChooseFromCatalogAProduct.getNewButton());

        seleniumElement.clickElement(adminChooseFromCatalogAProduct.getAdvanceButton());

        seleniumElement.fillTheTextBox(adminChooseFromCatalogAProduct.getNameProduuct(), nameOfProduct);

        seleniumElement.fillTheTextBox(adminChooseFromCatalogAProduct.getShortDEscription(), shortDescriptionForProduct);

        seleniumElement.clickElement(adminChooseFromCatalogAProduct.getSaveButton());


    }


    public void searchForProduct() throws InterruptedException {

        seleniumElement.fillTheTextBox(adminChooseFromCatalogAProduct.getProductName(), nameOfProduct);

        seleniumElement.clickElement(adminChooseFromCatalogAProduct.getSearchButton());

        seleniumElement.clickElement(adminChooseFromCatalogAProduct.getEditButton());
    }

    public void uploadImage() throws IOException, InterruptedException {
        //Thread.sleep(2000);
        seleniumElement.clickElement(adminChooseFromCatalogAProduct.getAddFileButton());
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\U744880\\Documents\\Uploads\\iploadImage.exe");
        seleniumElement.clickElement(adminChooseFromCatalogAProduct.getSaveButton());
    }

    public void verifyTheMessage() {
        adminChooseFromCatalogAProduct.getActualTitle();
        String expectedTitle = "The product has been updated successfully.";
        String text = adminChooseFromCatalogAProduct.getActualTitle().getText();
        int newLineIndex = text.indexOf("\n");
        String newText = text.substring(newLineIndex + 1);
        Assert.assertEquals(expectedTitle, newText);
    }


    public AdminChooseFromCatalogAProduct getAdminChooseFromCatalogAProduct() {
        return adminChooseFromCatalogAProduct;
    }

    public void setAdminChooseFromCatalogAProduct(AdminChooseFromCatalogAProduct adminChooseFromCatalogAProduct) {
        this.adminChooseFromCatalogAProduct = adminChooseFromCatalogAProduct;
    }
}
