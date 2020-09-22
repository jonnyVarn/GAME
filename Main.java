package com.company;


public class Main {

    String characterName;
    String weaponName;
    int weaponDamage;
    int hp;
    static int hammerMaximumDamage = 50;
    static int hammerMinimumDamage = 10;

    static int hammer = (int) (Math.random() * ((hammerMaximumDamage - hammerMinimumDamage) + 1)) + hammerMinimumDamage;
    static int magicWandMaximumDamage = 100;
    static int magicWandMinimumDamage = 0;
    static int magicWand = (int) (Math.random() * (magicWandMaximumDamage - magicWandMinimumDamage));

    public Main(String charName, int wDamage, int health, String wName) {
        characterName = charName;
        weaponName = wName;
        weaponDamage = wDamage;
        hp = health;
    }

    public void beingAttacked(String defenderName, String attackerName, int attackerWeaponDamage, String attackerWeaponName) {
        if (hp <= 0 || attackerWeaponName == "Excalibur") {
            System.err.println("YOU CANNOT ATTACK");
        } else {
            /* System.err.println("WILD " + attackerName + " APPEARS!"); */
            System.out.println(attackerName + " STRIKES " + defenderName + " WITH A " + attackerWeaponName + " IT DOES " + attackerWeaponDamage + " DAMAGE");
            hp = (hp - attackerWeaponDamage);
            System.out.println(defenderName + " HAS " + hp + " REMAINING HEALTH! ");
            if (hp <=0) { System.out.println(defenderName + " died");}
        }
    }

    public static void searchWeapon(String weaponName) {
        // start of crap code*/
        String weaponHolder ="none";
        String goodGuy = "Hammer";
        String drWho = "SonicScrewdriver";
        String evilGuy = "Magic Wand";
        String Jonny = "keyboard";
        if (weaponName.equals(goodGuy)) {weaponHolder = "goodGuy";}
        if (weaponName.equals(drWho)) {weaponHolder = "drWho";}
        if (weaponName.equals(evilGuy)) {weaponHolder = "evilGuy";}
        if (weaponName.equals(Jonny)) {weaponHolder = "Jonny";}
        //end of crap code

        switch (weaponName) {
            case "Hammer":
                System.out.println("You searched for Hammer. The hammer is held by " + weaponHolder);
                break;
            case "Magic Wand":
                System.out.println("You searched for MagicWand. The MagicWand is held by " + weaponHolder);
                //weaponName ="You searched for ";
                break;
            case "SonicScrewdriver":
                System.out.println("You searched for SonicScrewdriver. The SonicScrewdriver is held by " + weaponHolder);

                break;
            case "Excalibur":
                System.out.println("You searched for Excalibur. The Excalibur is held by " + weaponHolder);

                break;
            case "keyboard":
                System.out.println("You searched for keyboard. The keyboard is held by " + weaponHolder);
                break;

            default:
                System.out.println("The weapon " +"\"" + weaponName + "\""  +" you searched for is not in our database or held by any characters please search again!!");
                break;
        }
    }

    //--------------------change weapon2-----------------------------------
    public void changeWeapon2(String characterName, String wName) {
        weaponName = "Excalibur";
        System.out.println(characterName + " has changed weapon to " + weaponName);

    } //-------------change weapon2-----------------------------

    public void drinkingHealingPotion() {
        int healingPotion = 20;
        hp = hp + healingPotion;
        System.out.println(characterName + " GAINED " + healingPotion + " HEALTH BY DRINKING A HEALING POTION");
        System.out.println(characterName + " NOW HAS A HEALTH OF " + hp);

    }



    public static void main(String[] args) {
        Main goodGuy = new Main("The Beast", hammer, 100, "Hammer");
        Main evilGuy = new Main("Ja'far", magicWand, 80, "Magic Wand");
        Main drWho = new Main("drWho",999, 999, "SonicScrewdriver");
        Main Jonny = new Main("Jonny", 10, 20, "keyboard" );

        goodGuy.beingAttacked(goodGuy.characterName, evilGuy.characterName, evilGuy.weaponDamage, evilGuy.weaponName);
        evilGuy.beingAttacked(evilGuy.characterName, goodGuy.characterName, goodGuy.weaponDamage, goodGuy.weaponName );
        goodGuy.drinkingHealingPotion();
        evilGuy.drinkingHealingPotion();


        System.out.println("---------------------------------------------G--------------------");
        searchWeapon("SonicScrewdriver");
        searchWeapon("Hammer");
        searchWeapon("Magic Wand");
        searchWeapon("keyboard");
        searchWeapon("Cisco 2851");
        System.out.println("--------------------------------------------G---------------------" + "\n");
        System.out.println("--------------------------------------------VG---------------------");
        Jonny.changeWeapon2("Jonny", "excalibur" );
        System.out.println("Valfri karaktär har nu bytt vapen till " + Jonny.weaponName + "!" + "  <---------VG?");
        System.out.println("--------------------------------------------VG---------------------");
        Jonny.beingAttacked(Jonny.characterName, evilGuy.characterName, evilGuy.weaponDamage, evilGuy.weaponName);


        //-----------------------------------------------------------------------------------


    }
}
