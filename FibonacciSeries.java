package com.company.DSA_Assignments;

import java.util.Scanner;

// Calculate Fibonacci Series up to n numbers.

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fibonacci(n);
    }

    static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);

        for (int i = 0; i < n - 2; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }

}
