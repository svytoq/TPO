package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPage extends Page {
    @FindBy(xpath = "/html/body/section/div[1]/section[1]/div[1]/div/div[1]/a[1]")
    protected WebElement currentCityLink;
    @FindBy(xpath = "/html/body/header/div[2]/div[2]/div/div/div/div/input")
    protected WebElement searchBar;
    @FindBy(xpath = "/html/body/section/div[1]/section[2]/div/div[1]/div[1]/span[2]")
    protected WebElement clearHistorySpan;
//    @FindBy(xpath = "/html/body/section/div[1]/section[2]/div/div[@class='cities-viewed']")
//    protected WebElement ViewedCitiesDiv;
    @FindBy(xpath = "/html/body/section/div[1]/section[1]/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/span[1]")
    protected WebElement currentCityTemp;

    public MainPage(WebDriver driver) {
        super(driver);
//        driver.manage()
//                .timeouts()
//                .implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("mainPage"));
        PageFactory.initElements(driver, this);
    }

    public void clickOnCurrentCityLink() {
        currentCityLink.click();
    }

    public void clickOnSearchBar() {
        searchBar.click();
    }

    public void sendKeysToSearchBar(String keys) {
        searchBar.sendKeys(keys);
    }

    public void sendReturnToSearchBar() {
        searchBar.sendKeys(Keys.RETURN);
    }

    public void clickOnClearHistorySpan() {
        clearHistorySpan.click();
    }

    public String getTextFromCurrentCityTemp() {
        return currentCityTemp.getText();
    }
}