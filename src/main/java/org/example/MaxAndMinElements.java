package org.example;

public class MaxAndMinElements {

    public static void main(String[] args) {

        int a[] = {50,100,40,20,200};

        int max = a[0];
        int minimum = a[1];

        for (int i=0; i<=a.length-1; i++){
            if (a[i]>max){
                max = a[i];
            }

            if (a[i]<minimum){
                minimum = a[i];
            }

        }

        System.out.println(max);
        System.out.println(minimum);
    }

}
