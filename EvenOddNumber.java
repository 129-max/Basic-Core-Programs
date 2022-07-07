package com.example.bridgelabz;

public class EvenOddNumber {

    public static void main(String[] args) {
        Day5logic oddd = new Day5logic();
        System.out.print("Enter the number to check even & odd : ");
        int Number = oddd.getIntValue();
        oddd.getEvenOdd(Number);
    }

}



