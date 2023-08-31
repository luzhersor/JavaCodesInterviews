package org.example;

public class CountOcurrencesCharacterString {

    public static void main(String[] args) {

        String str = "Java Programming Java oops";

        int len = str.length();

        int lenAfter = str.replace("J","").length();

        int res = len - lenAfter;

        //Number of ocurrences
        System.out.println(" " +len + " " + lenAfter+ " "+res);

    }










}
