package com.yahya.pages;

import com.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {

    @FindBy(name = "//input[@name='checkbox1']")
    public WebElement checkbox1;
    @FindBy(name = "//input[@name='checkbox2']")
    public WebElement checkbox2;

    public CheckBoxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
