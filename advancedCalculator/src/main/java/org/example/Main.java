package org.example;


import java.util.Scanner;

public class Main {

    static int sum(int a,int b){ return a+b; }
    static int minus(int a, int b){ return a-b; }
    static int times(int a, int b){ return a*b; }
    static double divided(int a, int b){
        if (b == 0) {
            System.out.println("0'a bolme hatasi!");
            return -1;
        }
        return (double) a / b;
    }
    static int power(int a, int b){
        int result=1;
        for (int i=0; i<b; i++) result *= a;
        return result;
    }
    static int mod(int a,int b){ return a%b; }
    static void calc(int a, int b){
        int cevre=2*(a+b);
        int alan=a*b;
        System.out.println("Cevre: " + cevre + " Alan: " + alan);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int select;

        String menu="""
            1- Toplama Islemi
            2- Cikarma Islemi
            3- Carpma Islemi
            4- Bolme Islemi
            5- Uslu Sayi Hesaplama
            6- Mod Alma
            7- Dikdortgen Alan ve Cevre Hesaplama
            0- Cikis Yap
            """;

        do {
            System.out.println(menu);
            System.out.print("Bir islem seciniz : ");
            select=sc.nextInt();

            if (select==0) {
                System.out.println("Cikis yapiliyor...");
                break;
            } else if (select<1 || select>7) {
                System.out.println("Hatali sayi girdiniz!");
                continue;
            }

            System.out.print("Birinci sayiyi giriniz : ");
            int a=sc.nextInt();
            System.out.print("Ikinci sayiyi giriniz : ");
            int b=sc.nextInt();

            switch (select) {
                case 1 -> System.out.println("Toplam: " + sum(a,b));
                case 2 -> System.out.println("Cikarma: " + minus(a,b));
                case 3 -> System.out.println("Carpma: " + times(a,b));
                case 4 -> System.out.println("Bolme: " + divided(a,b));
                case 5 -> System.out.println("UsluSayi: " + power(a,b));
                case 6 -> System.out.println("Mod: " + mod(a,b));
                case 7 -> calc(a,b);
            }
        } while (true);
    }


}