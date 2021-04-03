package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
             createHeroes();
            for (Hero var : createHeroes()  ) {
                System.out.println("Здоровье героев " + " " + var.getHealth() + " AttackType " + " " + var.getSuperpower() + " Damage " + " " + var.getTake());
            }
            Hero just = new Hero(200, 35, "One shot kills");
            Hero young = new Hero(20, 170);
            Boss strong = new Boss();
            strong.setLife(300);
            strong.setDamage(42);
            strong.setAttackType("Lightning strike");
            System.out.println(strong.getLife() + " " + strong.getDamage() + " " + strong.getAttackType());
        }
        public static Hero[] createHeroes () {
            Hero you = new Hero(200, 35, "Lava from the ground");
            Hero ttrew = new Hero(20, 140," Teleportation" );
            Hero kill = new Hero(170, 42, "Assassin mode");

            Hero[] lol = new Hero[3];
            lol[0] = you;
            lol[1] = ttrew;
            lol[2] = kill;
            return lol;
            }
        }

