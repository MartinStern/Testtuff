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
public class TestSuffWithString {

    static String testString = "0123456789";

    /**
     *
     * @param agrs
     */
    public static void main(String[] agrs) {

        System.out.println("von Position 3 bis 4 ist: " + testString.substring(3, 4) + " wie man sieht fehlt eine Stelle, weil die bis-position nicht erfasst wird, sondern eine Stelle davor!");

        String csvString = "ich;bin;ein;mehrteiliger;text";
        String[] teilString = csvString.split(";");
        System.out.println("der String hat " + teilString.length + " Teile");
        for (String ts : teilString) {
            System.out.println(ts);
        }
    }
}
