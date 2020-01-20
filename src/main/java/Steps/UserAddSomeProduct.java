package Steps;

import PageObject.AddSomeProductToCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.SeleniumElement;

import java.io.IOException;
import java.util.List;

public class UserAddSomeProduct {
    AddSomeProductToCart addProductToCart;
    WebDriver driver;
    SeleniumElement seleniumElement = new SeleniumElement();

    public UserAddSomeProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        seleniumElement.setDriver(driver);
    }

    public void mouseHover() throws InterruptedException {

        seleniumElement.mouseHover(addProductToCart.getMouseOverComputer(), addProductToCart.getChooseFromComputerDesktops());
    }

    public void addToCart() throws InterruptedException {

        for (WebElement pro : addProductToCart.getAddToCart()) {

            seleniumElement.clickElement(addProductToCart.getAddToCart().get(1));    //addProductToCart.getAddToCart().get(1).click();

            seleniumElement.clickElement(addProductToCart.getAddToCart().get(2));

        }


    }

    public void sumOfTheProducts() {
        double totalSum = 0;
        if (addProductToCart.getFormOfShoppingCart().isEnabled()) {


            for (WebElement rows : addProductToCart.getRowsOfTablesForProducts()) {
                String products = rows.findElement(By.xpath("td[7]/span")).getText();
                System.out.println("The current value " + products.substring(1));
                double convertedValueOfTotal = Double.parseDouble(products.substring(1).replace(",", "").trim());
                totalSum = totalSum + convertedValueOfTotal;
            }
            System.out.println("The sum to be compared => " + totalSum);
        }
        WebElement subtotal = driver.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[1]/table/tbody/tr[4]/td[2]"));
String total = String.valueOf(subtotal);
        Assert.assertEquals(total, totalSum);
    }

    public void verifyTheMessage() {
        addProductToCart.getActualTitle();

        String expectedTitle = "The product has been added to your shopping cart";

        Assert.assertEquals(expectedTitle, expectedTitle);
    }

    public void clickShoppingCart() throws InterruptedException, IOException {

        seleniumElement.clickElement(addProductToCart.getClose());

        seleniumElement.clickElement(addProductToCart.getShoppingCart());

    }


    public AddSomeProductToCart getAddProductToCart() {
        return addProductToCart;
    }

    public void setAddProductToCart(AddSomeProductToCart addProductToCart) {
        this.addProductToCart = addProductToCart;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
