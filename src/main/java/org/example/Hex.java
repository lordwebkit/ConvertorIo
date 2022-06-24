package org.example;

import java.util.Map;
import static java.util.Map.entry;

public class Hex {
    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        int decimalNumber = toDecimal(hexNumber);

        while (decimalNumber != 0) {
            binaryNumber = decimalNumber % 2 + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }
    public static String toOctal(String hexNumber) {
        String octalNumber = "";
        int decimalNumber = toDecimal(hexNumber);

        while (decimalNumber != 0) {
            octalNumber = decimalNumber % 8 + octalNumber;
            decimalNumber = decimalNumber / 8;
        }
        return octalNumber;
    }
    public static int toDecimal(String hexNumber) {
        int decimalNumber = 0;
        Map<Integer, String> map = Map.ofEntries(
                entry(10, "a"),
                entry(11, "b"),
                entry(12, "c"),
                entry(13, "d"),
                entry(14, "e"),
                entry(15, "f")
        );
        for (int i = 0; i < hexNumber.length(); i++) {
            int index = hexNumber.length() - 1 - i;
            int value = Character.getNumericValue(hexNumber.charAt(index));
            decimalNumber = (int) (decimalNumber + value * Math.pow(16, i));
        }

        return decimalNumber;
    }
}
