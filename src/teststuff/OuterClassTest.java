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
public class OuterClassTest {

    public static void main(String[] args) {
        OuterClass oc = new OuterClass("A", "B");
        OuterClass.InnerClass ocic1 = oc.new InnerClass("X");

        System.out.println("Wert von xx aus InnerClass1:" + ocic1.getXx());

        OuterClass.InnerClass ocic2 = oc.new InnerClass("smö");
        System.out.println("Wert von xx aus InnerClass2:" + ocic2.getXx());
        System.out.println("Wert von xx aus InnerClass1:" + ocic1.getXx());

    }

}
