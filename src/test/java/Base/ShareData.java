package Base;

import PropertiesUtility.PropertiesObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShareData {

    private WebDriver driver;

    public void setUp(){
        PropertiesObject driverResources = new PropertiesObject("driverResource/DriverResource");
        System.setProperty(driverResources.getValueByKey("browser"), driverResources.getValueByKey("browserPath"));
        driver = new ChromeDriver();
        driver.get(driverResources.getValueByKey("url"));
        driver.manage().window().maximize();

        // Wait implicit
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public WebDriver getDriver(){

        return driver;
    }

}


