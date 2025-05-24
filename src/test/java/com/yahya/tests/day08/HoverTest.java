package com.yahya.tests.day08;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Assertions;
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

        WebElement firstProfileElm = driver.findElement(By.xpath("//div/h5[.='name: user1']"));
        Assertions.assertTrue(firstProfileElm.isDisplayed());

        BrowserUtil.waitFor(2);

        WebElement secondImg = driver.findElement(By.xpath("(//div[@class='figure']/img)[2]"));
        actions.moveToElement(secondImg).perform();
        BrowserUtil.waitFor(2);

        WebElement thirdImg = driver.findElement(By.xpath("(//div[@class='figure']/img)[3]"));
        actions.moveToElement(thirdImg).perform();
        BrowserUtil.waitFor(2);

        actions.moveToElement(firstImg).pause(2000)
                .moveToElement(secondImg).pause(2000)
                .moveToElement(thirdImg).pause(2000).perform();

        BrowserUtil.waitFor(2000);
    }
}
