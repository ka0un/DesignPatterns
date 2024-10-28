package org.example;

public class BasicSingeliton {
    private static BasicSingeliton instance; // 01, private static itself field

    private BasicSingeliton() { // 02, private no-arg constructor
    }

    public static BasicSingeliton getInstance() { // 03, public static getInstant method
        if (instance == null) { //check is null then create
            instance = new BasicSingeliton();
        }
        return instance;
    }
}
