import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static String url = "https://jqueryui.com/droppable/";
    public static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        driver.get(url);

        driver.switchTo().frame(0);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
//        action.dragAndDrop(draggable,droppable).perform();

        // whenever you have more than 1 action (in any action class),
        // you have to build() everything first before perform()
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
        driver.navigate().refresh();


    }
}