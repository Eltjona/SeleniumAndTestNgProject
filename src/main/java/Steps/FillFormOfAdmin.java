package Steps;

import PageObject.FormOfAdminElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SeleniumElement;

public class FillFormOfAdmin {
    FormOfAdminElement formOfAdmin;
    WebDriver driver;

    SeleniumElement seleniumElement = new SeleniumElement();

    public FillFormOfAdmin(WebDriver driver) {
        this.driver = driver;
        seleniumElement.setDriver(driver);
        //PageFactory.initElements(driver, this);
    }

    public void fillFormOfAdmin() {

        String adminEmail = "admin@yourstore.com";
        String adminPassword = "admin";

        seleniumElement.fillTheTextBox(formOfAdmin.getEmailOfAdmin(), adminEmail);

        seleniumElement.fillTheTextBox(formOfAdmin.getPasswordOFAdmin(), adminPassword);

        seleniumElement.clickElement(formOfAdmin.getButtonOfAdmin());
    }

    public void openNewWindowAfterFillTheForm() {
        seleniumElement.openNewWindow();

    }

    public FormOfAdminElement getFormOfAdmin() {
        return formOfAdmin;
    }

    public void setFormOfAdmin(FormOfAdminElement formOfAdmin) {
        this.formOfAdmin = formOfAdmin;
    }
}
