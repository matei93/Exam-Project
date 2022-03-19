package HelpPages;

import Base.ShareData;
import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends ShareData {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public IndexPage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver,this);
    }

    //Elemente

    @FindBy(id = "login2")
    public WebElement logInBtn;

    //Metode
    public void clickLogInBtn(){

        elementMethods.clickElement(logInBtn);
    }

}





