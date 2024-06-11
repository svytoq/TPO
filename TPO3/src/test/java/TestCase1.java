import org.example.ConfProperties;
import org.example.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCase1 extends AbstractTest {


    @Test
    public void weatherLinkRedirectsToWeatherPage() {
        MainPage page = new MainPage(webDriver);
        page.clickOnHeaderWeather();
        String currentURL = webDriver.getCurrentUrl();
        String expected = ConfProperties.getProperty("weatherPage");
        Assertions.assertEquals(expected, currentURL);
    }

    @Test
    public void newsLinkRedirectsToNewsPage() {
        MainPage page = new MainPage(webDriver);
        page.clickOnHeaderNews();
        String currentURL = webDriver.getCurrentUrl();
        String expected = ConfProperties.getProperty("newsPage");
        Assertions.assertEquals(expected, currentURL);
    }

    @Test
    public void mapsLinkRedirectsToMapsPage() {
        MainPage page = new MainPage(webDriver);
        page.clickOnHeaderMaps();
        String currentURL = webDriver.getCurrentUrl();
        String expected = ConfProperties.getProperty("mapsPage");
        Assertions.assertEquals(expected, currentURL);
    }

    @Test
    public void informersLinkRedirectsToInformersPage() {
        MainPage page = new MainPage(webDriver);
        page.clickOnHeaderInformers();
        String currentURL = webDriver.getCurrentUrl();
        String expected = ConfProperties.getProperty("informersPage");
        Assertions.assertEquals(expected, currentURL);
    }

    @Test
    public void appsLinkRedirectsToAppsPage() {
        MainPage page = new MainPage(webDriver);
        page.clickOnHeaderApps();
        String currentURL = webDriver.getCurrentUrl();
        String expected = ConfProperties.getProperty("appsPage");
        Assertions.assertEquals(expected, currentURL);
    }
}
