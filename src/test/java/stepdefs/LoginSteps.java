package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("user in login page")
    public void user_in_login_page() {
        System.out.println("Given step");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("When step");
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String uname, String pass) {
        System.out.println("user enters "+ uname + "user enters "+ pass);
    }



    @And("user click submit")
    public void user_click_submit() {
        System.out.println("And step");
    }

    @Then("user successfully login")
    public void user_successfully_login() {
        System.out.println("Then step");
    }
}
