package com.example.bridgelabz;

public class PowerofTo {
    public static void main(String[] args) {
        Day5logic power = new Day5logic();
        System.out.print("Enter the Number to check power of two : ");
        int Number = power.getIntValue();
        power.getPower(Number);
    }
}
