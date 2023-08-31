package org.example;

import java.sql.SQLOutput;

public class CountNumberDigitsNumber {

    public static void main(String[] args) {

        int num = 12345;
        int count = 0;

        while(num>0){
            num = num/10;
            count++;
        }

        System.out.println("Number of digits in a N are "+count);

        String str1 = Integer.toString(123456);
        System.out.println(str1.length());




    }
}
