/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststuff;

import java.util.Locale;

/**
 *
 * @author MartinStern
 */
public class TestFormatStuff {

    public static void main(String[] args) {
        long l = -123456789;
        System.out.format("und hier kommt der Wert von l mit 12 Stellen: %12d%n", l);
        System.out.format("und nun mit 12 Stellen und führenden Nullen : %012d%n", l);
        System.out.println("Sobald die Tausendertrennung aktiv ist, scheinen die führenden Nullen nicht mehr zu funktioneiren :-(");
        System.out.format("und nun mit 12 Stellen und führenden Nullen und Tausendertrennung                     : %,012d verwendet Default-Locale%n", l);
        System.out.format(Locale.ENGLISH, "und nun mit 12 Stellen und führenden Nullen und Tausendertrennung mit Locale = ENGLISH: %,012d%n", l);
        System.out.format(Locale.GERMAN, "und nun mit 12 Stellen und führenden Nullen und Tausendertrennung mit Locale = GERMAN : %,012d%n", l);
        System.out.format(new Locale("DE", "CH"), "und nun mit 12 Stellen und führenden Nullen und Tausendertrennung mit Locale = DE_CH  : %,012d%n", l);
    }

}
