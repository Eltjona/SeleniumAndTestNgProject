package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FormOfAdminElement {
    WebDriver driver;


    public FormOfAdminElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.ID, using = "Email")
    WebElement emailOfAdmin;

    @FindBy(how = How.ID, using = "Password")
    WebElement passwordOFAdmin;

    @FindBy(how = How.CLASS_NAME, using = "login-button")
    WebElement buttonOfAdmin;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmailOfAdmin() {
        return emailOfAdmin;
    }

    public void setEmailOfAdmin(WebElement emailOfAdmin) {
        this.emailOfAdmin = emailOfAdmin;
    }

    public WebElement getPasswordOFAdmin() {
        return passwordOFAdmin;
    }

    public void setPasswordOFAdmin(WebElement passwordOFAdmin) {
        this.passwordOFAdmin = passwordOFAdmin;
    }

    public WebElement getButtonOfAdmin() {
        return buttonOfAdmin;
    }

    public void setButtonOfAdmin(WebElement buttonOfAdmin) {
        this.buttonOfAdmin = buttonOfAdmin;
    }
}
