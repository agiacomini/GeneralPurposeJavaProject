package com.giacomini.andrea;

/**
 * Created by Andrea on 18/09/2017.
 */
public class TestSingletonClass {
    private static TestSingletonClass ourInstance = new TestSingletonClass();

    public static TestSingletonClass getInstance() {
        return ourInstance;
    }

    private TestSingletonClass() {
    }
}
