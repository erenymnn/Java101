package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        System.out.print("Fibonacci dizisi için bir sayı giriniz: ");
        int a = tara.nextInt();

        int n1 = 0, n2 = 1;

        System.out.println("Fibonacci Dizisi:");
        for (int i = 0; i < a; i++) {
            System.out.print(n1 + " "); // mevcut sayıyı yazdır

            int toplam = n1 + n2; // yeni sayı = önceki iki sayı
            n1 = n2;              // n1 güncelle 2.sayıyı 1. yapıyor
            n2 = toplam;          // n2 güncelle n2 yi yeni sayı + eski sayıya eşitliyor
        }
    }
}