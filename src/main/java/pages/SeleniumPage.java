package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Logger;

public class SeleniumPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"mainContent\"]/h2[1]")
    private WebElement whatIsSelenium;

    public SeleniumPage(WebDriver pDriver) {
        super(pDriver);
    }

    public Boolean validatePageOpen() {

        Logger.printInfo("Validating that the seleniumHQ page is open");

        Logger.printInfo("Section title:" + whatIsSelenium.getText());

        return whatIsSelenium.getText().equals("What is Selenium?");
    }
}
