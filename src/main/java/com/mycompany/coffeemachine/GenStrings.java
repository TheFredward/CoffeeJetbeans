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
    int maxAmntCps;
    /** TODO: Need to create conditionals to determine if I have enough materials
     * WIll use the expected values: waterNeed, milkNeed, cfeBeans and compare
     * to what is "Avail..." in the machine. If there is excess determine how
     * more coffee cups can be made.
     * 
     */
    //next determine what material will limit my MAX amount of coffee
    //values are for one cup of coffee
    int limtedWtr = AvailWtr / waterNeed;
    int limtedMilk = AvailMilk / milkNeed;
    int limtedGrams = AvailGrams / cfeBeans;

    if(limtedWtr >= coffeeCups && limtedMilk >= coffeeCups && AvailGrams >= coffeeCups){

        if(limtedGrams > limtedWtr && limtedWtr < limtedMilk){
            maxAmntCps = limtedWtr - coffeeCups;
            System.out.printf("Yes I can make that amount of coffee! (and even %d more than that.)\n", maxAmntCps);
        }else if(limtedWtr >= limtedMilk && limtedMilk <= limtedGrams){
            maxAmntCps = limtedMilk - coffeeCups;
            System.out.printf("Yes I can make that amount of coffee! (and even %d more than that.)\n", maxAmntCps);
        }else if(limtedWtr >= limtedGrams && limtedGrams <= limtedMilk){
            maxAmntCps = limtedGrams - coffeeCups;
            System.out.printf("Yes I can make that amount of coffee! (and even %d more than that.)\n", maxAmntCps);
        }else if(AvailWtr == waterNeed && AvailMilk == milkNeed && AvailGrams == cfeBeans){
            maxAmntCps = 1;
            System.out.printf("Yes I can make that amount of coffee! (and even %d more than that.)\n", maxAmntCps);
        }else{
            System.out.println("Yes I can make that amount of coffee!");
    }}else if(AvailWtr > waterNeed && AvailMilk > milkNeed && AvailGrams > cfeBeans){
        if(limtedGrams > limtedWtr && limtedWtr < limtedMilk){
            maxAmntCps = limtedWtr;
            System.out.printf("No, I can make only %d cup(s) of coffee", maxAmntCps);
        }else if(limtedWtr > limtedMilk && limtedMilk < limtedGrams){
            maxAmntCps = limtedWtr;
            System.out.printf("No, I can make only %d cup(s) of coffee", maxAmntCps);
        }else if(limtedWtr > limtedGrams && limtedGrams < limtedMilk){
            maxAmntCps = limtedGrams;
            System.out.printf("No, I can make only %d cup(s) of coffee", maxAmntCps);
        
    }}else{
        if(AvailWtr == 0 && AvailMilk == 0 && AvailGrams == 0){
        maxAmntCps = 0;
        System.out.printf("No, I can make only %d cup(s) of coffee", maxAmntCps);
        }else{
            System.out.println("No, I can\'t make that amount of coffee");
        }
        
    }
//    System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n",
//            coffeeStart,grindBns, wtrStart,mxWtrBns,pour,pourMlk,serve);
    }
}
