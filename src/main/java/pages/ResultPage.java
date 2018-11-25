package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Logger;

public class ResultPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3")
    private WebElement link;



    public ResultPage(WebDriver pDriver) {
        super(pDriver);
    }

    public SeleniumPage selectResult() {

        getWait().until(ExpectedConditions.elementToBeClickable(link));

        Logger.printInfo("Clicking on the Selenium page link: " + link.getText());

        link.click();

        return new SeleniumPage(getDriver());

    }
}
