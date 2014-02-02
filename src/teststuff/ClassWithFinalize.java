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
public class ClassWithFinalize {

    String bla;

    /**
     *
     * @param bla
     */
    public ClassWithFinalize(String bla) {
        this.bla = bla;
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("that's it folks, bye bye ....");
        super.finalize();
    }
}
