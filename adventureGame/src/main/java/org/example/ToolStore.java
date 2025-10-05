package org.example;


import static org.example.Armor.getArmorObjById;
import static org.example.Weapon.getWeaponObjById;

public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player, "Magaza");
    }

    boolean showMenu = true;

    @Override
    public boolean onLocation() {
        while (showMenu) {
            System.out.println("----- Magazaya Hosgeldiniz ! -----");
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zirhlar");
            System.out.println("3 - Cikis Yap");
            System.out.print("Seciminiz : ");
            int selectCase = input.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Gecersiz Deger, tekrar giriniz : ");
                selectCase = input.nextInt();
            }
            switch (selectCase) {
                case 1:
                    //weapon listelendi
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    //armor listelendi
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz !");
                    showMenu = false;
                    break;

            }
        }
        return true;

    }

    public void printWeapon() {
        System.out.println("------ Silahlar ------");
        System.out.println();
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "-" + w.getName() +
                    " <Para : " + w.getPrice() +
                    " , Hasar : " + w.getDamage());

        }
        System.out.println("0 - Cikis Yap");


    }

    public void buyWeapon() {
        System.out.println("Bir silah seciniz : ");
        int selectWeaponId = input.nextInt();
        while (selectWeaponId < 0 || selectWeaponId > Weapon.weapons().length) {
            System.out.println("Gecersiz Deger, tekrar giriniz : ");
            selectWeaponId = input.nextInt();
        }

        if (selectWeaponId != 0) { // 0 dan farklıysa
            Weapon selectedWeapon = getWeaponObjById(selectWeaponId);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paraniz bulunmamaktadir !");
                } else {
                    //Satin almanin gerceklestigi alan
                    System.out.println(selectedWeapon.getName() + " silahini satin aldiniz !");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan bakiyeniz : " + this.getPlayer().getMoney());
                    System.out.println("Onceki Silahiniz : " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni Silahiniz : " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }

        }
    }


    public void printArmor() {
        System.out.println("------ Zirhlar ------");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + "-" + a.getName() +
                    " , <Para : " + a.getPrice() +
                    " Zirh : " + a.getBlock() + " >");
        }
        System.out.println("0 - Cikis Yap");
    }

    public void buyArmor() {
        System.out.println("Bir zirh seciniz : ");
        int selectArmorId = input.nextInt();
        while (selectArmorId < 0 || selectArmorId > Armor.armors().length) {
            System.out.println("Gecersiz Deger, tekrar giriniz : ");
            selectArmorId = input.nextInt();
        }
        if (selectArmorId!= 0) {
            Armor selectedArmor = getArmorObjById(selectArmorId);

            if (selectedArmor != null) { // değer bulunduysa
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paraniz bulunmamaktadir !");
                } else {
                    //Satin almanin gerceklestigi alan
                    System.out.println(selectedArmor.getName() + " zirhi satin aldiniz !");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance); //bakiye güncelleme
                    System.out.println("Kalan bakiyeniz : " + this.getPlayer().getMoney());
                    System.out.println("Onceki Zirhiniz : " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Yeni Zirhiniz : " + this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }


    }

}
