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
public class TestInstanceOf {

    public static void main(String[] args) {

        Human thing = new Human("Hans", 11, 11, 11);
        Man peter = new Man("Peter", 12, 45, 150);

        if (peter instanceof Human) {
            System.out.println("peter ist instance of a Human");
        } else {
            System.out.println("peter is not instance of a Human");
        }
        if (peter instanceof Man) {
            System.out.println("peter ist instance of a Man");
        } else {
            System.out.println("peter is not instance of a Man");
        }

        if (thing instanceof Human) {
            System.out.println("thing ist instance of a Human");
        } else {
            System.out.println("thing is not instance of a Human");
        }
        if (thing instanceof Man) {
            System.out.println("thing ist instance of a Man");
        } else {
            System.out.println("thing is not instance of a Man");
        }

    }
}
