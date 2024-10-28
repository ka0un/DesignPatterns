package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        Light light = new Light("off");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        lightOnCommand.execute();

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        lightOffCommand.execute();




    }
}