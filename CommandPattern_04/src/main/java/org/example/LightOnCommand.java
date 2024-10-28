package org.example;

public class LightOnCommand {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
