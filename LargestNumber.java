package com.company.DSA_Assignments;

import java.util.Scanner;

// Take 2 numbers as input and print the largest number.

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(largest(a, b));
    }

    static int largest(int a, int b){
        if(a > b){
            return a;
        }

        return b;
    }

}
