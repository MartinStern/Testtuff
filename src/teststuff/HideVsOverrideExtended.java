/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststuff;

/**
 *
 * @author MartinStern
 */
public class HideVsOverrideExtended extends HideVsOverrideBase {

    /**
     *
     */
    public static void speekStatic() {
        System.out.println("speekStatic: I am the Extended");
    }

    /**
     *
     */
    public void speek() {
        System.out.println("speek: I am the Extended");
    }

}
