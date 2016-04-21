import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test1 {

    @Test
    public void test1() throws MalformedURLException, InterruptedException {
        System.out.println("Test1 class test1");
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL("http://172.16.64.131:4444/wd/hub"), caps);
        driver.navigate().to("https://mail.ru");
        Thread.sleep(9000);
        driver.close();
    }
}
