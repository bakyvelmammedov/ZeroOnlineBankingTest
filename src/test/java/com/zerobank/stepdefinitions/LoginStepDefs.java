package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

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
        //Driver.get().switchTo().alert().accept();

    }

    @Then("Account summary page should be displayed")
    public void account_summary_page_should_be_displayed() {

        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Summary",actualTitle);
    }

    @When("the user enters the blank username or password")
    public void the_user_enters_the_black_username_or_password_and_clicks() {
        String userName = ConfigurationReader.get("blank_username");
        String userPassword = ConfigurationReader.get("blank_password");

        new LoginPage().login(userName, userPassword);

    }

    @Then("the user should be able to see {string} message.")
    public void the_user_should_be_able_to_see_message(String errorMessage) {
        String actualString = new LoginPage().errorMessage.getText();
        Assert.assertEquals(errorMessage,actualString);

    }

    @When("the user enters the wrong username or password")
    public void the_user_enters_the_wrong_username_or_password_and_clicks() {
        String userName = ConfigurationReader.get("wrong_username");
        String userPassword = ConfigurationReader.get("wrong_password");

        new LoginPage().login(userName, userPassword);
    }


}
