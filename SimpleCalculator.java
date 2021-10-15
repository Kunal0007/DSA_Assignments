package com.company.DSA_Assignments;

import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any operation (+,-,*,/) :");
        char op = in.next().charAt(0);
        System.out.println("Enter two numbers :");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(calculator(a, b, op));
    }

    static int calculator(int a, int b, char op){
        int result = -1;
        if(op == '+'){
            result = add(a, b);
        }

        if(op == '-'){
            result = sub(a, b);
        }

        if(op == '*'){
            result = mutliple(a, b);
        }

        if(op == '/'){
            result = divide(a, b);
        }

        return result;
    }

    static int add(int a, int b){
        return a + b;
    }

    static int sub(int a, int b){
        return a - b;
    }

    static int mutliple(int a, int b){
        return a * b;
    }

    static int divide(int a, int b){
        return a / b;
    }
}
