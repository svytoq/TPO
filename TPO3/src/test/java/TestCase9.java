import org.example.ConfProperties;
import org.example.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class TestCase9 extends AbstractTest {
    @Test
    public void followAndroidAppLink() {
        MainPage page = new MainPage(webDriver);
//        page.clickOnHeaderApps();
        // Go to Apps page
        webDriver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[3]/div/a[last()]"));
//
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Android button
        webDriver.findElement(By.xpath("/html/body/section/div/section/div[3]/div[1]/div[3]/a")).click();
        String url = webDriver.getCurrentUrl();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        webDriver.findElement(By.xpath("/html/body/section/div/section/div[2]/div/a")).click();
        String currentURL = webDriver.getCurrentUrl();
        Assertions.assertEquals(ConfProperties.getProperty("androidAppURL"), currentURL);
    }
}
