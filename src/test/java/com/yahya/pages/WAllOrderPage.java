package com.yahya.pages;

import com.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WAllOrderPage {

    @FindBy(xpath = "//h2[normalize-space(.)='List of All Orders']")
    public WebElement headerElm;
    @FindBy(id = "ctl00_MainContent_btnCheckAll")
    public WebElement checkAllBtn;
    @FindBy(id = "ctl00_MainContent_btnUncheckAll")
    public WebElement uncheckAllBtn;

    public WAllOrderPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


}
