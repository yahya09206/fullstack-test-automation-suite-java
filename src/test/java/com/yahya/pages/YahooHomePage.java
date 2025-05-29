package com.yahya.pages;

import com.yahya.utility.ConfigReader;
import com.yahya.utility.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooHomePage {

    @FindBy(name = "p")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchBtn;

    public YahooHomePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * Navigate to google homepage
     */
    public void goTo(){
        Driver.getDriver().get(ConfigReader.read("yahoo_url"));
    }

    public void searchKeyword(String keyword){

        this.searchBox.sendKeys(keyword, Keys.ENTER);
        //this.searchBtn.click();
    }

    public boolean isAt(){
        return Driver.getDriver().getTitle().startsWith("Yahoo");
    }
}