package org.example;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public abstract class Page {
    protected final WebDriver driver;

    @FindBy(className = "js-menu-link-weather")
    private WebElement weatherLink;
    @FindBy(className = "js-menu-link-news")
    private WebElement newsLink;
    @FindBy(className = "js-menu-link-maps")
    private WebElement mapsLink;
    @FindBy(className = "js-menu-link-informers")
    private WebElement informersLink;
    @FindBy(className = "js-menu-link-soft")
    private WebElement appsLink;

    public void clickOnHeaderWeather() {
        weatherLink.click();
    }

    public void clickOnHeaderNews() {
        newsLink.click();
    }

    public void clickOnHeaderMaps() {
        mapsLink.click();
    }

    public void clickOnHeaderInformers() {
        informersLink.click();
    }

    public void clickOnHeaderApps() {
        appsLink.click();
    }
}
