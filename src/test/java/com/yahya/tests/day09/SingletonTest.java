package com.yahya.tests.day09;

import com.yahya.utility.Driver;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void testSingletonDriver(){

        Driver.getDriver();
        Driver.getDriver();
        Driver.getDriver();
        Driver.getDriver();
    }
}
