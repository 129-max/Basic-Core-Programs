package com.example.bridgelabz;

public class HarmonicNumber {
    public static void main(String[] args) {
        Day5logic harmonic = new Day5logic();
        System.out.print("Enter the number to check Harmonic number : ");
        int Number = harmonic.getIntValue();
        harmonic.getHarmonicNumber(Number);
    }
}
