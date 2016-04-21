import org.junit.After;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test1 extends TestBase {

    @Test
    public void test1() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        driver = new RemoteWebDriver(new URL("http://172.16.64.131:4444/wd/hub"), caps);
        driver.navigate().to("https://mail.ru");
    }

    @After
    public void teardown() {
        driver.close();
    }
}
