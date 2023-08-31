package org.example;

public class SwappingNumbers {
    public static void main(String[] args) {

        int a=10, b=20;
        System.out.println("Before the values are.." +a+" "+b);

        //Logic Third variable
        int t=a;
        a=b;
        b=t;

        System.out.println("The new the values are.." +a+" "+b);

    }
}
