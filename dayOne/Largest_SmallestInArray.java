package com.dayOne;

public class Largest_SmallestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 40, 25};

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println(min);

        System.out.println(max);
    }
}