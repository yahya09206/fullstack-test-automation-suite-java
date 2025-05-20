package com.yahya.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchPageTest {

    WebDriver driver;

    @BeforeAll
    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupWebDriver(){
        driver = new ChromeDriver();
        driver.get("https://search.yahoo.com");
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void yahooSearchPageOne(){

        driver.get("https://search.yahoo.com");
        String expectedTitle = "Yahoo Search - Web Search";

        Assertions.assertEquals(expectedTitle, driver.getTitle());
    }

    @Test
    public void testYahooSearchResultPageTitle(){

        driver.get("https://search.yahoo.com");
        String title = "selenium - Yahoo Search Results";

        WebElement searchBox = driver.findElement(By.xpath("//div/input[@name='p']"));
        searchBox.sendKeys("selenium", Keys.ENTER);

        Assertions.assertEquals(title, driver.getTitle());

    }

}

