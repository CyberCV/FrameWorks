package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class AddEmployeePage extends CommonMethods {



    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmployee;

    @FindBy(id="firstName")
    public WebElement firstNameBox;


    @FindBy(id="middleName")
    public WebElement middleNameBox;

    @FindBy(id="lastName")
    public WebElement lastNameBox;

    @FindBy(id="btnSave")
    public WebElement Save_btn;

    public AddEmployeePage() {
        PageFactory.initElements(driver, this);
    }
}
