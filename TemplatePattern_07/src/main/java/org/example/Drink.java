package org.example;

public abstract class Drink {
    final void prepareRecipe() {
        brew();
        addThings();
    }

    abstract void brew();
    abstract void addThings();
}
