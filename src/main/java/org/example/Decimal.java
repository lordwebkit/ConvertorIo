package org.example;
import java.util.Map;
import static java.util.Map.entry;

public class Decimal {
    public static String toBinary(int decimalNumber) {
        String binaryNumber = "";
        while (decimalNumber != 0) {
            binaryNumber = decimalNumber % 2 + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }
    public static String toOctal(int decimalNumber) {
        String octalNumber = "";
        while (decimalNumber != 0) {
            octalNumber = decimalNumber % 8 + octalNumber;
            decimalNumber = decimalNumber / 8;
        }
        return octalNumber;
    }
    public static String toHex(int decimalNumber) {
        String hexNumber = "";
        Map<Integer, String> map = Map.ofEntries(
                entry(10, "a"),
                entry(11, "b"),
                entry(12, "c"),
                entry(13, "d"),
                entry(14, "e"),
                entry(15, "f")
        );
        while (decimalNumber != 0) {
            int rest = decimalNumber % 16;
            if (rest > 9) {
                hexNumber = map.get(rest) + hexNumber;
            } else {
                hexNumber = decimalNumber % 16 + hexNumber;
            }
            decimalNumber = decimalNumber / 16;
        }
        return hexNumber;
    }
}
