package org.example;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen harmonik hesaplama yaptirmak istediginiz sayiyi giriniz = ");
        int a = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + (double) 1 / i;
        }

        System.out.println(sum);


    }
}