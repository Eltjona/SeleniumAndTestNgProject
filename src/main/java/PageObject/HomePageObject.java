package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {
    WebDriver driver;


    public HomePageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//span[text()='Admin area']")
    static WebElement adminButton;


    @FindBy(how = How.XPATH, using = "//span[text()='Frontend']")
    WebElement frontendButton;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAdminButton() {
        return adminButton;
    }

    public void setAdminButton(WebElement adminButton) {
        this.adminButton = adminButton;
    }

    public WebElement getFrontendButton() {
        return frontendButton;
    }

    public void setFrontendButton(WebElement frontendButton) {
        this.frontendButton = frontendButton;
    }
}
