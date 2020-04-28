package com.cybertek.library.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef2 {


    @When("I enter username {string}")
    public void i_enter_username(String username) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(username);
    }


    @When("I enter password {string}")
    public void i_enter_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
    }
    @When("click the sign in button")
    public void click_the_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Clicking on sign in");
    }

    @Then("there should be {int} users")
    public void there_should_be_users(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verifying user count " + int1);
    }

}
