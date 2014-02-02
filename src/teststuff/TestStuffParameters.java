/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststuff;

import java.math.BigDecimal;

/**
 *
 * @author MartinStern
 */
public class TestStuffParameters {

    static String myFamilyName;

    public static void main(String[] args) {

        test("BlaBla", 1, 2, 3, 4, 5, 6);
        test("BlöBlö", 1, 2, 3);

        // die Werte von primitiven Argumenten werden nicht veraendert, da dies ein Aufruf "by Value" ergibt
        int i = 10;
        System.out.println("I = " + i);
        testWithPrimitive(i);
        System.out.println("I = " + i);

        // Integer ist zwar kein primitiver Datentyp aber verhaelt sich wie einer
        Integer ii = new Integer(10);
        System.out.println("II = " + ii);
        testWithPrimitive(ii);
        System.out.println("II = " + ii); // ii bleibt hier unveraendert!

        // BigDecimal ist zwar kein primitiver Datentyp aber verhaelt sich wie einer, da der Wert nicht direkt geaendert werden kann
        // muss in der Methode ein neuer BigDecimal erstellt werden (mit der .add() Methode von BigDecimal) und bd hier bleibt unveraendert
        BigDecimal bd = new BigDecimal(10);
        System.out.println("BD = " + bd);
        testWithBigDecimal(bd);
        System.out.println("BD = " + bd); // ii bleibt hier unveraendert!

        // Werte von nicht primitiven Datentypen behalten ihren Inhalt aus der Methode
        StringBuffer sb;
        sb = new StringBuffer("Erster Teil;");
        System.out.println("SB = " + sb.toString());
        testWithNonPrimitive(sb);
        System.out.println("SB = " + sb.toString());

        // String ist zwar kein primitiver Datentyp, aber immer wenn man einen String manipuliert,
        // wird ein neuer String mit dem selben Namen angelegt. Daher wird str in  der Methode dann
        // bei der Manipulation eine neue "lokale" Variable und hier bleibt str unveraendert
        String str = "Erster Teil";
        System.out.println("STR = " + str);
        testWithString(str);
        System.out.println("STR = " + str);

        // Mit Objekt, es wird auch hier byValue uebergeben, aber das value ist die Adresse des Objektes und so wird
        // in der Methode das selbe Objekt verwendet wie hier!
        Man man = new Man("Fritzli", 55, 80, 180);
        man.setName("Peter");
        System.out.println("ojekt 'man': " + man.toString());
        testWithObject1(man);
        System.out.println("ojekt 'man': " + man.toString());

        Man peter = new Man("Peter", 55, 80, 180);
        peter.setName("Peter");

        Man xym = giveMeBackMan(peter);
        System.out.println(xym.getName() + " hat Bartwuchs: " + xym.hasPossibleBeardGrew());
        Human xyh = giveMeBackHuman(peter);
        System.out.println(xyh.getName() + " hat Bartwuchs: " + " weiss nicht"); // xyh.hasPossibleBeardGrew() gibt es nicht bei Class Human

    }

    /**
     *
     * @param irgendwas
     * @param undNochWasNumerisches
     */
    public static void test(String irgendwas, int... undNochWasNumerisches) {
        StringBuilder sb = new StringBuilder();
        sb.append(irgendwas);
        for (int i : undNochWasNumerisches) {
            sb.append("..").append(i);
        }
        System.out.println("Test1:" + sb.toString());

    }

    /**
     *
     * @param myName
     */
    public static void testName1(String myName) {
        //String myName = myName;  // ein lokaler Name darf nicht gleich sein wie ein Name im Parameter
        String notMyName = myName;  // Das geht
    }

    /**
     *
     * @param myFamilyName
     */
    public static void testName2(String myFamilyName) {
        // ein Instanzmane darf gleich sein wie ein Name im Parameter
        TestStuffParameters.myFamilyName = myFamilyName;
    }

    /**
     *
     * @param i
     */
    public static void testWithPrimitive(int i) {
        i += 100;
        System.out.println("i = " + i);
    }

    /**
     * Integer ist natuerlich kein primitiver Datentyp verhaelt sich aber doch wie einer
     *
     * @param ii
     */
    public static void testWithPrimitive(Integer ii) {
        ii += 100;
        System.out.println("ii = " + ii);
    }

    /**
     *
     * @param sb
     */
    public static void testWithNonPrimitive(StringBuffer sb) {
        sb.append(" angefügter Teil");
        System.out.println("sb = " + sb.toString());
    }

    /**
     *
     * @param str
     */
    public static void testWithString(String str) {
        str += " angefügter Teil"; // hierbei wird eine neue Variable mit Name str erzeugt!
        System.out.println("str = " + str);
    }

    /**
     *
     * @param bd
     */
    public static void testWithBigDecimal(BigDecimal bd) {
        //bd += 100;        dies geht nicht
        //bd.add(100);      geht auch nicht

        // dies ergibt keinen Compile Error, aber tut nichts. bd.add()  erzeugt ein neues BigDecimal als Returnwert und das wird hier nicht verwendet!
        bd.add(new BigDecimal(100));
        System.out.println("bd = " + bd);

        bd = bd.add(new BigDecimal(100));    // kompliziert, aber so muss es gemacht werden :-)
        System.out.println("bd = " + bd);
    }

    public static void testWithObject1(Man man) {
        man.setAge(99);
    }

    /**
     * diese Methode reduziert einen Mann auf einen Menschen, so dass er die Information ueber Bartwuchs verliert
     *
     * @param man
     * @return Humnan
     */
    public static Human giveMeBackHuman(Man man) {
        // da Man eine SubKlasse von Human ist kann anstelle eines Objektes vom Typ Human auch ein Objekt vom Typ Man zurueckgegeben werden.
        return man;
    }

    /**
     * lass den Mann ein Mann sein
     *
     * @param man
     * @return Man
     */
    public static Man giveMeBackMan(Man man) {
        return man;
    }

// das geht natuerlich nicht, da das Objekt, welches zurueckgegeben werden soll
// mehr Funktionalitaet beinhalten soll wie das was im return steht
//    public static Man geiveMeBackMan(Human human){
//        return human;
//    }
}
