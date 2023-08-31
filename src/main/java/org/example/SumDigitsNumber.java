package org.example;

public class SumDigitsNumber {

    public static void main(String[] args) {

        int num = 12345;
        int sum = 0;
        int rem = 0;

        while(num>0){   //12
            rem = num%10;
            sum = sum + rem;    //4+3  2

            num = num/10;       //123  12
        }

        System.out.println("Sum of digits in a number: " +sum);

    }

}
