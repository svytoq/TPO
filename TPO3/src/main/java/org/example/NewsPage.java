package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsPage extends Page {
    @FindBy(xpath = "/html/body/section/div[1]/section[2]/div[3]")
    protected WebElement extraNewsButton;
    @FindBy(xpath = "/html/body/header/div[2]/div[2]/div/div/a[3]")
    protected WebElement natureSectionLink;

    public NewsPage(WebDriver driver) {
        super(driver);
        driver.get(ConfProperties.getProperty("newsPage"));
        PageFactory.initElements(driver, this);
    }

    public void clickOnExtraNewsButton() {
        extraNewsButton.click();
    }

    public void clickOnNatureSection() {
        natureSectionLink.click();
    }


}
