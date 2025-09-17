package org.example;


import java.util.Scanner;

public class Main {
    static void isPrime(int number) {

        if (number == 2) {
            System.out.println("Bu bir asal sayidir : " + number);
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Bu bir asal sayi degildir : " + number);
                    break;
                } else {
                    System.out.println("Bu bir asal sayidir : " + number);
                    return;
                }
            }
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz : ");
        int number = scan.nextInt();

        isPrime(number);




    }
}