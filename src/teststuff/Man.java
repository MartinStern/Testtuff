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
public class Man extends Human {

    /**
     *
     * @param name
     * @param age
     * @param weight
     * @param height
     */
    public Man(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    /**
     *
     * @return
     */
    public boolean hasPossibleBeardGrew() {
        if (getAge() > 15) {
            return true;
        } else {
            return false;
        }
    }

}
