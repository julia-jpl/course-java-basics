package com.rakovets.course.javabasics.practice.loops;

import java.util.Scanner;

/**
 * Разработать программу для бухгалтерии:
 * Конвертировать чесловую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
 * пробелом. Известно:
 *
 * @param amount сумма
 * @author Dmitry Rakovets
 * @version 1.0
 * @return сумма в бухгалтерском формате
 */
public class Task06 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        long amount = (args.length != 1 ? scanner.nextLong() : Long.parseLong(args[0]));

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int numberDigitals = 0;
        long intermidiateAmount = Math.abs(amount);
        long result = 0;
        do {
            intermidiateAmount = intermidiateAmount / 10;
            numberDigitals += 1;
        } while (intermidiateAmount > 0);
        for (int j = numberDigitals; j >= 1; j--) {
            int powValue = j - 1;
            result = amount / pow(10, powValue);
            if ((j == numberDigitals) || (j % 3 != 0)) {
                System.out.print(result);
            } else {
                System.out.print(" " + result);
            }
             amount = Math.abs(amount) - (Math.abs(result) * pow(10, powValue));
            }
        }

    static long pow (long value, long valuePow) {
        long resultPow = 1;
        int i = 1;
        for (i = 1; i <= valuePow; i++) {
            resultPow = resultPow * value;
        }
        return resultPow;
        }
}