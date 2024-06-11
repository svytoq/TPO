import org.example.CityPage;
import org.example.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;

public class TestCase5 extends AbstractTest {
    @Test
    public void findACityAndGetTemp() {
        MainPage page = new MainPage(webDriver);
        page.clickOnSearchBar();
        page.sendKeysToSearchBar("Караганда");
        page.sendReturnToSearchBar();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        CityPage cityPage = new CityPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String expectedURL = "https://www.gismeteo.ru/weather-karaganda-5168/";
//        String temp = cityPage.getTextFromCurrentCityTemp();
        Assertions.assertEquals(expectedURL, webDriver.getCurrentUrl());
    }
}
