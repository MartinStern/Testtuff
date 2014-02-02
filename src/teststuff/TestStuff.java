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
        int[][] anTowDimIntArray = new int[5][3];
        anTowDimIntArray[0][0] = 1;
        anTowDimIntArray[0][1] = 11;
        anTowDimIntArray[0][2] = 1111;

        System.out.println("anTowDimIntArray has " + anTowDimIntArray.length + " Elements in first Dimension");
        System.out.println("anTowDimIntArray has " + anTowDimIntArray[0].length + " Elements in second Dimension");

        System.out.println("\n\nBeispiel mit unterschiedlich grossen Arrays der zweiten Dimensione");
        int[][] anTowDimIntArray2 = {{1, 2, 3, 4, 5}, {1, 2, 3}};

        System.out.println("anTowDimIntArray2 has " + anTowDimIntArray2.length + " Elements in first Dimension");
        System.out.println("anTowDimIntArray2 has " + anTowDimIntArray2[0].length + " Elements in second Dimension[0]");
        System.out.println("anTowDimIntArray2 has " + anTowDimIntArray2[1].length + " Elements in second Dimension[1]");
    }

}
