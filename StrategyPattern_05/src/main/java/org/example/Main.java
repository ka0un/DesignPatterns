package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //there are multiple behaviors of method fly() in the project
        //we can use them interchangeably
        //this is an example of Strategy pattern

        Bird duck = new Duck();
        duck.display();
        duck.fly();
        duck.run();

        Bird chicken = new Chicken();
        chicken.display();
        chicken.fly();
        chicken.run();


    }
}