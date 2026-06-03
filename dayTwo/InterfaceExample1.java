package com.dayTwo;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Photo Captured");
    }

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.takePhoto();
        phone.playMusic();
    }
}