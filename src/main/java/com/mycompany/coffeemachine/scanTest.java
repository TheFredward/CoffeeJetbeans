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
public class scanTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valOne = scanner.nextInt();
        int valTwo = scanner.nextInt();
        int valThree = scanner.nextInt();
        int valFour = scanner.nextInt();
        System.out.printf("valFour: %d, valThree: %d, valTwo: %d,valOne: %d\n", valFour,
                valThree, valTwo, valOne);
    }
}
