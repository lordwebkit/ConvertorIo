package org.example;
import java.util.Map;
import static java.util.Map.entry;

public class Decimal {
    public static String toBinary(String decimalNumber) {
        String binaryNumber = "";
        int decimal = Integer.parseInt(decimalNumber);
        while (decimal != 0) {
            binaryNumber = decimal % 2 + binaryNumber;
            decimal = decimal / 2;
        }
        return binaryNumber;
    }
    public static String toOctal(String decimalNumber) {
        String octalNumber = "";
        int decimal = Integer.parseInt(decimalNumber);
        while (decimal != 0) {
            octalNumber = decimal % 8 + octalNumber;
            decimal = decimal / 8;
        }
        return octalNumber;
    }
    public static String toHex(String decimalNumber) {
        String hexNumber = "";
        int decimal = Integer.parseInt(decimalNumber);
        Map<Integer, String> map = Map.ofEntries(
                entry(10, "a"),
                entry(11, "b"),
                entry(12, "c"),
                entry(13, "d"),
                entry(14, "e"),
                entry(15, "f")
        );
        while (decimal != 0) {
            int rest = decimal % 16;
            if (rest > 9) {
                hexNumber = map.get(rest) + hexNumber;
            } else {
                hexNumber = decimal % 16 + hexNumber;
            }
            decimal = decimal / 16;
        }
        return hexNumber;
    }
}
