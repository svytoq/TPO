import org.example.ConfProperties;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AbstractTest {
    private final static long MAX_DELAY = 20000;
    protected static WebDriver webDriver;
    protected static File driverPath;
    protected static File browserPath;

    @BeforeAll
    public static void initializeWebDriver() {
        String driverName = ConfProperties.getProperty("driver");
        if (driverName.equals("chrome")) {
            driverPath = new File(ConfProperties.getProperty("chromedriver"));
            browserPath = new File(ConfProperties.getProperty("chromeBrowser"));
            ChromeOptions options = new ChromeOptions();
            options.setBinary(browserPath);

            ChromeDriverService service =
                    new ChromeDriverService.Builder().usingDriverExecutable(driverPath).build();

            webDriver = new ChromeDriver(service, options);
//        } else if (driverName.equals("firefox")) {
//            System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("firefoxdriver"));
//            webDriver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Driver: " + driverName + " is not supported for testing.");
        }
//        webDriver.manage()
//                .timeouts()
//                .implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterAll
    public static void closeDriver() {
        webDriver.quit();
    }

}
