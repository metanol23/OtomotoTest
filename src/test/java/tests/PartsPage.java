package tests;
//package io.testproject.appium.pom.tests.pages;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;


public class PartsPage {
    private AndroidDriver<AndroidElement> driver;
    public PartsPage() {
    }

    public PartsPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[@text='Części']")
    private AndroidElement devices;



    public void checkIfDeviceIsVisible() {

        //wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@text='Części']"))));
        if (driver.findElement(By.xpath("//*[@text='Części']")).isDisplayed()) {
            System.out.println("Test completed successfully");
        }
    }
    // wait.until(ExpectedConditions.visibilityOfElementLocated((devices)));
    //if (driver.findElement(By.xpath("//*[@text='Części']")).isDisplayed()) {
    // System.out.println("Test completed successfully");


    public void goToPartsPage () {
        checkIfDeviceIsVisible();
        devices.click();
    }



}
