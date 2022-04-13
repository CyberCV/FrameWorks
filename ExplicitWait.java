import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    public static String url =
            "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/login.aspx";
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver",
                "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);


        WebElement userName = driver.findElement
                (By.id("ctl00_MainContent_username"));

        WebElement password = driver.findElement
                (By.id("ctl00_MainContent_password"));

        userName.click();
        userName.sendKeys("Tester");

        password.click();
        password.sendKeys("test");

        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_MainContent_login_button")));

        WebElement submitButton = driver.findElement
                (By.id("ctl00_MainContent_login_button"));

        submitButton.click();

    }

}
