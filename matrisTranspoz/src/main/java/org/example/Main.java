package org.example;


public class Main {
    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] trp = new int[arr[0].length][arr.length];

        for (int i = 0; i < trp.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                trp[i][j] = arr[j][i];
            }
        }
        printMatrix("Matris: ", arr);
        printMatrix("Transpoze: ", trp);

    }

    static void printMatrix(String title, int[][] matris) {
        System.out.println(title);
        for (int[] row : matris) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }



    }
}