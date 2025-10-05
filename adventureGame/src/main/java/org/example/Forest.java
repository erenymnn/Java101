package org.example;

public class Forest extends BattleLoc{
    public Forest(Player player) { //award yemek obstacle canavar
        super(player,"Orman",new Vampire(),"firewood",3);
    }
}
