package org.example;



public class Main {
    public static void main(String[] args) {

        int [] list={3,5,15,24,30,4,8,17};

        int max=list[0];
        int min=list[0];

        for(int i=0;i<list.length;i++){
            if(list[i]>max){
                max=list[i];
            }
            else if(list[i]<min){
                min=list[i];
            }
        }

        System.out.println("Max deger : "+max);
        System.out.println("Min deger : "+min);



    }
}