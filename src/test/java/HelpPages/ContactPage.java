package HelpPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class ContactPage extends BasePage {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[data-target='#exampleModal']")
    public WebElement contactBtn;
    @FindBy(id = "recipient-email")
    public WebElement emailElement;
    @FindBy(id = "recipient-name")
    public WebElement nameElement;
    @FindBy(id = "message-text")
    public WebElement messageElement;
    @FindBy(xpath = "//*[text()='Send message']")
    public WebElement sendMessageBtn;

    public void findContactBtn(){

        elementMethods.clickElement(contactBtn);
    }

    public void fillEmailElement(String value){

        elementMethods.fillElement(emailElement, value);
    }

    public void fillNameElement(String value){

        elementMethods.fillElement(nameElement, value);
    }

    public void fillMessageElement(String value){

        elementMethods.fillElement(messageElement, value);
    }
    public void clickSendMessage(){
        elementMethods.clickElement(sendMessageBtn);

    }

    public void registerValidProcess(HashMap<String, String> inputData) {
        findContactBtn();
        fillEmailElement(inputData.get("email"));
        fillNameElement(inputData.get("name"));
        fillMessageElement(inputData.get("message"));
        clickSendMessage();


    }

}
