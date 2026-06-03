package com.dayTwo;

abstract class Bank {
    abstract double calculateInterest(double amount);
}

class SBI extends Bank {
    double calculateInterest(double amount) {
        return amount * 0.06;
    }
}

class HDFC extends Bank {
    double calculateInterest(double amount) {
        return amount * 0.07;
    }
}

class ICICI extends Bank {
    double calculateInterest(double amount) {
        return amount * 0.08;
    }
}

public class BankInterestCalculation {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Interest: " + b1.calculateInterest(100000));
        System.out.println("HDFC Interest: " + b2.calculateInterest(100000));
        System.out.println("ICICI Interest: " + b3.calculateInterest(100000));
    }
}