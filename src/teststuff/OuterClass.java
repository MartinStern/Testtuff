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
public class OuterClass {

    private String x;
    private String y;

    public OuterClass(String x, String y) {
        this.x = x;
        this.y = y;

    }

    public void doSomething() {

    }

    class InnerClass {

        public String xx;
        private String x = "nix da";

        public InnerClass(String xx) {
//            this.xx = OuterClass.this.x + "-" + xx;
            this.xx = x + "-" + xx;  // hier ist das vielleicht nicht gewollt, da x in der OuterClass auch vorkommt
        }

        public String getXx() {
//            return xx + "-" + OuterClass.this.y;
            return xx + "-" + y; // geht auch einfacher :-)
        }
    }

}
