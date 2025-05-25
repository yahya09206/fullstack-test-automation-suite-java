package com.yahya.utility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TestBase {

    protected WebDriver driver;

    @BeforeEach
    public void setupWebDriver(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();

        driver = Driver.getDriver();
        //driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void closeBrowser(){
        // quit the driver + make it null
        Driver.closeBrowser();
    }
}
