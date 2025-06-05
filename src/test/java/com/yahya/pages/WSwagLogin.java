package com.yahya.pages;

import com.yahya.utility.ConfigReader;
import com.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WSwagLogin {

    @FindBy(xpath = "//div/input[@id='user-name']")
    WebElement login;
    @FindBy(xpath = "//div/input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//div/input[@id='login-button']")
    WebElement submit;

    public WSwagLogin(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){

        Driver.getDriver().get(ConfigReader.read("swag_url"));
    }
}
