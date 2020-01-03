package tests;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PositiveSearch {
    @Test
    public void appiumTest() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "My Mobile Device");
        caps.setCapability("udid", "3300955051847239");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "pl.otomoto");
        caps.setCapability("appActivity", "com.fixeads.verticals.cars.startup.view.activities.StartupActivity");
        caps.setCapability("browserName", "");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

        FluentWait<MobileDriver> wait = new FluentWait<>((MobileDriver) driver)
                .pollingEvery(Duration.ofMillis(500))
                .withTimeout(Duration.ofSeconds(30))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NullPointerException.class)
                .ignoring(ClassCastException.class);

        driver.resetApp();
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@text='Części']"))));
        PartsPage partsPage = new PartsPage(driver);
        partsPage.goToPartsPage();
        System.out.println("Test completed successfully");

        driver.quit();
    }
}