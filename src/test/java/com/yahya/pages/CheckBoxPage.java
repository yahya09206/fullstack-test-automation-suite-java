package com.yahya.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage {

    @FindBy(name = "//input[@name='checkbox1']")
    public WebElement checkbox1;
    @FindBy(name = "//input[@name='checkbox2']")
    public WebElement checkbox2;



}
