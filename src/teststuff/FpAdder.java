/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststuff;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author MartinStern
 */
public class FpAdder {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        if (args.length <= 1) {
            System.out.println(" at least 2 args necessary for adding!");
            return;
        }
        double number = 0.0;
        for (String arg : args) {
            System.out.println("add: " + arg);
            try {
                number += Double.parseDouble(arg);
            } catch (NumberFormatException ex) {
                System.out.println("you are my hero, you tried to add a non numeric: " + arg);
            }
        }
        DecimalFormat myFormatter = new DecimalFormat("#.00");
        System.out.print("And the Result is: " + myFormatter.format(number) + "\n");
        Locale myLoc = Locale.getDefault(); // Speichern der aktuellen Einstellung
        Locale.setDefault(Locale.GERMAN);
        //damit das Setzen der Local auch greift muss der Foormatter neu erstellt werden
        myFormatter = new DecimalFormat("#.00");
        System.out.print("And the Result is: " + myFormatter.format(number) + " aber mit Locale: " + Locale.getDefault() + "\n");
        Locale.setDefault(myLoc); // zurueck auf die normale Defaultlocale
    }

}
