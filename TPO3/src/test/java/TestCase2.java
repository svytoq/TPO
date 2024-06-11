import org.example.CityPage;
import org.example.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase2 extends AbstractTest {
    @Test
    public void changeConfig() {
        MainPage page = new MainPage(webDriver);
        page.clickOnCurrentCityLink();
        CityPage pageCity = new CityPage(webDriver);
        pageCity.clickOnDataConfigButton();
        pageCity.clickOnConfigTempByFeel();
        Assertions.assertDoesNotThrow(() -> {
            webDriver.findElement(By.xpath("/html/body/section[2]/div[1]/section[3]/div[1]/div/div/div[5]/p"));
        });
    }
}
