package org.example;


//receiver
public class Light {
    private String light;

    public Light(String light) {
        this.light = light;
    }

    public void on() {
        light = "on";
    }

    public void off() {
        light = "off";
    }
}
