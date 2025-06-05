package com.yahya.pages;

import com.yahya.utility.ConfigReader;
import com.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WSwagLogin {

    @FindBy(xpath = "//div/input[@id='user-name']")
    WebElement loginField;
    @FindBy(xpath = "//div/input[@id='password']")
    WebElement passwordField;
    @FindBy(xpath = "//div/input[@id='login-button']")
    WebElement submit;
    @FindBy(xpath = "//span[.='Products']")
    WebElement productsPageName;

    public WSwagLogin(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){

        Driver.getDriver().get(ConfigReader.read("swag_url"));
    }

    public void login(String username, String password){

        this.loginField.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.submit.click();
    }

    public boolean verifyProductsPage(){

        return this.productsPageName.isDisplayed();

    }
}
