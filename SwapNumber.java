package com.example.bridgelabz;

public class SwapNumber {
    public static void main(String[] args) {

        Day5logic swap = new Day5logic();
        System.out.print("Enter first number num1 : ");
        int num1 = swap.getIntValue();
        System.out.print("Enter first number num2 : ");
        int num2 = swap.getIntValue();
        swap.SwapNumber(num1,num2);
    }
}
