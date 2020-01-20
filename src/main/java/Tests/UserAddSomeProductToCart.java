package Tests;

import PageObject.AddSomeProductToCart;
import PageObject.FormOfUserElement;
import PageObject.HomePageObject;
import Steps.FillFormOfUser;
import Steps.HomePageSteps;
import Steps.UserAddSomeProduct;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserAddSomeProductToCart {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = utils.Driver.open("chrome");
        driver.get("https://www.nopcommerce.com/demo");
        driver.manage().window().maximize();
    }


    @Test
    public void setBaseUrl() throws InterruptedException, IOException {


        HomePageObject home = new HomePageObject(driver);
        HomePageSteps homeButtons = new HomePageSteps(driver);
        homeButtons.setHomePage(home);
        homeButtons.clickFrontendButton();


        FormOfUserElement userForm = new FormOfUserElement(driver);
        FillFormOfUser form = new FillFormOfUser(driver);
        form.setFormOfUSer(userForm);
        form.openNewWindowAfterFillTheForm();
        form.fillFormOfUser();

        AddSomeProductToCart addProductToCart = new AddSomeProductToCart(driver);
        UserAddSomeProduct userAddToCart = new UserAddSomeProduct(driver);
        userAddToCart.setAddProductToCart(addProductToCart);
        userAddToCart.mouseHover();
        userAddToCart.addToCart();
        userAddToCart.verifyTheMessage();
        userAddToCart.clickShoppingCart();
        userAddToCart.sumOfTheProducts();
      //  userAddToCart.verifyTheMessage();
    }
  //  @AfterMethod
   // public void closeWindow(){
        //driver.quit();
    //}
}
