package com.yahya.pages;

import com.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WLoginPage {

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement usernameField;
    @FindBy(id = "ctl00_MainContent_password")
    private WebElement passwordField;
    @FindBy(xpath = "//div/input[@name='ctl00$MainContent$login_button']")
    private WebElement loginButton;

    // No arg constructor to instruct selenium
    public WLoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

}
