package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CityPage extends Page {

    @FindBy(xpath = "/html/body/section[2]/div[1]/section[3]/div[2]/div[1]/button")
    protected WebElement dataConfigButton;
    @FindBy(xpath = "/html/body/section[2]/div[1]/section[3]/div[2]/div[4]/div/div[2]/div/div[2]/div[2]")
    protected WebElement configTempByFeel;
    @FindBy(xpath = "/html/body/section[2]/div[1]/section[2]/div/a[1]/div/div[1]/div[3]/div[1]/span[1]/span")
    protected WebElement currentCityTemp;

    public CityPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnDataConfigButton() {
        dataConfigButton.click();
    }

    public void clickOnConfigTempByFeel() {
        configTempByFeel.click();
    }

    public String getTextFromCurrentCityTemp() {
        return currentCityTemp.getText();
    }
}
