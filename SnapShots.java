

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SnapShots {
    public static String url =
            "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

            driver.get(url);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
            username.sendKeys("Tester");
            WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
            password.sendKeys("test");
            WebElement loginButton = driver.findElement(By.className("button"));
            loginButton.click();

            TakesScreenshot ts = (TakesScreenshot) driver;
            // the screenshot is taken on this step
            File srcFile = ts.getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(srcFile, new File("C://screenshots//SmartBear/adminLogin111.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }











