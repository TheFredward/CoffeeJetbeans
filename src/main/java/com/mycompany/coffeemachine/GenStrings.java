/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coffeemachine;

import java.util.Scanner;

/**
 *
 * @author fvent
 */
public class GenStrings {
    public static void main(String[] args){
    //initialized string values
    String coffeeStart = "Starting to make a coffee";
    String grindBns = "Grinding coffee beans";
    String wtrStart = "Boiling water";
    String mxWtrBns = "Mixing boiled water with crushed coffee beans";
    String pour = "Pouring coffee into the cup";
    String pourMlk = "Pouring some milk into the cup";
    String serve = "Coffee is ready!";
    String cupsNeed = "Write how many cups of coffee you will need: ";
    String machineWater = "Write how many ml of water the coffee machine has: ";
    String machineMilk = "Write how many ml of milk the coffee machine has: ";
    String machineGrams = "Write how many grams of coffee beans the coffee machine has: ";
    //    Create a the scan variable to get user input
    Scanner scan = new Scanner(System.in);
    System.out.print(machineWater);
    int AvailWtr = scan.nextInt();
    System.out.print(machineMilk);
    int AvailMilk = scan.nextInt();
    System.out.print(machineGrams);
    int AvailGrams = scan.nextInt();
    System.out.print(cupsNeed);
    int coffeeCups = scan.nextInt();
    /*One cup of coffee made on this coffee machine contains 200 ml of water, 
     *50 ml of milk, and 15 g of coffee beans. Bare MINIMUM needed to make coffee
    */
    // Values of water, milk are in mL and beans are in g
    int waterNeed = 200;
    int milkNeed = 50;
    int cfeBeans = 15;
    int wtrPrCp = waterNeed * coffeeCups;
    int milkPrCp = milkNeed * coffeeCups;
    int bnsPrCp = cfeBeans * coffeeCups;
    AvailWtr = AvailWtr * coffeeCups;
    AvailMilk = AvailMilk * coffeeCups;
    AvailGrams = AvailGrams * coffeeCups;
    /** TODO: Need to create conditionals to determine if I have enough materials
     * WIll use the expected values: waterNeed, milkNeed, cfeBeans and compare
     * to what is "Avail..." in the machine. If there is excess determine how
     * more coffee cups can be made.
     */
    if(AvailWtr >= wtrPrCp && AvailMilk >= milkPrCp && AvailGrams >= bnsPrCp){
        System.out.println("Yes I can make that amount of coffee");
        //next determine what material will limit my MAX amount of coffee
        if(){
            
        }
    }else{
        System.out.println("No, I can\'t make that amount of coffee");
    }
    System.out.printf("For %d cups of coffee you will need: \n", coffeeCups);
    System.out.printf("%d ml of water \n",waterNeed);
    System.out.printf("%d ml of milk \n",milkNeed);
    System.out.printf("%d g of coffee beans \n",cfeBeans);
    System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n",
            coffeeStart,grindBns, wtrStart,mxWtrBns,pour,pourMlk,serve);
    }
}
