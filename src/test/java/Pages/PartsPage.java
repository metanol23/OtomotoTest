package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class PartsPage extends Pages.BasePage {

    //*********Constructor*********
    public PartsPage (AndroidDriver driver) {
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

    //Handling - PartsPage
    public PartsPage GoToParts(){
        click(device);
        return this;
    }
    public PartsPage showMoreParameters(){
        click(showMoreParameters);
        return this;
    }
    public PartsPage selectBrand(){
        click(brandSelection);
        return this;
    }
    public PartsPage swipeToBottom(){
        swipeDown(1);
        return this;
    }
    public PartsPage typeBrandNameAndConfirm(String brandName){
        sendKeys(findBrandField, brandName);
        click(foundBrand);
        return this;
    }
    public PartsPage selectRims(){
        click(parts);
        click(rim);
        return this;
    }
    public PartsPage showResults(){
        click(results);
        return this;
    }
    public PartsPage areThereAnyRims(){
        areResultsPresent(AnyResultShown);
        return this;
    }
}