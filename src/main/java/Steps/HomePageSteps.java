package Steps;

import PageObject.HomePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SeleniumElement;

public class HomePageSteps {
    HomePageObject homePage;
    WebDriver driver;
    SeleniumElement seleniumElement = new SeleniumElement();

    public HomePageSteps(WebDriver driver) {
        // this.driver = driver;
        //PageFactory.initElements(driver, this);
        seleniumElement.setDriver(driver);
    }

    public void clickAdminButton() {

        seleniumElement.clickElement(homePage.getAdminButton());

    }

    public void clickFrontendButton() {

        seleniumElement.clickElement(homePage.getFrontendButton());

    }

    public HomePageObject getHomePage() {
        return homePage;
    }

    public void setHomePage(HomePageObject homePage) {
        this.homePage = homePage;
    }
}
