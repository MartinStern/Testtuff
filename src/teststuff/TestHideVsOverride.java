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
public class TestHideVsOverride {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        HideVsOverrideBase ob = new HideVsOverrideBase();
        HideVsOverrideExtended oe = new HideVsOverrideExtended();

        System.out.println("\nTest with the Base:");
        ob.speekStatic();
        ob.speek();

        System.out.println("\nTest with the Extended:");
        oe.speekStatic();
        oe.speek();

        System.out.println("\nTest with the Extended reduced to Base:");
        HideVsOverrideBase obe = new HideVsOverrideExtended();
        obe.speekStatic();  // obe.speekStatic() entspricht eigentlich HideVsOverrideBase.speekStatic(), was auch der bessere Codestil ist.
        obe.speek();

    }

}
