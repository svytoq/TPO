import org.example.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCase4 extends AbstractTest {

    @Test
    public void getCurrentCityTemp() {
        MainPage page = new MainPage(webDriver);
        String temp = page.getTextFromCurrentCityTemp();
        Assertions.assertNotNull(temp);
    }
}
