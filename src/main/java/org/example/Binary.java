package org.example;
import java.util.Map;
import static java.util.Map.entry;

public class Binary {
    public static String toOctal(String binaryNumber) {
        int decimalNumber = Integer.parseInt(toDecimal(binaryNumber));
        int octalNumber = 0;
        int i = 0;

        while (decimalNumber != 0) {
            octalNumber = (int) (octalNumber + (decimalNumber % 8) * Math.pow(10, i++));
            decimalNumber = decimalNumber / 8;
        }
        return Integer.toString(octalNumber);
    }
    public static String toDecimal(String binaryNumber) {
        int decimalNumber = 0;

        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimalNumber += value * Math.pow(2, i);
        }
        return Integer.toString(decimalNumber);
    }
    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        Map<String, String> map = Map.ofEntries(
                entry("0000", "0"),
                entry("0001", "1"),
                entry("0010", "2"),
                entry("0011", "3"),
                entry("0100", "4"),
                entry("0101", "5"),
                entry("0110", "6"),
                entry("0111", "7"),
                entry("1000", "8"),
                entry("1001", "9"),
                entry("1010", "a"),
                entry("1011", "b"),
                entry("1100", "c"),
                entry("1101", "d"),
                entry("1110", "e"),
                entry("1111", "f")
        );
        if (binaryNumber.length() % 4 != 0) {
            for (int i = 0; i < binaryNumber.length() % 4; i++) {
                binaryNumber = "0" + binaryNumber;
            }
        }
        for (int i = 0; i < binaryNumber.length() / 4; i++) {
            String binaryChar = binaryNumber.substring(i * 4, (i + 1) * 4);
            hexNumber = hexNumber + map.get(binaryChar);
        }
        return hexNumber;
    }
}
