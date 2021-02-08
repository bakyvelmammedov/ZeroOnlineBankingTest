package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class LoginStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        String userName = ConfigurationReader.get("username");
        String userPassword = ConfigurationReader.get("password");

        new LoginPage().login(userName, userPassword);

    }

    @Then("Account summary page should be displayed")
    public void account_summary_page_should_be_displayed() {

        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Summary",actualTitle);
    }

}
