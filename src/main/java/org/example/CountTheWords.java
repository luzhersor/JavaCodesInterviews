package org.example;

import java.util.Scanner;

public class CountTheWords {

    public static void main(String[] args) {
        System.out.println("Enter your string");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        for(int i=0; i<str.length(); i++){
            if((str.charAt(i) == ' ') && (str.charAt(i+1)!=' ')){
                count++;
            }
        }

        System.out.println(count+1);
    }

}
