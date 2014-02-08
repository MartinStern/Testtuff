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
public class TestWithFinalize {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ClassWithFinalize cwf = new ClassWithFinalize("smörebröd");
        System.out.println("SimpleName: " + cwf.getClass().getSimpleName());
        System.out.println("Name: " + cwf.getClass().getName());
        cwf = null;

        while (true) {
            try {
                System.out.println("grrr.....");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TestWithFinalize.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
