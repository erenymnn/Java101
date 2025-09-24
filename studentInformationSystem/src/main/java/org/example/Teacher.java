package org.example;

public class Teacher {
    String name;
    String mpNo;
    String branch;

    Teacher(String name, String telNo, String branch) {
        this.name = name;
        this.mpNo = telNo;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adi : "+this.name);
        System.out.println("Telefonu : "+this.mpNo);
        System.out.println("Bolumu : " +this.branch);
    }


}
