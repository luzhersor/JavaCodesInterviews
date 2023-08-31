package org.example;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String");

        String str = sc.next();
        String orgStr = str;

        String rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }

        System.out.println(rev);

        if(str.equals(rev)){
            System.out.println("Are Palindromes");
        } else {
            System.out.println("Are not Palindromes");
        }
    }
}
