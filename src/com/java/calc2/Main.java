// Калькулятор работает одновременно только с натуральными арабскими или римскими числами " +
//                            "в закрытом интервале от 1 до 10 и операциями +, -, * и /

package com.java.calc2;

import java.util.Scanner;

import static com.java.calc2.calculator.calculate;
import static com.java.calc2.calculator.romanToArabic;
import static com.java.calc2.calculator.arabicToRoman;

public class Main {

    public static void main(String[] args) {

        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] blocks = text.split(" ");
        int number1, number2;
        String operation1;
        operation1 = blocks[1];
        char operation = operation1.charAt(0);

        boolean flag = false;

        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(blocks[0]) || roman[i].equals(blocks[2])) {
                flag = true;
            }
        }

            if (flag) {
                number1 = romanToArabic(blocks[0]);
                number2 = romanToArabic(blocks[2]);
                if ((number1 < 1) | (number1 > 10) | (number2 < 1) | (number2 > 10)){
                    System.out.println("Некорректные данные");
                    return;
                }
                System.out.println(arabicToRoman(calculate(number1, number2, operation)));

            } else {
                number1 = Integer.parseInt(blocks[0]);
                number2 = Integer.parseInt(blocks[2]);
                if ((number1 < 1) | (number1 > 10) | (number2 < 1) | (number2 > 10)){
                    System.out.println("Некорректные данные");
                    return;
                }
                System.out.println(calculate(number1, number2, operation));
            }
    }
}