package org.example;

import org.w3c.dom.ls.LSOutput;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Soy Feliz";
        String rev = "";

        //1) Using + (string concatenation operator)

        /*for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);*/

        //2. Using character array

        /*char a[] =  str.toCharArray();

        for (int i=str.length()-1; i>=0;i--){
            rev = rev + a[i];
        }

        System.out.println(rev);*/


        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

    }



}
