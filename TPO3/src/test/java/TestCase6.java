import org.example.MainPage;
import org.example.NewsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class TestCase6 extends AbstractTest {
    @Test
    public void getExtraNews() {
        NewsPage page = new NewsPage(webDriver);
        page.clickOnExtraNewsButton();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assertions.assertDoesNotThrow(() -> {
            webDriver.findElement(By.xpath("/html/body/section/div[1]/section[2]/div[2]/a[11]"));
        });
    }
}
