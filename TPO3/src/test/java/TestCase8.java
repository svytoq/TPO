import org.example.MainPage;
import org.example.MapsPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TestCase8 extends AbstractTest {
    @Test
    public void getSyberiaTempMap() {
        MapsPage page = new MapsPage(webDriver);
//        page.clickOnHeaderMaps();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // click on
        webDriver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div/div/div[2]/a[2]")).click();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        webDriver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div/div/a[3]")).click();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        // div is not interactible
        webDriver.findElement(By.xpath("/html/body/section/div/section/div[1]/div[2]/div[16]")).click();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }
}
