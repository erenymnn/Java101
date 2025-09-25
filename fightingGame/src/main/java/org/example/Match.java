package org.example;

import java.sql.SQLOutput;

public class Match {
    Fighter fighter1;
    Fighter fighter2;

    int minWeight;
    int maxWeight;

    Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            while (this.fighter1.health > 0 && this.fighter2.health > 0) {
                System.out.println("=======YENI ROUND=======");
                this.fighter2.health = this.fighter1.hit(fighter2);
                if (isWin()) {
                    break;
                }

                this.fighter1.health = this.fighter2.hit(fighter1);
                if (isWin()) {
                    break;
                }
                System.out.println(this.fighter1.name  +"Saglik :"+this.fighter1.health);
                System.out.println(this.fighter2.name  +"Saglik :"+this.fighter2.health);

            }
        } else {
            System.out.println("Sporcularin sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.fighter1.weight >= minWeight && this.fighter1.weight <= maxWeight) && (this.fighter2.weight >= minWeight && this.fighter2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.fighter1.health == 0) {
            System.out.println("Kazanan kisi : " + fighter2.name);
            return true;
        }
        if (this.fighter2.health == 0) {
            System.out.println("Kazanan kisi : " + fighter1.name);
            return true;
        }
        return false;
    }
}



