package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;

public class HomePage extends pages.BasePage {

    //*********Constructor*********
    public HomePage (AndroidDriver driver) {
        super(driver);
    }


    //*********App Elements*********
    By device = By.xpath("//*[@text='Części']");
    By showMoreParameters = By.xpath("//*[@text='Więcej parametrów']");
    By brandSelection = By.xpath("//*[@text='Marka Pojazdu']");


    //Go to PartsPage
    public HomePage GoToParts(){
        click(device);
        return this;
    }
    public HomePage showMoreParameters(){
        click(showMoreParameters);
        return this;
    }
    public HomePage selectBrand(){
        click(brandSelection);
        return this;
    }
}