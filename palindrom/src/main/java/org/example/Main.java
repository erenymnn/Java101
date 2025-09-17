package org.example;


public class Main {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
      //      System.out.println("***********************************");
      //      System.out.println("Number : " + temp);
            lastNumber = temp % 10; // last number
     //       System.out.println("Last Number : " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
   //         System.out.println("New number : " + reverseNumber);
            temp /= 10;
        }

        if (number == reverseNumber)
            return true;

         else
            return false;


    }


    public static void main(String[] args) {
        System.out.println(isPalindrom(9091));


    }
}