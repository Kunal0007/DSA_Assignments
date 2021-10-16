package com.company.DSA_Assignments;

import java.util.Scanner;

// Find out whether the given String is Palindrome or not

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(palindrome(word));
    }

    static boolean palindrome(String word){
        int pal = 0;
        word = word.replaceAll("\\s", "");
        int n = word.length();
        for (int i = 0; i < n/2; i++) {
            if(word.charAt(i) == word.charAt(n-i-1)){
                pal++;
            }
        }

        return pal == word.length()/2;
    }

}
