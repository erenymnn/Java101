package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasindaki asal sayİlar : ");

        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asalSayi = true;

            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asalSayi = false;
                    break;
                }
            }
            if (asalSayi) {
                System.out.print(sayi + " ");
            }
        }
    }
}