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
public class TestWithMath {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        double value;
        value = 123.33;
        System.out.println("The ceiling of " + value + " is: " + Math.ceil(value));
        value = -123.33;
        System.out.println("The ceiling of " + value + " is: " + Math.ceil(value));
        value = 123.33;
        System.out.println("The floor of " + value + " is: " + Math.floor(value));
        value = -123.33;
        System.out.println("The floor of " + value + " is: " + Math.floor(value));
    }
}
