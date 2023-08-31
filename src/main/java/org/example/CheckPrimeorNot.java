package org.example;

public class CheckPrimeorNot {

    public static void main(String[] args) {

        int num=3;
        int count=0;

        if(num>1)
        {
            for(int i=1; i<=num; i++){
                if(num%i==0)
                    count++;
            }
            if(count==2){
                System.out.println("It's prime number");
            } else {
                System.out.println("It's not a prime number");
            }
        }


        /*
        if(num/num == 1 && num%1 == 0){
            System.out.println("Prime number");
        }*/
    }
}
