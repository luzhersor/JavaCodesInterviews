package org.example;

import java.util.ArrayList;

public class JavaRobustLanguage {

    public static void main(String[] args) {
        /* Given a sample string "Java is
         a very robust language", write a
         Java 8 program to find all the
         non-repeated characters in it? */

        String str = "Java is a very robust language";
        //First I have to count the ocurrences of every character
        char[] eachWord = str.toCharArray();

        ArrayList<String> letters = new ArrayList<String>();
        ArrayList<Integer> ocurrences = new ArrayList<Integer>();

        for(int i=0; i<=str.length()-1; i++){
            System.out.println(eachWord[i]);

            if(letters.contains(String.valueOf(eachWord[i]))){
                ocurrences.set(letters.indexOf(String.valueOf(eachWord[i])),
                        ocurrences.get(letters.indexOf(String.valueOf(eachWord[i])))+1);


            } else {
                letters.add(String.valueOf(eachWord[i]));
                ocurrences.add(1);  //Add to the last of the list
            }

            System.out.println(ocurrences);
        }




    }
}
