package tests;

import org.junit.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.ResultPage;
import pages.SeleniumPage;

public class SearchTest extends BaseTest {

    @Parameters({"search"})
    @Test
    public void googleSearch(String search) {

        LandingPage landingPage = getLandingPage();

        ResultPage resultPage = landingPage.search(search);

        SeleniumPage selenium = resultPage.selectResult();

        Assert.assertTrue(selenium.validatePageOpen());
    }
}
