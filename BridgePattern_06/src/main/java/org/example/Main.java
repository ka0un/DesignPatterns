package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TV one = new SonyTV();
        TV two = new LGTV();

        new RemoteControllerImpl(one).play();
        new RemoteControllerImpl(two).play();
    }
}