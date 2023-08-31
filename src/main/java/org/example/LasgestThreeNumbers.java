package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LasgestThreeNumbers {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Enter Third Number");
        int c = sc.nextInt();

        //1 Logic
        /*if(a>b && a>c){
            System.out.println("Largest number is " +a);
        }
        else if(b>a && b>c){
            System.out.println("Lasgest number is " +b);
        }
        else{
            System.out.println("Largest number is " +c);
        }*/


        //2) Using Ternary operator
        //max = (n1>n2) ? n1:n2;
        int largest = 0;

        //largest of a & b
        largest = (a>b)?a:b;

        //largest2
        int largest2 = (largest>c?largest:c);

        System.out.println("Lasgest number is "+largest2);


    }
}
