package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.println("Birinci Kenari Giriniz : ");
        int kenar1 = tara.nextInt();
        System.out.println("Ikinci Kenari Giriniz : ");
        int kenar2 = tara.nextInt();

        int hipotenüs=(kenar1*kenar1+kenar2*kenar2);

        System.out.println("Kenarlari = "+kenar1+" a "+kenar1+" olan ucgenlerin dik kenar uzunlugu(Hipotenusu) = "+hipotenüs);


    }
}