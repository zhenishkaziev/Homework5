package com.company;

public class Boss {
    private int life;
    private int damage;
    private String attackType;

    public int getLife() {
        return life;
    }

    public int getDamage() {
        return damage;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }
}
