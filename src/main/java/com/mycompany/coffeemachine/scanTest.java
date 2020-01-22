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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int valOne = scanner.nextInt();
//        int rev1 = valOne % 10;
//        int rev2 = (valOne % 100) / 10;
//        int rev3 = (valOne / 10) / 10;
//        System.out.println(rev1);
//        System.out.println(rev2);
//        System.out.println(rev3);
//        int valTwo = scanner.nextInt();
//        int valThree = scanner.nextInt();
//        int valFour = scanner.nextInt();
//        System.out.printf("valFour: %d, valThree: %d, valTwo: %d,valOne: %d\n", valFour,
//                valThree, valTwo, valOne);
        int usrInput;
        while (scanner.hasNextInt()) {
            usrInput = scanner.nextInt();
            if (usrInput % 2 != 0) {
                System.out.println("odd");
            } else if (usrInput == 0) {
                break;
            } else {
                System.out.println("even");
            }
        }
        scanner.close();
    }
}
