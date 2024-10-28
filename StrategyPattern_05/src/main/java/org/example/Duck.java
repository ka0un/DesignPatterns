package org.example;

import org.example.fly.FlyBehavior;
import org.example.fly.FlySlow;
import org.example.run.RunBehavior;
import org.example.run.RunFast;

public class Duck extends Bird {
    private FlyBehavior flyBehavior;
    private RunBehavior runBehavior;

    public Duck() {
        super();
        setFlyBehavior(new FlySlow());
        setRunBehavior(new RunFast());
    }

    @Override
    public void display() {

    }


}
