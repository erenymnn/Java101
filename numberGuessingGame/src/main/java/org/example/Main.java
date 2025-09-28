package org.example;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Random rand = new Random();
        int number = rand.nextInt(100);
        buda başka yoldur.

 */
        int number = (int) (Math.random() * 100);
        System.out.println(number);

        Scanner input = new Scanner(System.in);

        int right = 0; //hakkımız
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;


        while (right < 5) {
            System.out.println("Lutfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lutfen 0-100 arasinda bir deger giriniz.");
                if (!isWrong){
                    isWrong = true;
                    System.out.println("Bir daha hatali girisinizde hakkinizdan dusulecektir.");
                }else {
                    right++;
                    System.out.println("Cok Fazla Hatali giris yaptiniz. Kalan hakkiniz = "+(5-right));
                }





                continue; // bir sonraki adımı atlar yanlış girerse eger.
            }


            if (selected == number) {
                System.out.println("Tebrikler Dogru Tahmin ! Tahmin ettiginiz sayi = " + number);
                wrong[right] = selected;
                isWin = true;
                break;

            } else {

                System.out.println("Hatali bir sayi girdiniz ! ");

                if (selected > number) {
                    System.out.println(selected + " sayisi gizli sayidan buyuktur.");
                } else {
                    System.out.println(selected + " sayisi gizli sayidan kucuktur.");
                }
                wrong[right] = selected;
                right++;
                System.out.println("Kalan hakkiniz : " + (5 - right));
            }

        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
        }
        if (isWin) {
            System.out.println("Kazandiniz ! ");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));

        }

    }
}