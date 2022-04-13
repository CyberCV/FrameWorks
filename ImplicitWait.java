import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
//https://chercher.tech/practice/implicit-wait-example

public class ImplicitWait {
    public static String url =
            "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/login.aspx";
    public static String url1 =
            "htpps//syntaxproject.com/dynamic-elements-loading.php";


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);


        WebElement userName = driver.findElement
                (By.id("ctl00_MainContent_username"));

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement password = driver.findElement
                (By.id("ctl00_MainContent_password"));

        userName.click();
        userName.sendKeys("Tester");

        password.click();
        password.sendKeys("test");

        WebElement submitButton = driver.findElement
                (By.id("ctl00_MainContent_login_button"));

        submitButton.click();

        driver.get(url1);


        WebElement btn = driver.findElement(By.id("startButton"));
        btn.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement WelcomeMsg = driver.findElement(By.xpath
                ("//*[contains(text(), 'Welcome Syntax')]"));
        System.out.println(WelcomeMsg.getText());
    }
}

