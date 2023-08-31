package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SecondHighestNumber {

    public static void main(String[] args) {

        //1) if there's no repeated elements

        /*int a[] = {20,12,15,16};
        int len = a.length;

        Arrays.sort(a);

        //To print a whole array, we have use loops
        for(int i=0; i<=len-1; i++){
            System.out.println(a[i]);
        }

        System.out.println(a[len-2]);*/

        //2) With repeated elements, unsorted array

        //array primitive data
        int num[] = {1,9,5,55,55,40,8};

        int len = num.length;

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int i=0; i<=len-1; i++){
            if (num[i]>highest){
                secondHighest = highest;
                highest = num[i];
            }

            if(num[i]<highest && num[i]>secondHighest) {
                secondHighest = num[i];
            }

        }

        System.out.println("Second highest is " + secondHighest);






    }


}
