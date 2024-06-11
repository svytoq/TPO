import org.example.CityPage;
import org.example.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;

public class TestCase3 extends AbstractTest {

    @Test
    public void fillHistoryAndClear() {
        MainPage page = new MainPage(webDriver);
        page.clickOnSearchBar();
        page.sendKeysToSearchBar("Караганда\uE007");
        page.clickOnHeaderWeather();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        page.clickOnClearHistorySpan();
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            webDriver.findElement(By.xpath("/html/body/section/div[1]/section[2]/div/div[@class='cities-viewed']"));
        });
    }
}
