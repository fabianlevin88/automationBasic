package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Logger;

import static utils.Config.*;

public class LandingPage extends BasePage {


    @FindBy(css = ".gLFyf.gsfi")
    private WebElement searchInput;

    public LandingPage(WebDriver pDriver) {
        super(pDriver);
        pDriver.get(getGOOGLE());
    }

    public ResultPage search(String search) {

        getWait().until(ExpectedConditions.elementToBeClickable(searchInput));

        Logger.printInfo("Entering the search text: " + search);

        searchInput.sendKeys(search);

        searchInput.sendKeys(Keys.ENTER);

        return new ResultPage(getDriver());
    }
}
