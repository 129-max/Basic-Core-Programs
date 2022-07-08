package com.example.bridgelabz;

public class LargestAmongThree {
    public static void main(String[] args) {
        Day5logic largestN = new Day5logic();
        System.out.print("Enter the number num1 : ");
        int num1 = largestN.getIntValue();
        System.out.print("Enter the number num2 : ");
        int num2 = largestN.getIntValue();
        System.out.print("Enter the number num3 : ");
        int num3 = largestN.getIntValue();
        largestN.getLargestNumber(num1, num2, num3);



    }
}
