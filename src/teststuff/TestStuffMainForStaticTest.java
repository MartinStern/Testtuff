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
public class TestStuffMainForStaticTest {

    public static void main(String[] args) {

        System.out.println("Wieviel Instanzen von TestStaticInit gibt es? Anzahl: " + TestStaticInit.getCounterOfInstances());

        // TestStaticInit test = new TestStaticInit(); das geht so nicht :-) mit Absicht!
        TestStaticInit test = TestStaticInit.getTestStaticInitInstance();
        TestStaticInit test2 = TestStaticInit.getTestStaticInitInstance();

//        assert (1 == 2);
        System.out.println("");
        System.out.println("Wieviel Instanzen von TestStaticInit gibt es? Anzahl: " + TestStaticInit.getCounterOfInstances());

        // man kann die Anzahl Instanzen auch ueber eine Instanz auslesen, was aber kein guter Programmierstil ist
        System.out.println("Wieviel Instanzen von TestStaticInit gibt es? Ausgelesen aus der Instanz test2, Anzahl: " + test2.getCounterOfInstances());

    }

}
