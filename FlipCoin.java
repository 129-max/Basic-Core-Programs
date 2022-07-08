package com.example.bridgelabz;

import static com.example.bridgelabz.Day5logic.FlipCoinPercent;

public class FlipCoin {

    public static void main(String[] args) {

        Day5logic flipcoin = new Day5logic();
        System.out.print("Enter the numer of coin toss : ");
        int noOfFlips = flipcoin.getIntValue();
        Day5logic.FlipCoinPercent(noOfFlips);

    }

}
