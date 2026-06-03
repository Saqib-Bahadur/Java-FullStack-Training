package com.dayOne;

public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 2;
        int exp = 5;
        int result = 1;

        for(int i = 1; i <= exp; i++) {
            result *= base;
        }

        System.out.println(result);
    }
}