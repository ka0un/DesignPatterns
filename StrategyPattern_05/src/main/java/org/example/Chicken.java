package org.example;

import org.example.fly.FlySlow;
import org.example.run.RunFast;

public class Chicken extends Bird {
    public Chicken() {
        super();
        setFlyBehavior(new FlySlow());
        setRunBehavior(new RunFast());
    }

    @Override
    public void display() {
        System.out.println("I am a chicken");
    }
}
