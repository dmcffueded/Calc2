package com.java.calc2;

import java.util.InputMismatchException;

class calculator {

    static int romanToArabic(String string) {
        try {
            if (string.equals("I")) {
                return 1;
            } else if (string.equals("II")) {
                return 2;
            } else if (string.equals("III")) {
                return 3;
            } else if (string.equals("IV")) {
                return 4;
            } else if (string.equals("V")) {
                return 5;
            } else if (string.equals("VI")) {
                return 6;
            } else if (string.equals("VII")) {
                return 7;
            } else if (string.equals("VIII")) {
                return 8;
            } else if (string.equals("IX")) {
                return 9;
            } else if (string.equals("X")) {
                return 10;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Некорректные данные");
        }
        return -1;
    }

    static String arabicToRoman(int number) {
        if (number < 1 || number > 100)
            return "Некорректные данные";
        String s = "";
        while (number >= 100) {
            s += "C";
            number -= 100;
        }
        while (number >= 90) {
            s += "XC";
            number -= 90;
        }
        while (number >= 50) {
            s += "L";
            number -= 50;
        }
        while (number >= 40) {
            s += "XL";
            number -= 40;
        }
        while (number >= 10) {
            s += "X";
            number -= 10;
        }
        while (number >= 9) {
            s += "IX";
            number -= 9;
        }
        while (number >= 5) {
            s += "V";
            number -= 5;
        }
        while (number >= 4) {
            s += "IV";
            number -= 4;
        }
        while (number >= 1) {
            s += "I";
            number -= 1;
        }
        return s;
    }

    static int calculate(int number1, int number2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
        }
        return result;
    }
}