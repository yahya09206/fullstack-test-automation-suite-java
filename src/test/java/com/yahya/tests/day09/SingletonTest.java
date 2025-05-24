package com.yahya.tests.day09;

import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void testSingleton(){

        Singleton s1 = new Singleton();
        s1.oneWord = "abc";

    }
}
