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
public class TestStuff {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        System.out.println("Beispiel mit 'gleichförmigen' Dimensionen");
        int[][] twoDimIntArray = new int[5][3];
        twoDimIntArray[0][0] = 1;
        twoDimIntArray[0][1] = 11;
        twoDimIntArray[0][2] = 1111;

        System.out.println("twoDimIntArray has " + twoDimIntArray.length + " Elements in first Dimension");
        System.out.println("twoDimIntArray has " + twoDimIntArray[0].length + " Elements in second Dimension");

        System.out.println("\n\nBeispiel mit unterschiedlich grossen Arrays der zweiten Dimensione");
        int[][] twoDimIntArray2 = {{1, 2, 3, 4, 5}, {1, 2, 3}};

        System.out.println("twoDimIntArray2 has " + twoDimIntArray2.length + " Elements in first Dimension");
        System.out.println("twoDimIntArray2 has " + twoDimIntArray2[0].length + " Elements in second Dimension[0]");
        System.out.println("twoDimIntArray2 has " + twoDimIntArray2[1].length + " Elements in second Dimension[1]");
    }

}
