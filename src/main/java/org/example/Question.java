package org.example;

import java.util.Scanner;

public class Question {
    public static void questionFrom(String numberSys) {
        System.out.println("Вы выбрали " + numberSys + " систему счисления");
        System.out.println("В какую систему счисления? (Двоичная, Восьмиричная, Десятичная, Шеснадцатиричная)");
    }
    public static void questionTo(String numberSys) {
        System.out.println("Введите число для перевода из " + numberSys + " системы счисления");
    }
    public static void initQuestion() {
        Scanner sc = new Scanner(System.in);
        String result;
        System.out.println("Из какой системы счисления? (Двоичная, Восьмиричная, Десятичная, Шеснадцатиричная)");

        switch (sc.next().toLowerCase()) {
            case "двоичная":
                questionFrom("Двоичную");
                switch (sc.next().toLowerCase()) {
                    case "двоичная":
                        System.out.println("Это не имеет смысла попробуйте снова?");
                        initQuestion();
                        break;
                    case "восьмиричная":
                        questionTo("Двоичной");
                        result = Binary.toOctal(sc.next());
                        System.out.println("Результат перевода: " + result);
                        break;
                    case "десятичная":
                        questionTo("Двоичной");
                        result = Binary.toDecimal(sc.next());
                        System.out.println("Результат перевода: " + result);
                        break;
                    case "шеснадцатиричная":
                        questionTo("Двоичной");
                        result = Binary.toHex(sc.next());
                        System.out.println("Результат перевода: " + result);
                        break;
                }
                break;
            case "восьмиричная":
                questionFrom("Восьмиричную");
                switch (sc.next().toLowerCase()) {
                    case "двоичная":
                        questionTo("Восьмиричной");
                        result = Octal.toBinary(sc.next());
                        System.out.println("Результат перевода: " + result);
                        break;
                    case "восьмиричная":
                        System.out.println("Это не имеет смысла попробуйте снова?");
                        initQuestion();
                        break;
                    case "десятичная":
                        questionTo("Восьмиричной");
                        result = Octal.toDecimal(sc.next());
                        System.out.println("Результат перевода: " + result);
                        break;
                    case "шеснадцатиричная":
                        questionTo("Восьмиричной");
                        result = Octal.toHex(sc.next());
                        System.out.println("Результат перевода: " + result);
                        break;
                }
                break;
            case "десятичная":
                questionFrom("Десятичную");
                switch (sc.next().toLowerCase()) {
                    case "двоичная":
                        questionTo("Десятичной");
                        result = Decimal.toBinary(sc.next());
                        System.out.println("Результат перевода: " + result);
                        break;
                    case "восьмиричная":
                        questionTo("Десятичной");
                        result = Decimal.toOctal(sc.next());
                        System.out.println("Результат перевода: " + result);
                        break;
                    case "десятичная":
                        System.out.println("Это не имеет смысла попробуйте снова?");
                        initQuestion();
                        break;
                    case "шеснадцатиричная":
                        questionTo("Десятичной");
                        result = Decimal.toHex(sc.next());
                        System.out.println("Результат перевода: " + result);
                        break;
                }
                break;
            case "шеснадцатиричная":
                questionFrom("Шеснадцатиричную");
                switch (sc.next().toLowerCase()) {
                    case "двоичная":
                        questionTo("Шеснадцатиричной");
                        result = Hex.toBinary(sc.next());
                        System.out.println("Результат перевода: " + result);
                        break;
                    case "восьмиричная":
                        questionTo("Шеснадцатиричной");
                        result = Hex.toOctal(sc.next());
                        System.out.println("Результат перевода: " + result);
                        break;
                    case "десятичная":
                        questionTo("Шеснадцатиричной");
                        result = Hex.toDecimal(sc.next());
                        System.out.println("Результат перевода: " + result);
                        break;
                    case "шеснадцатиричная":
                        System.out.println("Это не имеет смысла попробуйте снова?");
                        initQuestion();
                        break;
                }
                break;
            default:
                System.out.println("Возможно вы выбрали не существующую систему счисления попробуйте снова");
                initQuestion();
                break;
        }
    }
}
