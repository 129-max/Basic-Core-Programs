package com.example.bridgelabz;

public class QuotientRR {
    public static void main(String[] args) {
        Day5logic Qremind = new Day5logic();
        System.out.print("Enter the Devident: ");
        int Devident = Qremind.getIntValue();
        System.out.print("Enter the Devisor : ");
        int Devisor = Qremind.getIntValue();
        Qremind.getQuotientRemainder(Devisor, Devident);

    }
}
