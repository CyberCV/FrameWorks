import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitDemo {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait =
                new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(5))
                        //waits
                        .pollingEvery(Duration.ofSeconds(5))
                        //looks every 5 seconds
                        .ignoring(NoSuchElementException.class);
                         //ignores exception
    }
}


/*

implicit waits to locate the element

explict waits untill certain condition

fluent waits sets timeout, pulling and ignores needed
exceptions in the given time period

WebTables:
Webtables are elements on the webpage, which are constructed
by having rows and columes
 types of WebTables
 Static
 Dynamic
 */