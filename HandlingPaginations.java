import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingPaginations {
    public class WebTablesWIthPagination {
        public static String url =
                "http://syntaxtechs.net";

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            //driver.manage().timeouts().implicitlyWait(10,);
///         login access
           WebElement username = driver.findElement(By.id("txtUsername"));
           WebElement password = driver.findElement(By.id("txtPassword"));
           username.sendKeys("Admin");
           password.sendKeys("Hum@nhrm123");
           WebElement loginBUtton = driver.findElement(By.id("btnLogin"));
           loginBUtton.click();

          // navigating to add employee page
           WebElement pimButton = driver.findElement(By.id("menu_pim_viewPimModule"));
           pimButton.click();
           WebElement employeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
           employeeButton.click();

           //adding employee
            WebElement firstName = driver.findElement(By.id("firstName"));
            WebElement lastName = driver.findElement(By.id("lastName"));

            firstName.sendKeys("Diego");
            lastName.sendKeys(("Asghar"));

            WebElement EmployeeID = driver.findElement(By.id("employeeId"));
            String emplId = EmployeeID.getAttribute("value");

            WebElement SaveButton = driver.findElement(By.id("btnSave"));
            SaveButton.click();

            // finding and deleting employee
            WebElement EmployeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
            EmployeeList.click();



            boolean flag = true;
            while(flag){
                List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr"));
                for (int i = 0; i <tableRows.size(); i++) {
                    String rowText = tableRows.get(i).getText();
                    if(rowText.contains(emplId)) {
                        flag= false;
                        System.out.println("rowText");
                        WebElement checkboxes=
                                driver.findElement
                                        (By.xpath("//table[@id = 'resultTable']/tbody/tr["+i+"]/td[1]"));
                                checkboxes.click();
                                WebElement deleteButton =
                                        driver.findElement
                                                (By.id("btnDelete"));
                                deleteButton.click();
                                WebElement confirmDelete =
                                        driver.findElement(By.id("dialogDeleteBtn"));
                                confirmDelete.click();
                                break;
                    }
                }
                WebElement nextButton = driver.findElement(By.linkText("Next"));
                nextButton.click();
            }




        }
    }

}
