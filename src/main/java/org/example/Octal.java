package org.example;

import java.util.Map;

import static java.util.Map.entry;

public class Octal {
    public static String toBinary(String octalNumber) {
        String binaryNumber = "";
        int decimalNumber = Integer.parseInt(toDecimal(octalNumber));

        while (decimalNumber != 0) {
            binaryNumber = decimalNumber % 2 + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }

        return binaryNumber;
    }
    public static String toDecimal(String octalNumber) {
        int decimalNumber = 0;
        int octal = Integer.parseInt(octalNumber);
        int i = 0;
        while (octal != 0) {
            decimalNumber = (int) (decimalNumber + (octal % 10) * Math.pow(8, i));
            octal = octal / 10;
            i++;
        }
        return Integer.toString(decimalNumber);
    }
    public static String toHex(String octalNumber) {
        String hexNumber = "";
        Map<Integer, String> map = Map.ofEntries(
                entry(10, "a"),
                entry(11, "b"),
                entry(12, "c"),
                entry(13, "d"),
                entry(14, "e"),
                entry(15, "f")
        );
        int decimalNumber = Integer.parseInt(toDecimal(octalNumber));
        while (decimalNumber != 0) {
            int rest = (decimalNumber % 16);
            if (rest > 9) {
                hexNumber = map.get(rest) + hexNumber;
            } else {
                hexNumber = rest + hexNumber;
            }
            decimalNumber = decimalNumber / 16;
        }
        return hexNumber;
    }
}
