package Base;

import PropertiesUtility.PropertiesObject;
import org.junit.After;
import org.junit.Before;

import java.util.HashMap;

public class Hooks extends ShareData{

    //aici vom adauga logica de Before si After
    //aici vom adauga logica care incarca automat un fisier de resurse pentru fiecare test
    public HashMap<String, String> inputData;

    @Before
    public void prepareEnvironment(){
        //initializez driverul
        setUp();
        //incarc pentru fiecare test fisierul de resource corespunzator
        String className = this.getClass().getSimpleName();
        //Legatura intre resource si clasa testului
        PropertiesObject testData = new PropertiesObject("testsResources/"+className+"Resource");
        inputData = testData.getAllKeyValues();
    }

    @After
    public void clearEnvironment(){
        //tearDown();
    }
}
