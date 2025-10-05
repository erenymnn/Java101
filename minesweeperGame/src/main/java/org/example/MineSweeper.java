package org.example;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    String [][] board; //mayınların tutuldugu harita
    String [][] gameBoard; //oyuncuya gosterilecek harita
    int row,col;
    int mineCount;

    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.board=new String[row][col];
        this.gameBoard=new String[row][col];
        this.mineCount = (row*col)/4;
    }
    public void run() {
        System.out.println("Mayin Tarlasi Oyuna Hosgeldiniz !");
        initializeBoards();
        placeMines();

        int safeCells = row * col - mineCount; // Açılması gereken güvenli hücre sayısı
        int openedCells = 0;
        boolean gameOver = false;

        while (!gameOver) {
            printBoard(gameBoard);
            int[] coords = getUserInput();
            int r = coords[0];
            int c = coords[1];

            // 💣 Mayın kontrolü
            if (board[r][c].equals("*")) {
                System.out.println("Game Over!!");
                gameOver = true;
            } else {
                int mineCountAround = countAdjacentMines(r, c);
                gameBoard[r][c] = String.valueOf(mineCountAround);
                openedCells++;

                // 🏆 Kazanma kontrolü
                if (openedCells == safeCells) {
                    System.out.println("Oyunu Kazandiniz !");
                    printBoard(gameBoard);
                    gameOver = true;
                }
            }
        }
    }

    private void initializeBoards() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = "-";
                gameBoard[i][j] = "-";
            }
        }
    }
    // Oyuncuya gösterilen tabloyu ekrana yazdırmak için
    private void printBoard(String[][] arr) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void placeMines() {
        int placedMines = 0;

        while (placedMines < mineCount) {
            int randRow = rand.nextInt(row);
            int randCol = rand.nextInt(col);

            // Eğer bu hücreye daha önce mayın yerleştirilmediyse
            if (!board[randRow][randCol].equals("*")) {
                board[randRow][randCol] = "*";
                placedMines++;
            }
        }
    }

    private int[] getUserInput() {
        int r, c;

        while (true) {
            System.out.print("Satir Giriniz : ");
            r = input.nextInt();
            System.out.print("Sutun Giriniz : ");
            c = input.nextInt();

            // Sınır kontrolü
            if (r < 0 || r >= row || c < 0 || c >= col) {
                System.out.println("Gecersiz koordinat, lutfen tekrar deneyin.");
                continue;
            }

            // Daha önce seçilmiş mi kontrolü
            if (!gameBoard[r][c].equals("-")) {
                System.out.println("Bu koordinat daha once secildi, baska bir koordinat girin.");
                continue;
            }

            break;
        }

        return new int[]{r, c};
    }

    private int countAdjacentMines(int r, int c) {
        int count = 0;

        // Komşu yönleri temsil eden koordinatlar
        int[] dRow = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dCol = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int newRow = r + dRow[i];
            int newCol = c + dCol[i];

            // Komşu hücre tablo sınırları içindeyse
            if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < col) {
                if (board[newRow][newCol].equals("*")) {
                    count++;
                }
            }
        }

        return count;
    }

}
