package HelpPages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class CartPage {

    public WebDriver driver;
    public ElementMethods elementMethods;


    public CartPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.='Phones']")
    public WebElement phoneBtn;
    @FindBy(xpath = "//a[text()='Monitors']")
    public WebElement monitorsBtn;
    @FindBy(xpath = "//a[text()='Apple monitor 24']")
    public WebElement appleMonitorBtn;
    @FindBy(xpath = "//a[text()='Add to cart']")
    public WebElement addToCartBtn;
    @FindBy(xpath = "//a[text()='Cart']")
    public WebElement cartBtn;


    public void clickMonitorsBtn() {
        elementMethods.clickElement(monitorsBtn);
    }

    public void clickAppleMonitorsBtn() {
        elementMethods.clickElement(appleMonitorBtn);
    }

    public void clickAddToCart() {
        elementMethods.clickElement(addToCartBtn);
    }

    public void clickCart() {
        elementMethods.clickElement(cartBtn);

    }

    public void priceValidation() {
        try {
            driver.findElement(By.id("totalp"));
            System.out.println("The price is correct");

        } catch (Exception e) {
            assertTrue("The price is not correct", false);
        }

    }
}
