package org.example;

import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {3, 165, 23, 53, 74, 165, 23, 75, 23, 578};
        int[] duplicate = new int[list.length];
        int starIndex = 0;

        for (int i = 0; i < list.length; i++) {

            int count = 0;

            // Bu sayının dizide kaç kez geçtiğini say
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
            }

            // Eğer 1'den fazla geçiyorsa (yani tekrar ediyorsa)
            // ve daha önce duplicate dizisine eklenmemişse → ekle
            if (count > 1 && !isFind(duplicate, list[i])) {
                duplicate[starIndex++] = list[i];
                System.out.println(list[i] + " sayisi " + count + " kez tekrar edildi");
            }
        }

        System.out.print("Tekrar eden sayilar: ");
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}
