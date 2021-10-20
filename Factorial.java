package com.company.DSA_Assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Factorial: " + factorial(n));
    }
    
    static int factorial(int n){
        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }

        return fac;
    }
    
}
