package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FormOfUserElement {

    WebDriver driver;


    public FormOfUserElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.CLASS_NAME, using = "ico-login")
    WebElement loginButton;

    @FindBy(how = How.ID, using = "Email")
    WebElement emailOfUSer;
    @FindBy(how = How.ID, using = "Password")
    WebElement passwordOfUSer;
    @FindBy(how = How.CLASS_NAME, using = "login-button")
    WebElement loginButtonOfUSer;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(WebElement loginButton) {
        this.loginButton = loginButton;
    }

    public WebElement getEmailOfUSer() {
        return emailOfUSer;
    }

    public void setEmailOfUSer(WebElement emailOfUSer) {
        this.emailOfUSer = emailOfUSer;
    }

    public WebElement getPasswordOfUSer() {
        return passwordOfUSer;
    }

    public void setPasswordOfUSer(WebElement passwordOfUSer) {
        this.passwordOfUSer = passwordOfUSer;
    }

    public WebElement getLoginButtonOfUSer() {
        return loginButtonOfUSer;
    }

    public void setLoginButtonOfUSer(WebElement loginButtonOfUSer) {
        this.loginButtonOfUSer = loginButtonOfUSer;
    }
}
