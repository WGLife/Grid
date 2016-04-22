import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test3 {

    private int m = 10;

    @Test
    public void test4() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL("http://172.16.64.131:4444/wd/hub"), caps);
        driver.navigate().to("https://mail.ru");
        new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.id("dsdsdsds")));
        driver.close();
    }

    @Test
    public void test5() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL("http://172.16.64.131:4444/wd/hub"), caps);
        driver.navigate().to("https://mail.ru");
        driver.close();
    }

    @Test
    public void test6() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL("http://172.16.64.131:4444/wd/hub"), caps);
        driver.navigate().to("https://mail.ru");
        new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.id("dsdsdsdsdssdds")));
        driver.close();
    }

}
