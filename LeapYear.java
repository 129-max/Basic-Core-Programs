package com.example.bridgelabz;

public class LeapYear {

    public static void main(String[] args) {
        Day5logic leap = new Day5logic();
        System.out.print("Enter the year to check is it is leap or not : ");
        int ValueOfYear = leap.getIntValue();
        leap.checkLeapYear(ValueOfYear);
    }
}
