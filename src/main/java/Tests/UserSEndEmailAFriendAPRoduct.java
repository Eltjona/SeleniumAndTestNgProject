package Tests;

import PageObject.FormOfUserElement;
import PageObject.HomePageObject;
import PageObject.UserSendAProductWithEmail;
import Steps.FillFormOfAdmin;
import Steps.FillFormOfUser;
import Steps.HomePageSteps;
import Steps.UserSendwithEmailAProduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserSEndEmailAFriendAPRoduct {


    WebDriver driver;

@BeforeMethod
public void setUp(){
    driver=utils.Driver.open("chrome");
    driver.get("https://www.nopcommerce.com/demo");
    driver.manage().window().maximize();
}

    @Test
    public void setBaseUrl() throws InterruptedException {


        //driver.get(baseUrl);
        HomePageObject homePageObject = new HomePageObject(driver);
        HomePageSteps homePageSteps = new HomePageSteps(driver);
        homePageSteps.setHomePage(homePageObject);
        homePageSteps.clickFrontendButton();

        FormOfUserElement formOfUserElement = new FormOfUserElement(driver);
        FillFormOfUser fillFormOfUser = new FillFormOfUser(driver);
        fillFormOfUser.setFormOfUSer(formOfUserElement);
        fillFormOfUser.openNewWindowAfterFillTheForm();
        fillFormOfUser.fillFormOfUser();

        UserSendAProductWithEmail userSendAProductWithEmail = new UserSendAProductWithEmail(driver);
        UserSendwithEmailAProduct userSendwithEmailAProduct = new UserSendwithEmailAProduct(driver);
        userSendwithEmailAProduct.setuSerSendAProductWithEmail(userSendAProductWithEmail);
        userSendwithEmailAProduct.sendPRoductWithEmail();
        userSendwithEmailAProduct.openNewWindowAfterFillTheForm();
        userSendwithEmailAProduct.fillFormOFEmail();
       // userSendwithEmailAProduct.openNewWindowAfterFillTheForm();
       // userSendwithEmailAProduct.showMessage();


    }
@AfterMethod
    public void closeWindow(){
    driver.quit();
}

    }
