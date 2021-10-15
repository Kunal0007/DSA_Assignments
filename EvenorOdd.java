package com.company.DSA_Assignments;

import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input.

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(evenorodd(num));
    }

    static boolean evenorodd(int num){
        if(num < 0){
            num = num * -1;
        }

        if(num % 2 == 0){
            return true;
        }
        return false;
    }
}
