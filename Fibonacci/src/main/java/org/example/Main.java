package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        System.out.print("Fibonacci dizisi için bir sayı giriniz: ");
        int a = tara.nextInt();

        int k1 = 0, k2 = 1;

        System.out.println("Fibonacci Dizisi:");
        for (int i = 0; i < a; i++) {
            System.out.print(k1 + " "); // mevcut sayıyı yazdır

            int toplam = k1 + k2; // yeni sayı = önceki iki sayı
            k1 = k2;              // n1 güncelle 2.sayıyı 1. yapıyor
            k2 = toplam;          // n2 güncelle n2 yi yeni sayı + eski sayıya eşitliyor
        }
    }
}