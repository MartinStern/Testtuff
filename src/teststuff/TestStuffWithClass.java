/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststuff;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MartinStern
 */
public class TestStuffWithClass {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Human p1 = new Human("Joe", 56, 80, 182);
        Human p2 = new Human("Maya", 51, 62, 171);
        Human p3 = p2;  // das macht ja nun nicht wirklich etwas sinnvolles, da nun das selbe Objekt ueber 2 Namen ansprechbar ist.
        Human p4 = null;
        try {
            p4 = p2.clone();
        } catch (CloneNotSupportedException ex) {
            p4 = new Human("dummy", 0, 0, 0);
            Logger.getLogger(TestStuffWithClass.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Hash of p1: " + p1.hashCode());
        System.out.println("Der Haswert von p2 und p3 ist der selbe, da es sich ja auch um das selbe Objekt handelt!");
        System.out.println("Hash of p2: " + p2.hashCode());
        System.out.println("Hash of p3: " + p3.hashCode());
        System.out.println("obwohl es sich bei p4 um einen Clone von p2 handelt, sind die Hashcodes unterschiedlich:");
        System.out.println("Hash of p2: " + p2.hashCode());
        System.out.println("Hash of p4: " + p4.hashCode());
    }
}
