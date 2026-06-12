package com.daySix;

interface Addition {
    int add(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {

        Addition obj = (a, b) -> a + b;

        System.out.println("Addition =  "+obj.add(10, 20));
    }
}