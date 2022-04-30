package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AddEmployeeSteps extends CommonMethods {
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        click(employeeSearchPage.pimOption);
    }
    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        click(addEmployeePage.addEmployee);
    }
    @When("user enters firstname middlename and lastname")
    public void user_enters_firstname_middlename_and_lastname() {
        sendText(addEmployeePage.firstNameBox,"Bookie" );
        sendText(addEmployeePage.middleNameBox,"Bodegea" );
        sendText(addEmployeePage.lastNameBox, "Johnson");
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeePage.Save_btn);
    }
    @Then("employee added successfully")
    public void employee_added_successfully() {
        tearDown();

    }

}
