package org.example;

public class DuplicateElementsArray {

    public static void main(String[] args) {

        String arr[] = {"jav", "C", "C++", "Python", "java", "Cx"};
        boolean flag = false;

        for (int i=0; i<=arr.length-1; i++){

            for(int j=i+1; j<=arr.length-1; j++ ){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    flag = true;
                }
            }
        }

        if(flag == false){
            System.out.println("Duplicate Element not Found");
        }





    }
}
