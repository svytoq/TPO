package org.example.news;

import org.example.ConfProperties;
import org.example.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NatureSection extends Page {

    @FindBy(xpath = "/html/body/section/div[1]/section[1]/div/div[5]/a")
    protected WebElement fourthNewsLink;

    public NatureSection(WebDriver webDriver) {
        super(webDriver);
//            driver.get(ConfProperties.getProperty("newsPage"+"/nature"));
//            PageFactory.initElements(driver, this);
    }

    public void clickOnFourthNewsLink() {
        fourthNewsLink.click();
    }
}