package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //     Take the VAT amount as 18%.
        System.out.println("Lutfen Para degerini giriniz: ");

        double kdvsizFiyat= sc.nextInt();
        double kdvliFiyat=(double)(((kdvsizFiyat*18)/100)+kdvsizFiyat);
        double kdvTutari=(kdvliFiyat-kdvsizFiyat);

        System.out.println("KDV'siz fiyat = "+kdvsizFiyat+"KDV'li fiyat = "+kdvliFiyat+"KDVTutari = "+kdvTutari);

    }
}