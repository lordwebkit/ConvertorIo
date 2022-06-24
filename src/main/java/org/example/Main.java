package org.example;

import java.util.Scanner;

public class Main {
    public static String from = "";
    public static String to = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Из какой системы счисления? (Двоичная, Восьмиричная, Десятичная, Шеснадцатиричная)");
        from = sc.next();

        if (from.equals("Двоичная")) {
            System.out.println("Вы выбрали Двоичную система счисления");
            System.out.println("В какую систему счисления? (Восьмиричная, Десятичная, Шеснадцатиричная)");
            to = sc.next();
            if (to.equals("Восьмиричная")) {
                System.out.println("Введите число для перевода из Двоичной системы счисления");
                System.out.println(Binary.toOctal(sc.next()));
            } else if (to.equals("Десятичная")) {
                System.out.println("Введите число для перевода из Двоичной системы счисления");
                System.out.println(Binary.toDecimal(sc.next()));
            } else if (to.equals("Шеснадцатиричная")) {
                System.out.println("Введите число для перевода из Двоичной системы счисления");
                System.out.println(Binary.toHex(sc.next()));
            }
        } else if (from.equals("Восьмиричная")) {
            System.out.println("Вы выбрали Восьмиричную система счисления");
            System.out.println("В какую систему счисления? (Двоичная, Десятичная, Шеснадцатиричная)");
            to = sc.next();
            if (to.equals("Двоичная")) {
                System.out.println("Введите число для перевода из Восьмиричной системы счисления");
                System.out.println(Octal.toBinary(sc.next()));
            } else if (to.equals("Десятичная")) {
                System.out.println("Введите число для перевода из Восьмиричной системы счисления");
                System.out.println(Octal.toDecimal(sc.next()));
            } else if (to.equals("Шеснадцатиричная")) {
                System.out.println("Введите число для перевода из Восьмиричной системы счисления");
                System.out.println(Octal.toHex(sc.next()));
            }
        } else if (from.equals("Десятичная")) {
            System.out.println("Вы выбрали Десятичную систему счисления");
            System.out.println("В какую систему счисления? (Двоичная, Восьмиричная, Шеснадцатиричная)");
            to = sc.next();
            if (to.equals("Двоичная")) {
                System.out.println("Введите число для перевода из Десятичной системы счисления");
                System.out.println(Decimal.toBinary(sc.next()));
            } else if (to.equals("Восьмиричная")) {
                System.out.println("Введите число для перевода из Десятичной системы счисления");
                System.out.println(Decimal.toOctal(sc.next()));
            } else if (to.equals("Шеснадцатиричная")) {
                System.out.println("Введите число для перевода из Десятичной системы счисления");
                System.out.println(Decimal.toHex(sc.next()));
            }
        } else if (from.equals("Шеснадцатиричная")) {
            System.out.println("Вы выбрали Шеснадцатиричную систему счисления");
            System.out.println("В какую систему счисления? (Двоичная, Восьмиричная, Десятичная)");
            to = sc.next();
            if (to.equals("Двоичная")) {
                System.out.println("Введите число для перевода из Шеснадцатиричной системы счисления");
                System.out.println(Hex.toBinary(sc.next()));
            } else if (to.equals("Восьмиричная")) {
                System.out.println("Введите число для перевода из Шеснадцатиричной системы счисления");
                System.out.println(Hex.toOctal(sc.next()));
            } else if (to.equals("Десятичная")) {
                System.out.println("Введите число для перевода из Шеснадцатиричной системы счисления");
                System.out.println(Hex.toDecimal(sc.next()));
            }
        } else {
            System.out.println("Возможно вы выбрали не существующую систему счисления попробуйте снова");
        }
    }
}