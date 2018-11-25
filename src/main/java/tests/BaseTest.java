package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import pages.LandingPage;
import utils.Logger;
import utils.MyDriver;

import static utils.Config.*;

public abstract class BaseTest {

    MyDriver driver;
    private LandingPage landingPage;

    @Parameters({"browser"})
    @BeforeSuite(alwaysRun = true)
    public void setUp(String browser) {

        Logger.printInfo("Before test suite started");

        selectBrowser(browser);

        landingPage = new LandingPage(driver.getDriver());
    }

    @AfterSuite
    public void tearDown() {

        Logger.printInfo("After suite started and disposing resources");

        landingPage.dispose();
    }

    public LandingPage getLandingPage() {

        Logger.printInfo("Landing page instance returned");

        return landingPage;
    }

    public void selectBrowser(String browser) {

        switch (browser) {
            case "chrome":
                driver = new MyDriver(getCHROME());
                break;
            case "firefox":
                driver = new MyDriver(getFIREFOX());
                break;
            default:
                driver = new MyDriver(getCHROME());
                break;
        }
    }
}
