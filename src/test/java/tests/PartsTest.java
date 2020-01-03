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
import org.testng.annotations.Test;
//import pages.HomePage;
//import pages.PartsPage;

public class PartsTest extends BaseTest {

    @Test
        public void selectRIM () {

        System.out.println("Test completed successfully");
        
            //*************PAGE INSTANTIATIONS*************
            pages.HomePage homePage = new pages.HomePage(driver);

            //*************PAGE METHODS********************
            homePage.GoToParts()
              .showMoreParameters()
                    .selectBrand();

            /*  .goToParts()
                    .selectBrandOfCar("Mercedes??")
                    .selectRims(("E-posta adresiniz veya şifreniz hatalı"))
                    .resultsOfSelection();

                   */


        }

}

