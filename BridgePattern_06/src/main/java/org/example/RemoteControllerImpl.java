package org.example;

public class RemoteControllerImpl implements RemoteController {
    private TV tv;

    public RemoteControllerImpl(TV tv) {
        this.tv = tv;
    }

    @Override
    public void play() {
        tv.play();
    }
}
