package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Going to the login page");
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("I login as a librarian user")
    public void i_login_as_a_librarian_user() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Loging in as a librarian");
        String email = ConfigurationReader.getProperty("librarian_email");
        String password = ConfigurationReader.getProperty("librarian_password");
        loginPage.login(email, password);
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verifying dashboard page");
        String actualTitle = Driver.getDriver().getCurrentUrl();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        Assert.assertTrue(actualTitle.endsWith("dashboard"));
    }

    @When("I login as a student user")
    public void i_login_as_a_student_user() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Loging in as a student");
    }


    @When("I login as an admin user")
    public void i_login_as_an_admin_user() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Loging in as an admin");
    }


}
