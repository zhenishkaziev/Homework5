package com.company;

public class Main {

    public static void main(String[] args) {
	Hero just = new Hero(200,35, "One shot kills");
	Hero young = new Hero(20, 170);
	Boss strong = new Boss();
     strong.setLife(300);
     strong.setDamage(42);
     strong.setAttackType("Lightning strike");
        System.out.println(strong.getLife() + " " + strong.getDamage() + " " + strong.getAttackType());

    }

}
