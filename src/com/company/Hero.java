package com.company;

public class Hero {
    private  int health;
    private int take;
    private String superPower;

    public int getHealth() {
        return health;
    }

    public int getTake() {
        return take;
    }

    public String getSuperpower() {
        return superPower;
    }

    public Hero(int health, int take, String superPower){
        this.health = health;
         this.take = take;
         this.superPower = superPower;

    }
     public Hero (int take, int health){
        this.take = take;
        this.health = health;
     }

}
