import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    public static String url =
            "https://www.checkbox.com/free-checkbox-trial/on-premises-survey-software/";

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"wpforms-23444-field_4_1\"]")).click();

    }
}

