package com.yahya.tests.day06;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class YahooSearchTest extends TestBase {

    @Test
    public void testYahooSearchResultPageTitle(){

        driver.get("https://search.yahoo.com");
        String title = "selenium - Yahoo Search Results";

        WebElement searchBox = driver.findElement(By.xpath("//div/input[@name='p']"));
        searchBox.sendKeys("selenium", Keys.ENTER);

        Assertions.assertEquals(title, driver.getTitle());

    }
}
