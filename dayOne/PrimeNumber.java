package com.dayOne;

public class PrimeNumber {
	    public static void main(String[] args) {
	        int n = 13;
	        boolean prime = true;

	        if(n <= 1) prime = false;

	        for(int i = 2; i <= Math.sqrt(n); i++) {
	            if(n % i == 0) {
	                prime = false;
	                break;
	            }
	        }

	        System.out.println(prime ? "Prime" : "Not Prime");
	    }
}
