package org.example;

import java.util.Scanner;

public class Player {
    private int damage;
    private int healthy;
    private int orijinalHealthy;
    private int money;
    private String charName;
    private String name;
    private Scanner tara = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {


        GameChar[] charList = {new Samuray(), new Archer(), new Knight()};

        System.out.println("Karakterler");
        System.out.println("--------------------------------------------------------------------------");
        for (GameChar gameChar : charList) {
            System.out.println("ID : " + gameChar.getId() +
                    "\t\tKarakter : " + gameChar.getName() +
                    "\t\tHasar : " + gameChar.getDamage() +
                    "\t\tSaglik : " + gameChar.getHealth() +
                    "\t\tPara : " + gameChar.getMoney());
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Lutfen bir karakter ID'si seciniz !");
        int selectChar = tara.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samuray());
                break;
            case 2:
                initPlayer(new Archer());

                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samuray());
        }
     /*  System.out.println("Karakter : " + this.getCharName() +
                ", Hasar : " + getDamage() +
                ", Saglik : " + getHealthy() +
                ", Para : " + this.getMoney());

      */

    }


    public void initPlayer(GameChar gameChar) {
        this.setCharName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setHealthy(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
    }

    public void printInfo(){
        System.out.println("Silahiniz : "+this.getInventory().getWeapon().getName()+
                " Zirhiniz : "+this.getInventory().getArmor().getName()+
                ", Bloklama : " + this.getInventory().getArmor().getBlock()+
                ", Hasar : " + this.getTotalDamage() +
                ", Saglik : " + this.getHealthy() +
                ", Para : " + this.getMoney());


    }
public int getTotalDamage(){
    return damage + this.inventory.getWeapon().getDamage();
}
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Weapon getWeapon(){ // kısaltmak icin cagırırken
        return this.getInventory().getWeapon();
    }
    public Armor getArmor(){
        return this.getInventory().getArmor();
    }
    public int getBlock(){
        return this.getInventory().getArmor().getBlock();
    }
}
