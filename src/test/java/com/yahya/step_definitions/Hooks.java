package com.yahya.step_definitions;

import com.yahya.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;

public class Hooks {

    /**
     * Can set up a hook class that contains methods that run each scenario and after each scenario
     * or even when you implement hooks
     * allows you to run certain code before and after each scenario that is tagged with certain tags
     * Don't need to use the extends keyword because io.cucumber.java already knows
     */

    @Before
    public void setUpDriver(){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @After
    public void tearDown(){
        Driver.closeBrowser();
    }
}
