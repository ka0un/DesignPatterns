package org.example;

public class Coffee extends Drink {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addThings() {
        System.out.println("Adding sugar and milk");
    }

}
