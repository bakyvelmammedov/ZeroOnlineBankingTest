package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement singInBtn;

    @FindBy(id = "user_login")
    public WebElement usernameInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    //driver.findElement(By.id("_submit"));
    @FindBy(name = "submit")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;


    public void login(String username,String password){
        singInBtn.click();
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }
}
