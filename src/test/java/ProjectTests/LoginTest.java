package ProjectTests;

import Base.Hooks;
import HelpPages.IndexPage;
import HelpPages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginTest extends Hooks {

    public IndexPage indexPage;
    public LoginPage loginPage;

    @Test

    public void testLogin() {

        indexPage = new IndexPage(getDriver());
        loginPage = new LoginPage(getDriver());

        WebDriverWait Wait = new WebDriverWait(indexPage.driver, Duration.ofSeconds(5));
        Wait.until(ExpectedConditions.visibilityOf(indexPage.logInBtn));

        indexPage.clickLogInBtn();
        loginPage.loginValidProcess(inputData);
        loginPage.loginTestValidation();

    }

}


