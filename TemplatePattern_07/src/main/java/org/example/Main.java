package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Template Method Pattern
        // Dont call me i will call you

        Drink tea = new Tea();
        Drink coffee = new Coffee();

        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}