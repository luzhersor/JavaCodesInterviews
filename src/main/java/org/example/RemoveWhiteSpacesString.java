package org.example;

public class RemoveWhiteSpacesString {

    public static void main(String[] args) {

        String str="Java programming object oriented";
        System.out.println(str);

        str = str.replaceAll("\\s", "");
        System.out.println("After moving the white spaces"+str);
    }
}
