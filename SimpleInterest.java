package com.company.DSA_Assignments;

import java.util.Scanner;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principal: ");
        int p = in.nextInt();
        System.out.println("Enter time: ");
        int t = in.nextInt();
        System.out.println("Enter rate: ");
        int r = in.nextInt();

        int SimpleInterest = (p * t * r) / 100 ;
        System.out.println("Simple Interest is " + SimpleInterest);
    }
}
