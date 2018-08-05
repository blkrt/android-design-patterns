package com.erfan.android_design_patterns.Creational.Singleton;

/**
 * Created by erfanblkrt on 8/5/2018.
 */

public class Singleton {
    private static Singleton INSTANCE = null;

    private String firstName = "I";
    private String lastName = "am";
    private String job = "A Developer";

    private Singleton() {}

    public static synchronized Singleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return(INSTANCE);
    }


    public String getCurrentJob(){
        return "A Developer";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
