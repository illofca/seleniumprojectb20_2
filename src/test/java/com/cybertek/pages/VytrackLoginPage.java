package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
We store all the web elements and methods related to LoginPage in this .java class.
 */

public class VytrackLoginPage {

    public VytrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/div[1]/div")
    public WebElement errorMessage;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}