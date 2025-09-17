package org.example;


public class Main {
    public static double f(double base, int exp) {
        double sonuc = 1;

        if (exp >= 0) {
            for (int i = 0; i < exp; i++) {
                sonuc *= base;
            }
        } else { // negatif üs için
            for (int i = 0; i < -exp; i++) {
                sonuc *= base;
            }
            sonuc = 1 / sonuc;
        }

        return sonuc;
    }
    public static void main(String[] args) {

        System.out.println("Hesaplama sonucu : "+f(5,3));


    }
}