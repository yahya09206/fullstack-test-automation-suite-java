package com.yahya.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WSwagLogin {

    @FindBy(xpath = "//div/input[@id='user-name']")
    WebElement login;
    @FindBy(xpath = "//div/input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//div/input[@id='login-button']")
    WebElement submit;
}
