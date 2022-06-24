package org.example;

import java.util.Map;

import static java.util.Map.entry;

public class Octal {
    public static String toBinary(int octalNumber) {
        String binaryNumber = "";
        int decimalNumber = toDecimal(octalNumber);

        while (decimalNumber != 0) {
            binaryNumber = decimalNumber % 2 + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }

        return binaryNumber;
    }
    public static int toDecimal(int octalNumber) {
        int decimalNumber = 0;
        int i = 0;
        while (octalNumber != 0) {
            decimalNumber = (int) (decimalNumber + (octalNumber % 10) * Math.pow(8, i));
            octalNumber = octalNumber / 10;
            i++;
        }
        return decimalNumber;
    }
    public static String toHex(int octalNumber) {
        String hexNumber = "";
        Map<Integer, String> map = Map.ofEntries(
                entry(10, "a"),
                entry(11, "b"),
                entry(12, "c"),
                entry(13, "d"),
                entry(14, "e"),
                entry(15, "f")
        );
        int decimalNumber = toDecimal(octalNumber);
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
