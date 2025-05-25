package com.yahya.pages;

import com.yahya.utility.ConfigReader;
import com.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WLoginPage {

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameField;
    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordField;
    @FindBy(xpath = "//div/input[@name='ctl00$MainContent$login_button']")
    public WebElement loginButton;

    // No arg constructor to instruct selenium
    public WLoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     *Method to navigate to login page
     */
    public void goTo(){
        Driver.getDriver().get(ConfigReader.read("weborder_url"));
    }

    /**
     * Login with parameters
     * @param username username
     * @param password password
     */
//    public void login(String username, String password ){
//
//        // you can access directly using userNameField or this.userNameField
//        this.usernameField.sendKeys(username);
//        this.passwordField.sendKeys(password);
//        this.loginButton.click();
//
//    }

}
