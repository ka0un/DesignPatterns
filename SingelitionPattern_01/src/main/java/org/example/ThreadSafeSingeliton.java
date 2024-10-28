package org.example;

public class ThreadSafeSingeliton {
    private static ThreadSafeSingeliton instance;

    private ThreadSafeSingeliton() {
    }

    //just add synchronized keyword to make it thread safe
    // but it will slow down the performance
    public static synchronized ThreadSafeSingeliton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingeliton();
        }
        return instance;
    }
}
