package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;

public class Main {
    public String characterName;
    public String weaponName;
    //public String weaponOwner = "default";
    //public String superWeapon = "Excalibur";
    int weaponDamage;
    int hp;
    static int hammerMaximumDamage = 50;
    static int hammerMinimumDamage = 10;
    static int hammer = (int) (Math.random() * (hammerMaximumDamage - hammerMinimumDamage));
    static int magicWandMaximumDamage = 100;
    static int magicWandMinimumDamage = 0;
    static int magicWand = (int) (Math.random() * (magicWandMaximumDamage - magicWandMinimumDamage));
    static int SonicScrewdriver = 9999;
    static int SonicScrewdriverMinimumDamage = 99;
    static int SonicScrewdriverMaximumDamage = 9999;
    static int ExcaliburMinimumDamage = 99999999;
    static int ExcaliburMaximumDamage = 999999999;
    static int Excalibur = (int) (Math.random() * (hammerMaximumDamage - hammerMinimumDamage));
    static int keyboardMaximumDamage = 2;
    static int keyboardMinimumDamage = 1;
    static int keyboard = (int) (Math.random() * (hammerMaximumDamage - hammerMinimumDamage));
    public Main(String charName, int wDamage, int health, String wName) {
        characterName = charName;
        weaponName = wName;
        weaponDamage = wDamage;
        hp = health;
    }  //----------------------Main--------------------------------------

   //----------------beingAttacked--------------------------------------
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
} //-------------eof being attacked-----------------------------

    //---------------drinkingHealingPotion-------------------------
    public void drinkingHealingPotion() {
        int healingPotion = 20;
        hp = hp + healingPotion;
        System.out.println(characterName + " GAINED " + healingPotion + " HEALTH BY DRINKING A HEALING POTION");
        System.out.println(characterName + " NOW HAS A HEALTH OF " + hp);
    }
    //-----------------eof--drinkingHealingPotion-------------------

    //-------------------searchweapon-------------------------------------------

    /* Med hjälp av koden nedanför(det går även bra att använda sig utav det template vi skrev ihop på föreläsningen 23/9)
skall du skriva vidare på metoden searchWeapon.
Metoden tar in ett parameter argument som motsvarar vapnet man vill söka på.
Metoden skall använda sig utav det parameter argument som matas in och iterera igenom switch satsen.
finner metoden det vapen som har sökts på så skall den tala om vilken karaktär som bär på det sökta vapnet
ifall metoden inte finner en match så skall metoden tala om vilket vapen som söktes efter och ge oss ett meddelande om att det inte kunde finnas.
Notera att det är OK att hårdkoda hela stycket.

För betyget VG:
Skriv ytterligare en metod som utrustar valfri karaktär med vapnet "Excalibur". Se till att anropa denna metod på karaktären.
Det går bra att hårdkoda även här.*/

    // searchWeapon2

/*    public String searchWeapon2(String charName, String wName) {

        System.out.println("//-------start of searchweapon2--------------------------------------------------------------------------");

        System.out.println(characterName);
        System.out.println(weaponName + "\n");
        //System.out.println(hammer);
        //System.out.println(SonicScrewdriver);
        System.out.println("//-------eof searchweapon2-------------------------------------------------------------");

        System.out.println("//-----------------------------------------");
        System.out.println(weaponName);
        System.out.println("//-----------------------------------------");
        String goodGuy = "Hammer";
        String drWho = "SonicScrewdriver";
        String evilGuy = "MagicWand";
        String Jonny = "keyboard";
        if (weaponName.equals(hammer)) {charName = "goodGuy";}
        if (weaponName.equals(SonicScrewdriver)) {charName = "drWho";}
        if (weaponName.equals(magicWand)) {charName = "evilGuy";}
        if (weaponName.equals(keyboard)) {charName = "Jonny";}

        switch (wName) {
            case "Hammer":
                System.out.println("You searched for Hammer. The hammer is held by " + charName);
                wName = "The hammer is held by";
                break;
            case "MagicWand":
                System.out.println("You searched for MagicWand. The MagicWand is held by " + charName);
                wName = "You searched for ";
            case "SonicScrewdriver":
                System.out.println("You searched for SonicSrewdriver. The SonicScrewdriver is held by " + charName);
                wName = "bzz";
                break;
            case "Excalibur":
                System.out.println("You searched for Excalibur. The Excalibur is held by " + charName);
                wName = "katching";
                break;
            default:
                System.out.println("The weapon " + "\"" + wName + "\"" + " you searched for is not in our database or held by any characters please search again");
                //weaponName = "The weapon" weaponName  you searched for is not in our database please search again";
                break;
        }

        //wName = "breadknife";
        return wName;
    } */



    public static void searchWeapon(String weaponName, String characterName) {
        // start of crap code*/

        String goodGuy = "Hammer";
        String drWho = "SonicScrewdriver";
        String evilGuy = "Magic Wand";
        String Jonny = "keyboard";
        if (weaponName.equals(goodGuy)) {characterName = "goodGuy";}
        if (weaponName.equals(drWho)) {characterName = "drWho";}
        if (weaponName.equals(evilGuy)) {characterName = "evilGuy";}
        if (weaponName.equals(Jonny)) {characterName = "Jonny";}
        //end of crap code
        switch (weaponName) {
            case "Hammer":
                System.out.println("You searched for Hammer. The hammer is held by " + characterName);
                //weaponName = "The hammer is held by";
                break;
            case "Magic Wand":
                System.out.println("You searched for MagicWand. The MagicWand is held by " + characterName);
                //weaponName ="You searched for ";
            case "SonicScrewdriver":
                System.out.println("You searched for SonicScrewdriver. The SonicScrewdriver is held by " + characterName);
                //weaponName = "bzz";
                break;
            case "Excalibur":
                System.out.println("You searched for Excalibur. The Excalibur is held by " + characterName);
                //weaponName = "katching";
                break;
            case "keyboard":
                System.out.println("You searched for keyboard. The keyboard is held by " + characterName);
                break;

            default:
                System.out.println("The weapon " +"\"" + weaponName + "\""  +" you searched for is not in our database or held by any characters please search again");
            //weaponName = "The weapon" weaponName  you searched for is not in our database please search again";
                break;
        }
        String weapon = weaponName;
        //return weaponName;

      /*  switch (characterName) {
            case "goodGuy":
                System.out.println("You have searched for goodGuy");
                break;
            case "evilGuy":
                break;

            case "drWho":
                break;

            case "Jonny":
                break;
        }
       */

    }
    //--------------------eof weaponName




   /* public static String changeWeapon(String characterName, String weaponName) {
        String setWeapon=characterName + "." + weaponName;
        System.out.println(characterName);
        System.out.println(weaponName);
        if (!weaponName.equals(Excalibur)) { weaponName = "Excalibur";
            System.out.println(weaponName);}
        return setWeapon;
}  */
//--------------------change weapon2-----------------------------------
    public void changeWeapon2(String characterName, String wName) {
        weaponName = "Excalibur";
        System.out.println(characterName + " has changed weapon to " + weaponName);

    } //-------------change weapon2-----------------------------



    //---------------mainstuff------------------------
    public static void main(String[] args) {
        Main goodGuy = new Main("The Beast", hammer, 100, "Hammer");
        Main evilGuy = new Main("Ja'far", magicWand, 80, "Magic Wand");
        Main drWho = new Main("drWho",999, 999, "SonicScrewdriver");
        Main Jonny = new Main("Jonny", 10, 78, "keyboard" );
        //System.out.println(changeWeapon("Jonny", "sked"));

        System.out.println("-------------------------------------------------------------------");
        //Jonny.changeWeapon2("Jonny", "sked");
        //System.out.println("*************" +Jonny.weaponName);

        //System.out.println(evilGuy.searchWeapon("Magic Wand" + "", "drWho"));
        //System.out.println(evilGuy.weaponName);
        //-----------------------------------------------------------------------------------


        searchWeapon("SonicScrewdriver", "");
        searchWeapon("Hammer", "");
        searchWeapon("Magic Wand", "");
        searchWeapon("keyboard", "");
        searchWeapon("sked", "min mamma");
        Jonny.changeWeapon2("Jonny", "excalibur" );
        System.out.println("-------------------------------------------------------------------");


        //-----------------------------------------------------------------------------------

        /*public static weaponOwner(String weaponName) {
           goodGuy.weaponName = weaponName;

           if evilGuy.weaponName
            drWho.weaponName
            Jonny.weaponName

            switch (weaponName)
            case goodGuy.weaponName:
                System.out.println(goodGuy.weaponName);
                break;
            case evilGuy.weaponName:
                break;
            case drWho.weaponName:
                break;
            case Jonny.weaponName:
                break;
        }
*/


        //if (Jonny.hp >= 0) { System.out.println("Jonny died");}
        goodGuy.beingAttacked(goodGuy.characterName, evilGuy.characterName, evilGuy.weaponDamage, evilGuy.weaponName);
        evilGuy.beingAttacked(evilGuy.characterName, goodGuy.characterName, goodGuy.weaponDamage, goodGuy.weaponName );
        goodGuy.drinkingHealingPotion();
        evilGuy.drinkingHealingPotion();
        //Jonny.drinkingHealingPotion();
        //evilGuy.beingAttacked(evilGuy.characterName, Jonny.characterName, Jonny.weaponDamage, evilGuy.weaponName);
        Jonny.beingAttacked(Jonny.characterName, evilGuy.characterName, evilGuy.weaponDamage, evilGuy.weaponName);


        //Jonny.changeWeapon("Jonny", "Excalibur");


        //System.out.println(changeWeapon("Jonny", "Excalibur"));
        //System.out.println("//------------------------------------------------");
        //System.out.println(Jonny.weaponName);
        //System.out.println("//------------------------------------------------");

        //System.out.println();
        //System.out.println("//__________________________________________");
        //System.out.println("this is   regarding dr who");
        //System.out.println("THis prints the present weapon of the caracter");

        //System.out.println(drWho.weaponName);
        //System.out.println(drWho.searchWeapon("SonicScrewdriver", drWho.characterName ));


        //System.out.println("//__________________________________________");

        //System.out.println(goodGuy.searchWeapon(goodGuy.weaponName));
        //System.out.println(evilGuy.betaSearchWeapon(evilGuy.weaponName));
        //System.out.println(evilGuy.weaponName);
        //System.out.println(goodGuy.weaponName);
        //System.out.println(Jonny.weaponName);

    }
} //public class Main {
