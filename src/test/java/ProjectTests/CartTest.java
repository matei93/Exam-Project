package ProjectTests;

import Base.Hooks;
import HelpPages.CartPage;
import HelpPages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartTest extends Hooks {

    public CartPage cartPage;
    public LoginPage loginPage;

    @Test

    public void testCart(){

        cartPage = new CartPage(getDriver());
        loginPage = new LoginPage(getDriver());
        cartPage.clickMonitorsBtn();
        cartPage.clickAppleMonitorsBtn();
        cartPage.clickAddToCart();
        WebDriverWait Wait = new WebDriverWait(cartPage.driver, Duration.ofSeconds(5));
        Alert alert = Wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        cartPage.clickCart();
        cartPage.priceValidation();


    }

}
