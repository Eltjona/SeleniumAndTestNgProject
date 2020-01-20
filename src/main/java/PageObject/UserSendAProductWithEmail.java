package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UserSendAProductWithEmail {

    WebDriver driver;

    public UserSendAProductWithEmail(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[6]/div[2]/ul[1]/li[5]/a")
    WebElement bookstoToolBar;

    @FindBy(how = How.XPATH, using = "//a[@title='Show details for First Prize Pies']")
    WebElement firstPrizeElement;

    @FindBy(how = How.CLASS_NAME, using = "addthis_button_compact")
    WebElement addThisButton;
    @FindBy(how = How.XPATH, using = "//button[@aria-label='Gmail']")
    WebElement emailIcon;

    @FindBy(how = How.ID, using = "identifierId")
    WebElement email;

    @FindBy(how = How.CLASS_NAME, using = "CwaK9")
    WebElement nextButton;
    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    WebElement passwordofEmail;

    @FindBy(how = How.ID, using = ":oy")
    WebElement sendButton;
    //ag
    @FindBy(how = How.ID, using = "link_vsm")
    WebElement viewmsg;

    @FindBy(how = How.ID,using=":2m")
    WebElement reply;

    @FindBy(how = How.ID,using=":9n")
    WebElement textBox;
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBookstoToolBar() {
        return bookstoToolBar;
    }

    public void setBookstoToolBar(WebElement bookstoToolBar) {
        this.bookstoToolBar = bookstoToolBar;
    }

    public WebElement getFirstPrizeElement() {
        return firstPrizeElement;
    }

    public void setFirstPrizeElement(WebElement firstPrizeElement) {
        this.firstPrizeElement = firstPrizeElement;
    }

    public WebElement getAddThisButton() {
        return addThisButton;
    }

    public void setAddThisButton(WebElement addThisButton) {
        this.addThisButton = addThisButton;
    }

    public WebElement getEmailIcon() {
        return emailIcon;
    }

    public void setEmailIcon(WebElement emailIcon) {
        this.emailIcon = emailIcon;
    }

    public WebElement getEmail() {
        return email;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    public WebElement getNextButton() {
        return nextButton;
    }

    public void setNextButton(WebElement nextButton) {
        this.nextButton = nextButton;
    }

    public WebElement getPasswordofEmail() {
        return passwordofEmail;
    }

    public void setPasswordofEmail(WebElement passwordofEmail) {
        this.passwordofEmail = passwordofEmail;
    }

    public WebElement getSendButton() {
        return sendButton;
    }

    public void setSendButton(WebElement sendButton) {
        this.sendButton = sendButton;
    }

    public WebElement getViewmsg() {
        return viewmsg;
    }

    public void setViewmsg(WebElement viewmsg) {
        this.viewmsg = viewmsg;
    }

    public WebElement getTextBox() {
        return textBox;
    }

    public void setTextBox(WebElement textBox) {
        this.textBox = textBox;
    }

    public WebElement getReply() {
        return reply;
    }

    public void setReply(WebElement reply) {
        this.reply = reply;
    }
}
