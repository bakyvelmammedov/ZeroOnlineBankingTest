package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
    Account Activity page should have the title Zero – Account activity.
    In the Account drop down default option should be Savings.
    Account drop down should have the following options:
        Savings,
        Checking,
        Loan,
        Credit Card,
        Brokerage.

    Transactions table should have column names
        -Date,
        -Description,
        -Deposit,
        -Withdrawal.
 */
public class AccountActivityPage extends BasePage{

    public AccountActivityPage(){
        PageFactory.initElements(Driver.get(),this);
    }



}
