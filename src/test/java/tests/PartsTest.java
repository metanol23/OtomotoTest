package tests;
import org.testng.annotations.Test;


public class PartsTest extends BaseTest {

    @Test
        public void selectRIM () {

            //Parts Page
            Pages.PartsPage PartsPage = new Pages.PartsPage(driver);

            //Parts page methods
            PartsPage.GoToParts()
              .showMoreParameters()
                    .swipeToBottom()
                    .selectBrand()
                    .typeBrandNameAndConfirm("Mercedes")
                    .selectRims()
                    .showResults()
                    .areThereAnyRims();
        }
}

