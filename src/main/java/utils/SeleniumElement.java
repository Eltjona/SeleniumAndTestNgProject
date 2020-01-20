package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class SeleniumElement {

    WebDriver driver;
    WebDriverWait waitDriver;


    public SeleniumElement() {
        //this.driver = driver;
        // PageFactory.initElements(driver, this);
    }


    public void clickElement(WebElement element) {

        waitForElementToBeClickable(element);
        element.click();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementToBeClickable(WebElement element) {
        WebDriverWait waitDriver = new WebDriverWait(driver, 7);
        waitDriver.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeVisibil(WebElement element) {
        WebDriverWait waitDriver = new WebDriverWait(driver, 7);
        waitDriver.until(ExpectedConditions.visibilityOf(element));
    }

    public void fillTheTextBox(WebElement element, String words) {
        waitForElementToBeVisibil(element);
        element.sendKeys(words);
    }

    public void openNewWindow() {
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }

    }

    public void mouseHover(WebElement hoverElement, WebElement clickElement){
        Actions actions = new Actions(driver);


         actions.moveToElement(hoverElement);

         actions.moveToElement(clickElement).click();
        // Thread.sleep(1000);
         actions.click().build().perform();
    }
    public void takeScreenShot() throws IOException {

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C://scrrenshot.png"));
    }


}

