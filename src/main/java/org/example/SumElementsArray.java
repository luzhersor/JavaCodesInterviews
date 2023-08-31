package org.example;

public class SumElementsArray {

    public static void main(String[] args) {

        int a[] = {5,2,7}; //This is just an array of primitive data in

        int sum = 0;

        for(int i=0; i<a.length-1;i++){
            sum = sum +a[i];
        }

        System.out.println("Sum of Array"+ sum);
    }
}
