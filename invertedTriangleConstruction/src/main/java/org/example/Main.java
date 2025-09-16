package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of levels: ");
        int levels = sc.nextInt();

        // Drawing inverted triangle
        for (int i = levels; i >= 1; i--) {          // Rows
            for (int j = 1; j <= (2 * i - 1); j++) { // Stars per row
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }


    }
