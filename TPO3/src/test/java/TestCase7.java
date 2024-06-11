import org.example.ConfProperties;
import org.example.news.NatureSection;
import org.example.NewsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class TestCase7 extends AbstractTest {
    @Test
    public void getNewsFromNatureSection() {
        NewsPage page = new NewsPage(webDriver);
        page.clickOnNatureSection();
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        NatureSection natureSection = new NatureSection(webDriver);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        webDriver.findElement(By.xpath("/html/body/section/div[1]/section[1]/div/div[4]/a")).click();
        String expectedURL = ConfProperties.getProperty("fourthNewsArticle");
        Assertions.assertEquals(expectedURL, webDriver.getCurrentUrl());
    }
}
