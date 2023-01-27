
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.DriverUtil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class RunnerTest {
    private static final String URL = "https://automationteststore.com";

    private static ChromeDriver chromeDriver;
    private static DriverUtil driverUtil;

    @BeforeAll
    public static void beforeAll() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--kiosk");
        chromeDriver = new ChromeDriver(options);
        driverUtil = new DriverUtil(chromeDriver);

    }
    @BeforeEach
    public void beforeEach() {
        chromeDriver.get(URL);
    }

    @AfterAll
    public static void afterAll() {
        chromeDriver.close();
    }


    public static ChromeDriver getChromeDriver() {
        return chromeDriver;
    }

    public static DriverUtil getDriverUtil() {
        return driverUtil;
    }

}







