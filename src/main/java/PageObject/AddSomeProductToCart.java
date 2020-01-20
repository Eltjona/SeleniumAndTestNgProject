package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddSomeProductToCart {

    WebDriver driver;


    public AddSomeProductToCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//a[text()='Computers ']")
    WebElement mouseOverComputer;

    @FindBy(how = How.XPATH, using = "//a[text()='Desktops ']")
    WebElement chooseFromComputerDesktops;

    @FindBys({
            @FindBy(how = How.XPATH, using = "//input[@value='Add to cart']")
    })
    List<WebElement> addToCart;

    @FindBy(how = How.XPATH, using = "//p[@class='content']")
    WebElement actualTitle;
    @FindBy(how = How.XPATH,using= "//span[@title='Close']")
    WebElement close;
    @FindBy(how = How.CLASS_NAME,using="ico-cart")
    WebElement shoppingCart;

    //@FindBy(how = How.XPATH, using= "//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr[1]/td[4]")
    //WebElement product1;
    //@FindBy(how = How.XPATH,using= "//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr[1]/td[5]")
    //WebElement price;

    //@FindBy(how = How.ID,using="itemquantity16240")
   // WebElement qty;
    @FindBy(how= How.ID,using="shopping-cart-form")
    WebElement formOfShoppingCart;

    @FindBys(
            {
                    @FindBy(how = How.XPATH,using ="//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr")
            }
    )
   List<WebElement>  rowsOfTablesForProducts;
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMouseOverComputer() {
        return mouseOverComputer;
    }

    public void setMouseOverComputer(WebElement mouseOverComputer) {
        this.mouseOverComputer = mouseOverComputer;
    }

    public WebElement getChooseFromComputerDesktops() {
        return chooseFromComputerDesktops;
    }

    public void setChooseFromComputerDesktops(WebElement chooseFromComputerDesktops) {
        this.chooseFromComputerDesktops = chooseFromComputerDesktops;
    }

    public WebElement getActualTitle() {
        return actualTitle;
    }

    public void setActualTitle(WebElement actualTitle) {
        this.actualTitle = actualTitle;
    }

    public List<WebElement> getAddToCart() {
        return addToCart;
    }

    public void setAddToCart(List<WebElement> addToCart) {
        this.addToCart = addToCart;
    }

    public WebElement getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(WebElement shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public WebElement getClose() {
        return close;
    }

    public void setClose(WebElement close) {
        this.close = close;
    }

    public WebElement getFormOfShoppingCart() {
        return formOfShoppingCart;
    }

    public void setFormOfShoppingCart(WebElement formOfShoppingCart) {
        this.formOfShoppingCart = formOfShoppingCart;
    }

    public List<WebElement> getRowsOfTablesForProducts() {
        return rowsOfTablesForProducts;
    }

    public void setRowsOfTablesForProducts(List<WebElement> rowsOfTablesForProducts) {
        this.rowsOfTablesForProducts = rowsOfTablesForProducts;
    }
}
