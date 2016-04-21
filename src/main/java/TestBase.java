import org.junit.After;
import org.openqa.selenium.WebDriver;

public class TestBase {

    protected WebDriver driver;

    @After
    public void teardown() {
        driver.close();
    }
}
