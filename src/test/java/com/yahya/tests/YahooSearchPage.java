package com.yahya.tests;

import com.yahya.utility.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchPage {

    WebDriver driver;

    @BeforeAll
    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupWebDriver(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }


}
