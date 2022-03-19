package ProjectTests;

import Base.Hooks;
import HelpPages.ContactPage;
import HelpPages.IndexPage;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactTest extends Hooks {

    public IndexPage indexPage;
    public ContactPage contactPage;

    @Test

    public void testContact() {

        indexPage = new IndexPage(getDriver());
        contactPage = new ContactPage(getDriver());
        contactPage.registerValidProcess(inputData);

        WebDriverWait Wait = new WebDriverWait(indexPage.driver, Duration.ofSeconds(5));
        Alert alert = Wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

}


