package org.example;


public class Main {
    public static void main(String[] args) {


        Teacher t1 = new Teacher("Eren Hoca", "555", "TRH");
        Teacher t2 = new Teacher("Sevda Hoca", "001", "FZK");
        Teacher t3 = new Teacher("Sevil Hoca", "666", "KMY");


        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course kimya = new Course("Kimya", "103", "KMY");
        kimya.addTeacher(t3);
        // EĞER prefix ve brench uyusmazsa ekrana cıktı verir uyusmadıgını.


        Student s1 = new Student("Inek Saban", "123", "4", tarih, fizik, kimya);
        s1.addBulkExamNote(100, 78, 50);
        s1.isPass();

        Student s2=new Student("Duduk Necmi","1234","4",tarih,fizik,kimya);
        s1.addBulkExamNote(75, 45, 43);
        s1.isPass();
    }
}