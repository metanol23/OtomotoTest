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
    By brandSelection = By.xpath("//*[@text='Marka pojazdu']");
    By findBrandField = By.xpath("//*[@text='Szukaj Marka pojazdu']");
    By foundBrand = By.id("android:id/text1");
    By parts = By.xpath("//*[@text='Rodzaj części']");
    By rim = By.xpath("//*[@text='Felgi']");
    By results = By.xpath("//*[@text='Pokaż wyniki']");
    By AnyResultShown = By.id("pl.otomoto:id/topHeader");

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
    public HomePage swipeToBottom(){
        swipeDown(1);
        return this;
    }
    public HomePage typeBrandNameAndConfirm(String brandName){
        sendKeys(findBrandField, brandName);
        click(foundBrand);
        return this;
    }
    public HomePage selectRims(){
        click(parts);
        click(rim);
        return this;
    }
    public HomePage showResults(){
        click(results);
        return this;
    }
    public HomePage areThereAnyRims(){
        areResultsPresent(AnyResultShown);
        return this;
    }
}