package org.example;


public class Main {
    public static void main(String[] args) {
//ilk başta hep f1 vuruyor bunu %50 %50 ayarla şansa biri vursun ilk 
 Fighter f1=new Fighter("A",10,120,100,60);
 Fighter f2=new Fighter("B",20,85,85,40); // kaçış demek

 Match match = new Match(f1,f2,85,100);
 match.run();

    }
}