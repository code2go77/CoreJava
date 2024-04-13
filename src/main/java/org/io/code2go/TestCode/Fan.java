package org.io.code2go.TestCode;

class Fan {

    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Fan is spinning");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Fan is Stopped");
    }
}
