package org.example;

public class BetterSafeSingeliton {
    private static BetterSafeSingeliton instance;

    private BetterSafeSingeliton() {
    }

    public static BetterSafeSingeliton getInstance() {
        if (instance == null) {  // 01 - check is null then create
            synchronized (BetterSafeSingeliton.class) {  // 02 - synchronized block
                if (instance == null) { // 03 - check is null again then create
                    instance = new BetterSafeSingeliton();
                }
            }
        }
        return instance;
    }
}
