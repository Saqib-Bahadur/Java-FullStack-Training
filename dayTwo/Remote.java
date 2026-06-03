package com.dayTwo;

interface RemoteControl {
    void turnOn();
    void turnOff();
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV ON");
    }

    public void turnOff() {
        System.out.println("TV OFF");
    }
}

class AirConditioner implements RemoteControl {
    public void turnOn() {
        System.out.println("AC ON");
    }

    public void turnOff() {
        System.out.println("AC OFF");
    }
}

public class Remote {
    public static void main(String[] args) {
        RemoteControl tv = new TV();
        RemoteControl ac = new AirConditioner();

        tv.turnOn();
        ac.turnOn();

        tv.turnOff();
        ac.turnOff();
    }
}