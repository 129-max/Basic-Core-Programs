package com.example.bridgelabz;

public class PrimeFactors {
    public static void main(String[] args) {
        Day5logic primef = new Day5logic();
        System.out.print("Enter the number to check primefactors : ");
        int Number = primef.getIntValue();
        primef.getPrimeFactor(Number);
    }
}
