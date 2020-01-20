package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminChooseFromCatalogAProduct {

    WebDriver driver;


    public AdminChooseFromCatalogAProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using="//span[text()='Catalog']")
    WebElement catalogButton;

    @FindBy(how = How.XPATH,using = "//span[text()='Products']")
    WebElement product;

    @FindBy(how = How.CLASS_NAME,using="bg-blue")
    WebElement newButton;

    @FindBy(how = How.XPATH,using="//span[@class='onoffswitch-switch']")
    WebElement advanceButton;

    @FindBy(how = How.XPATH,using= "//input[@id='Name']")
    WebElement nameProduuct;

    @FindBy(how = How.ID, using= "ShortDescription")
    WebElement shortDEscription;

    @FindBy(how = How.XPATH,using="//button[@name='save']")
    WebElement saveButton;

    @FindBy (how = How.ID,using= "SearchProductName")
    WebElement productName;

    @FindBy(how = How.ID,using= "search-products")
    WebElement searchButton;

    @FindBy(how = How.XPATH,using= "//a[text()='Edit']")
    WebElement editButton;

    @FindBy(how = How.CLASS_NAME,using ="upload-button-container")
    WebElement addFileButton;

    @FindBy(how = How.NAME,using="save")
    WebElement saveProduct;

    @FindBy(how = How.CLASS_NAME,using= "alert-success")
    WebElement actualTitle;
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCatalogButton() {
        return catalogButton;
    }

    public void setCatalogButton(WebElement catalogButton) {
        this.catalogButton = catalogButton;
    }

    public WebElement getProduct() {
        return product;
    }

    public void setProduct(WebElement product) {
        this.product = product;
    }

    public WebElement getNewButton() {
        return newButton;
    }

    public void setNewButton(WebElement newButton) {
        this.newButton = newButton;
    }

    public WebElement getAdvanceButton() {
        return advanceButton;
    }

    public void setAdvanceButton(WebElement advanceButton) {
        this.advanceButton = advanceButton;
    }

    public WebElement getNameProduuct() {
        return nameProduuct;
    }

    public void setNameProduuct(WebElement nameProduuct) {
        this.nameProduuct = nameProduuct;
    }

    public WebElement getShortDEscription() {
        return shortDEscription;
    }

    public void setShortDEscription(WebElement shortDEscription) {
        this.shortDEscription = shortDEscription;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(WebElement saveButton) {
        this.saveButton = saveButton;
    }

    public WebElement getProductName() {
        return productName;
    }

    public void setProductName(WebElement productName) {
        this.productName = productName;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(WebElement searchButton) {
        this.searchButton = searchButton;
    }

    public WebElement getEditButton() {
        return editButton;
    }

    public void setEditButton(WebElement editButton) {
        this.editButton = editButton;
    }

    public WebElement getAddFileButton() {
        return addFileButton;
    }

    public WebElement getSaveProduct() {
        return saveProduct;
    }

    public void setSaveProduct(WebElement saveProduct) {
        this.saveProduct = saveProduct;
    }

    public WebElement getActualTitle() {
        return actualTitle;
    }

    public void setActualTitle(WebElement actualTitle) {
        this.actualTitle = actualTitle;
    }

    public void setAddFileButton(WebElement addFileButton) {
        this.addFileButton = addFileButton;
    }
}
