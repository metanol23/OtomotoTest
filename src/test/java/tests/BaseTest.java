package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public AndroidDriver driver;

    @BeforeClass
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "My Mobile Device");
        caps.setCapability("udid", "3300955051847239");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "pl.otomoto");
        caps.setCapability("appActivity", "com.fixeads.verticals.cars.startup.view.activities.StartupActivity");
        caps.setCapability("browserName", "");

         driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
    }

    @AfterClass

    public void teardown () {
       // driver.quit();
    }

}