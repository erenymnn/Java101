package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        // Kullanıcıdan tablo boyutunu al
        while (true) {
            System.out.print("Satir sayisini giriniz (min 2): ");
            row = scanner.nextInt();
            System.out.print("Sutun sayisini giriniz (min 2): ");
            col = scanner.nextInt();

            if (row >= 2 && col >= 2) {
                break;
            } else {
                System.out.println("Matris boyutu en az 2x2 olmali, tekrar deneyin.");
            }
        }

        // MineSweeper nesnesi oluştur
        MineSweeper game = new MineSweeper(row, col);
        game.run();
    }

    }
