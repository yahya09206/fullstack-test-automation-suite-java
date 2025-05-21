package com.yahya.utility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase {

    protected WebDriver driver;

    @BeforeEach
    public void setupWebDriver(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();

        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }
}
