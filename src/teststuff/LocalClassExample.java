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
public class LocalClassExample {

    static String regularExpression = "[^0-9]";

    /**
     *
     * @param phoneNumber1
     * @param phoneNumber2
     */
    public static void validatePhoneNumber(
            String phoneNumber1, String phoneNumber2) {

        final int numberLength = 10;

        // Valid in Java SE 8 and later:
        // int numberLength = 10;
        class PhoneNumber {

            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber) {
                int numberLength = 7;
                String currentNumber = phoneNumber.replaceAll(
                        regularExpression, "");
                if (currentNumber.length() == numberLength) {
                    formattedPhoneNumber = currentNumber;
                } else {
                    formattedPhoneNumber = null;
                }
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            // Valid in Java SE 8 and later:
//            public void printOriginalNumbers() {
//                System.out.println("Original numbers are " + phoneNumber1 +
//                    " and " + phoneNumber2);
//            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        // Valid in Java SE 8 and later:
//        myNumber1.printOriginalNumbers();
        if (myNumber1.getNumber() == null) {
            System.out.println("First number is invalid");
        } else {
            System.out.println("First number is " + myNumber1.getNumber());
        }
        if (myNumber2.getNumber() == null) {
            System.out.println("Second number is invalid");
        } else {
            System.out.println("Second number is " + myNumber2.getNumber());
        }

    }

    /**
     *
     * @param args
     */
    public static void main(String... args) {
        validatePhoneNumber("603-555-0123", "555-0123");
    }

}
