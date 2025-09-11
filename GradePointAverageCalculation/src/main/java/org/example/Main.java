package org.example;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        int matNot=tara.nextInt();
        System.out.println("Fizik notunuzu giriniz : ");
        int fizNot=tara.nextInt();
        System.out.println("Kimya notunuzu giriniz : ");
        int kimyaNot=tara.nextInt();
        System.out.println("Turkce notunuzu giriniz : ");
        int turkceNot=tara.nextInt();
        System.out.println("Tarih notunuzu giriniz : ");
        int tarihNot=tara.nextInt();
        System.out.println("Muzik notunuzu giriniz : ");
        int muzikNot=tara.nextInt();

        double toplam=0;
        toplam=((double) (matNot + fizNot + kimyaNot + turkceNot + tarihNot + muzikNot) /6.0);
        System.out.println("Tum derslerin ortalamasi = "+toplam);


    }


}
