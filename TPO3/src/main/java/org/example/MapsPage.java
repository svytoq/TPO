package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MapsPage extends Page {

    @FindBy(xpath = "/html/body/header/div[2]/div[2]/div/div/div[1]/a[1]")
    protected WebElement regionSyberia;

    @FindBy(xpath = "/html/body/header/div[2]/div[2]/div/div/a[2]")
    protected WebElement windMapType;

    @FindBy(xpath = "/html/body/section/div/section/div[1]/div[2]")
    protected WebElement timeFormatDropDown;

    public MapsPage(WebDriver driver) {
        super(driver);
        driver.get(ConfProperties.getProperty("mapsPage"));
        PageFactory.initElements(driver, this);
    }


}
