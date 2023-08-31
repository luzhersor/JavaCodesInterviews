package org.example;

public class ReverseEachWord {

    public static void main(String[] args) {

        String str = "Welcome To Java";  //Original String

        String[] words = str.split("");  //Splitting string into words

        String reverseString = "";

        for(int i=0; i<=words.length-1; i++){
            System.out.println(words[i]);
        }

        for(String w:words){
            String reverseWord = "";

            for(int i=w.length()-1; i>=0; i--){
                reverseWord = reverseWord + w.charAt(i); //Welcome
            }

            reverseString = reverseString + reverseWord + " ";  //emocleW oT AVAJ

        }

        System.out.println(reverseString);



    }
}
