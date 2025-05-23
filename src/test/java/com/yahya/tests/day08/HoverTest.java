package com.yahya.tests.day08;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverTest extends TestBase {

    @Test
    public void testHoverAction(){

        driver.get("https://practice.cydeo.com/hovers");

        // locate first image
        WebElement firstImg = driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(firstImg).perform();

        BrowserUtil.waitFor(2);
    }
}
