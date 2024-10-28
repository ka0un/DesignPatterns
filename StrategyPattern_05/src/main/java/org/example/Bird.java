package org.example;

import org.example.fly.FlyBehavior;
import org.example.run.RunBehavior;

public abstract class Bird {
    FlyBehavior flyBehavior;
    RunBehavior runBehavior;

    public Bird() {
        this.flyBehavior = flyBehavior;
        this.runBehavior = runBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void run() {
        runBehavior.run();
    }

    public abstract void display();
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setRunBehavior(RunBehavior runBehavior) {
        this.runBehavior = runBehavior;
    }
}
