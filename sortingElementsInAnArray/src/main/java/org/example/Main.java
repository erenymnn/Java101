package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Dizini boyutunu giriniz : ");
        int[] arr = new int[input.nextInt()];
        System.out.println(arr.length);
        System.out.println("Dizinin elemanlarini giriniz : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". Elemani:");
            arr[i] = input.nextInt();
        }
        input.close();

        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[minIndex]){
                   minIndex=j;
               }
           }
           int temp=arr[i];
           arr[i]=arr[minIndex];
           arr[minIndex]=temp;

            System.out.println(Arrays.toString(arr));


        }

        System.out.println("Siralama: " + Arrays.toString(arr));


    }
}