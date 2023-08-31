package org.example;

import java.util.Scanner;

public class AspenSplit {

    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        str = sc.nextLine();

        String[] token = str.split(" "); //Each word
        //Pay attention in " " and "", it's quite different in split method.
        for(int i=token.length-1; i>=0; i--){
            System.out.println(token[i]+" ");
        }


    }
}
