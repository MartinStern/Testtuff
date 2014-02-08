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
public class TestStaticInit {

    /**
     *
     */
    public static final int MAX_INSTANCES = 5;
    //this is a class variable
    private static int counterOfInstances;

    static {
        //and here is the place to initialize static variables (class variables)
        System.out.println("initialize static variables");
        setCounterOfInstances(0);

    }

    /**
     * @return the counterOfInstances
     */
    public static int getCounterOfInstances() {
        return counterOfInstances;
    }

    /**
     * @param aCounterOfInstances the counterOfInstances to set
     */
    public static void setCounterOfInstances(int aCounterOfInstances) {
        counterOfInstances = aCounterOfInstances;
    }

    // private consturctor , so there instances cannot been made outside this class
    private TestStaticInit() {
        counterOfInstances++;
    }

    /**
     *
     * @return
     */
    public static TestStaticInit getTestStaticInitInstance() {
        if (getCounterOfInstances() < MAX_INSTANCES) {
            return new TestStaticInit();
        }
        // das wuerde man natuerlich nicht so machen, man wuerde eine exception werfen :-)
        return null;
    }
}
