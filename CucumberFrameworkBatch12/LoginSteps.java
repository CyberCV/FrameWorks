import io.cucmber.java.en.*;

public class LoginSteps {

    @Given("I navigated to the HRMS app")
    public void I_navigated_to_the_HRMS_app(){

        System.out.println("I am on the hrms app");
    }
    @When("I enter valid username")
    public void I_enter_valid_username(){
        System.out.println("Username is entered");
    }
    @When("I enter valid password")
    public void I_enter_valid_password(){
        System.out.println("Password is entered");
    }
    @When("I click login button")
    public void I_click_login_button(){
        System.out.println("Clicked login button");
    }
    @Then("I am successfully logged in")
    public void I_am_successfully_logged_in(){
        System.out.println("Successfully logged in");
    }
}
