package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        int distanceKm = sc.nextInt();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter trip type (1 => One Way, 2 => Round Trip): ");
        int tripType = sc.nextInt();

        // Validate input
        if (distanceKm <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Invalid Input!");
            return;
        }

        double normalPrice = distanceKm * 0.10;
        double discountedPrice = normalPrice;

        // Age-based discounts
        if (age < 12) {
            discountedPrice -= normalPrice * 0.5; // 50% discount for children
        } else if (age <= 24) {
            discountedPrice -= normalPrice * 0.1; // 10% discount for youth
        } else if (age > 65) {
            discountedPrice -= normalPrice * 0.3; // 30% discount for seniors
        }

        // Round trip discount
        if (tripType == 2) {
            double roundTripDiscount = discountedPrice * 0.2; // 20% discount for round trip
            discountedPrice = (discountedPrice - roundTripDiscount) * 2; // multiply by 2 for round trip
        }

        System.out.println("Total Price = " + discountedPrice + " TL");
    }
}