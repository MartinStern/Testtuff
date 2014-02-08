/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststuff;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 *
 * @author MartinStern
 */
public class TestFormatStuff {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        long l = -123456789;
        System.out.format("und hier kommt der Wert von l mit 12 Stellen: %12d%n", l);
        System.out.format("und nun mit 12 Stellen und führenden Nullen : %012d%n", l);
        System.out.println("Sobald die Tausendertrennung aktiv ist, scheinen die führenden Nullen nicht mehr zu funktionieren :-(");
        System.out.format("und nun mit 12 Stellen und führenden Nullen und Tausendertrennung                     : %,012d verwendet Default-Locale%n", l);
        System.out.format(Locale.ENGLISH, "und nun mit 12 Stellen und führenden Nullen und Tausendertrennung mit Locale = ENGLISH: %,012d%n", l);
        System.out.format(Locale.GERMAN, "und nun mit 12 Stellen und führenden Nullen und Tausendertrennung mit Locale = GERMAN : %,012d%n", l);
        System.out.format(new Locale("DE", "CH"), "und nun mit 12 Stellen und führenden Nullen und Tausendertrennung mit Locale = DE_CH  : %,012d%n", l);

        System.out.println("\nUnd nun veruschen wir ein paar Formatierungen mit DecimalFormat aus:");
        String pattern;
        double value;

        value = 123456789.1234;
        pattern = "#.#";
        System.out.println("Pattern: '" + pattern + "', value: '" + value + "' ergibt: " + decFormat(pattern, value));
        pattern = "###.#";
        System.out.println("Pattern: '" + pattern + "', value: '" + value + "' ergibt: " + decFormat(pattern, value));
        pattern = "#,###.###";
        System.out.println("Pattern: '" + pattern + "', value: '" + value + "' ergibt: " + decFormat(pattern, value));

        System.out.println("im Pattern ist an erster Stelle ein unicode representant (u00A4) fuer ein waehrungssysmbol, welcher im folgenden print-outs als \u00A4 dargestellt wird");
        pattern = "\u00A4#.#";
        System.out.println("Pattern: '" + pattern + "', value: '" + value + "' ergibt: " + decFormat(pattern, value));
        pattern = "\u00A4###.#";
        System.out.println("Pattern: '" + pattern + "', value: '" + value + "' ergibt: " + decFormat(pattern, value));
        pattern = "\u00A4#,###.###";
        System.out.println("Pattern: '" + pattern + "', value: '" + value + "' ergibt: " + decFormat(pattern, value));

        value = 1.2;
        System.out.println("Pattern: '" + pattern + "', value: '" + value + "' ergibt: " + decFormat(pattern, value));
        pattern = "#,###.### \u00A4";
        System.out.println("Pattern: '" + pattern + "', value: '" + value + "' ergibt: " + decFormat(pattern, value));
        value = 1231.223456;
        System.out.println("Pattern: '" + pattern + "', value: '" + value + "' ergibt: " + decFormat(pattern, value));

    }

    /**
     *
     * @param pattern
     * @param value
     * @return
     */
    public static String decFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        return myFormatter.format(value);
    }

}
