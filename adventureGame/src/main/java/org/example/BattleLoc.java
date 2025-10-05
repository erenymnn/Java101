package org.example;

import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;


    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;

    }

    @Override
    public boolean onLocation() {
        int obsNum = this.randomObstacleNumber();
        System.out.println("Suan buradasiniz : " + this.getName());
        System.out.println("Dikkatli Ol ! Burada " + obsNum + " tane " + this.getObstacle().getName() + " Yasiyor !");
        System.out.println("<S>avas veya <K>ac");
        String selectCase = input.nextLine().toUpperCase();
        // eger kucuk girerse harfi büyüge ceviriyor
        if (selectCase.equals("S") && combat(obsNum)) {
             {
                System.out.println(this.getName() + " tum dusmanlari yendiniz !");
                return true;
            }
        }
        if(this.getPlayer().getHealthy()<=0) {
            System.out.println("Oldunuz...!");
            return false;
        }

        return true;
    }

    public boolean combat(int obsNumber) {//savasma islemleri kaç canavarla catışacaksam onu donduruyor
        for (int i = 1; i <= obsNumber; i++) { // birden fazla canavar olunca bu mantıklı oluyor alttaki .
            this.getObstacle().setHealth(this.getObstacle().getOrijinalHealth()); //canavarımın her zaman başlangıctaki canını degistiriyorum olunce
            playerStats();
            obstacleStats(i);
            while ((this.getPlayer().getHealthy() > 0) && (this.getObstacle().getHealth() > 0)) {
                System.out.println("<V>ur veya <K>ac : ");
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("V")) {
                    System.out.println("Siz vurdunuz !");
                    this.getObstacle().setHealth(this.obstacle.getHealth() - getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0) {
                        System.out.println();
                        System.out.println("Canavar Size vurdu !");
                        int obstacleDamege = this.obstacle.getDamage() - this.getPlayer().getInventory().getArmor().getBlock();//ornek canav hsr 3 blogum 5 - cıkmasın diye yapıyoruz alttakini
                        if (obstacleDamege < 0) { // damage - olamaz
                            obstacleDamege = 0;
                        }
                        this.getPlayer().setHealthy(this.getPlayer().getHealthy() - obstacleDamege);
                        afterHit();
                    }
                }else return false;

            }

             if(this.getObstacle().getHealth()<this.getPlayer().getHealthy()){
                 System.out.println("Dusmani Yendiniz !");
                 System.out.println(this.getObstacle().getAward() + " para kazandiniz !");
                 this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                 System.out.println("Guncel Paraniz :" +this.getPlayer().getMoney() );
             }else return false;
        }
        return true;
    }

    public void afterHit() {
        System.out.println("Caniniz : " + this.getPlayer().getHealthy());
        System.out.println(this.getObstacle().getName() + " Cani : " + this.getObstacle().getHealth());
        System.out.println("----------------------------");
    }


    public void obstacleStats(int i) { // canavar icin degerleri
        System.out.println(i+". "+this.getObstacle().getName() + " Degerleri");
        System.out.println("---------------------------");
        System.out.println("Saglik : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Odul : " + this.getObstacle().getAward());
        System.out.println();

    }


    public void playerStats() { // oyuncu özellikleri hasarı saglıgı bilgileri
        System.out.println("Oyuncu Degerleri");
        System.out.println("---------------------------");
        System.out.println("Saglik : " + this.getPlayer().getHealthy());
        System.out.println("Silah : " + this.getPlayer().getWeapon().getName());
        System.out.println("Zirh : " + this.getPlayer().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getBlock());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println();


    }

    public int randomObstacleNumber() {
        Random rand = new Random();
        //getmaxobstacle  0,1 +1 => 1,2  eger getmaxobstacle 2 ise 0 ile 1 arası değer üretcegi için
        return rand.nextInt(this.getMaxObstacle()) + 1; // 0 ile 2 arası üretir +1 yaparsak 0 ile 3 arası olur 4 yapmama ise 0 olamaz.
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
