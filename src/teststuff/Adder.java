/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststuff;

import java.text.ParseException;

/**
 *
 * @author MartinStern
 */
public class Adder {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        if (args.length <= 1) {
            System.out.println(" at least 2 args necessary for adding!");
            return;
        }
        int number = 0;
        for (String arg : args) {
            System.out.println("add: " + arg);
            try {
                number += Integer.parseInt(arg);
            } catch (NumberFormatException ex) {
                System.out.println("you are my hero, you tried to add a non numeric: " + arg);
            }
        }
        System.out.println("And the Result is: " + number + "\n");
    }

}
