package org.example;

public class Tea extends Drink {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addThings() {
        System.out.println("Adding lemon");
    }

}
