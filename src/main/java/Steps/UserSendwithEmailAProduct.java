package Steps;

import PageObject.UserSendAProductWithEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumElement;

public class UserSendwithEmailAProduct {

    UserSendAProductWithEmail uSerSendAProductWithEmail;
    WebDriver driver;
    SeleniumElement seleniumElement = new SeleniumElement();

    public UserSendwithEmailAProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        seleniumElement.setDriver(driver);
    }

    public void sendPRoductWithEmail() throws InterruptedException {

        seleniumElement.clickElement(uSerSendAProductWithEmail.getBookstoToolBar());

        seleniumElement.clickElement(uSerSendAProductWithEmail.getFirstPrizeElement());

        seleniumElement.clickElement(uSerSendAProductWithEmail.getAddThisButton());

        seleniumElement.clickElement(uSerSendAProductWithEmail.getEmailIcon());


    }

    public void openNewWindowAfterFillTheForm() {
        seleniumElement.openNewWindow();
    }


    public void fillFormOFEmail() throws InterruptedException {
        String email = "eltallanaj776@gmail.com";
        String userPassword = "elta1234";
        seleniumElement.fillTheTextBox(uSerSendAProductWithEmail.getEmail(), email);

        seleniumElement.clickElement(uSerSendAProductWithEmail.getNextButton());

        seleniumElement.fillTheTextBox(uSerSendAProductWithEmail.getPasswordofEmail(), userPassword);

        seleniumElement.clickElement(uSerSendAProductWithEmail.getNextButton());
        Thread.sleep(8000);
        WebElement formOFEmail = driver.findElement(By.id(":o9"));
        formOFEmail.findElement(By.id(":o6")).sendKeys(email);
        seleniumElement.clickElement(uSerSendAProductWithEmail.getSendButton());

        seleniumElement.clickElement(uSerSendAProductWithEmail.getViewmsg());


    }


    public UserSendAProductWithEmail getuSerSendAProductWithEmail() {
        return uSerSendAProductWithEmail;
    }

    public void setuSerSendAProductWithEmail(UserSendAProductWithEmail uSerSendAProductWithEmail) {
        this.uSerSendAProductWithEmail = uSerSendAProductWithEmail;
    }
}
