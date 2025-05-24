package com.yahya.tests.day09;

public class Singleton {


    private static Singleton obj;

    private Singleton(){
    }

    public static Singleton getObj(){
        obj = new Singleton();

        return obj;
    }

}
