package HelpPages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class LoginPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    //Elemente

    @FindBy(id = "loginusername")
    public WebElement userName;
    @FindBy(id = "loginpassword")
    public WebElement passwordElement;
    @FindBy(css = "button[onclick='logIn()']")
    public WebElement logIN;


    //Metode

    public void fillUserName(String value){

        elementMethods.fillElement(userName, value);
    }

    public void fillPassword(String value) {

        elementMethods.fillElement(passwordElement, value);
    }

    public void clickLogIn(){

        elementMethods.clickElement(logIN);
    }



    public void loginTestValidation() {
        try {
            driver.findElement(By.id("nameofuser"));
            System.out.println("The test passed");

        }
        catch (Exception e) {
            assertTrue("The test not passed", false);
        }
    }

    public void loginValidProcess(HashMap<String, String> inputData){
        fillUserName(inputData.get("username"));
        fillPassword(inputData.get("password"));
        clickLogIn();
    }
}
