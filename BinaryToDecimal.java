/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 3
   Question 5 (BinaryToDecimal.java)
 */

import java.util.*;

public class BinaryToDecimal {
    public static int bin2Dec(String binaryString) {
        int length = binaryString.length();
        int decimal = 0;
        char binaryDigit;

        for (int i=0; i<length; i++) {
            binaryDigit = binaryString.charAt(i);

            if (binaryDigit=='0' || binaryDigit=='1') {
                decimal = 2*decimal+(binaryDigit-'0');
            }
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter binary: ");
        String binaryNumber = s.nextLine();

        System.out.print("Decimal: "+bin2Dec(binaryNumber));
    }
}
