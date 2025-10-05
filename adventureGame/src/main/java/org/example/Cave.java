package org.example;

public class Cave extends BattleLoc{
    public Cave(Player player) { // playeri switch caselerde alıyoruz safeHouse
        super(player, "Magara", new Zombie(), "food",3);
    }
}
