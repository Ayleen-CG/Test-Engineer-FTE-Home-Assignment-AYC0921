import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//defining annotations
public class BaseTest {
    public WebDriver _driver = get_driver();

    private WebDriver get_driver() {
        System.setProperty("webdriver.chrome.driver", "/Users/ayc0921/Downloads/Challenge_AYC0921/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sheltered-mesa-19374.herokuapp.com/about/");
        return driver;
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("This is the before test");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        _driver.quit();
    }
}
