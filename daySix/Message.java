package com.daySix;

interface MessageEx {
    void display();
}

public class Message {
    public static void main(String[] args) {

        MessageEx m = () -> System.out.println("Hello World!");

        m.display();
    }
}