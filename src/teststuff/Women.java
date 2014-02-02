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
public class Women extends Human {

    public Women(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    public boolean hasPossibleMenstruation() {
        if (getAge() > 15) {
            return true;
        } else {
            return false;
        }
    }

}
