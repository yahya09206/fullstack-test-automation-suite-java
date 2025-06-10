package com.yahya.pages;

import com.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {

    @FindBy(xpath = "//input[@name='checkbox1']")
    public WebElement checkbox1;
    @FindBy(xpath = "//input[@name='checkbox2']")
    public WebElement checkbox2;

    public CheckBoxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){

        Driver.getDriver().get("https://practice.cydeo.com/checkboxes");

    }

    public void selectBox(){


        if (!this.checkbox1.isSelected()){
            this.checkbox1.click();
        }else {
            System.out.println("Box is already selected!");
        }

    }
}
