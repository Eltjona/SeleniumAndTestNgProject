package Steps;

import PageObject.FormOfUserElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumElement;

public class FillFormOfUser {

    FormOfUserElement formOfUSer;
    WebDriver driver;
    SeleniumElement seleniumElement = new SeleniumElement();

    public FillFormOfUser(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        seleniumElement.setDriver(driver);
    }

    public void fillFormOfUser() throws InterruptedException {
        String email = "eltallanaj776@gmail.com";
        String password = "elta1234";

        seleniumElement.clickElement(formOfUSer.getLoginButton());

        seleniumElement.fillTheTextBox(formOfUSer.getEmailOfUSer(), email);

        seleniumElement.fillTheTextBox(formOfUSer.getPasswordOfUSer(), password);


        seleniumElement.clickElement(formOfUSer.getLoginButtonOfUSer());
    }

    public void openNewWindowAfterFillTheForm() {
        seleniumElement.openNewWindow();

    }

    public FormOfUserElement getFormOfUSer() {
        return formOfUSer;
    }

    public void setFormOfUSer(FormOfUserElement formOfUSer) {
        this.formOfUSer = formOfUSer;
    }
}
