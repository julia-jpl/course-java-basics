package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * Необходимо определить, какие символы вводит пользователь:
 * - латиници
 * - кирилица
 * - цифра
 * - спец. символ
 * Так же программа не должна зависеть от регистра. Известно:
 *
 * @param letter - символ введенный пользователем
 * @return 'latin'/'cyrillic'/'digit'/'undefined'
 * <p>
 * Help: Unicode (decimal)
 */

public class Task11 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        char letter = (args.length != 1) ? scanner.next().charAt(0) : args[0].charAt(0);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        long unicodLetter = letter;
        if (unicodLetter >= 48 && unicodLetter <= 57) {
            System.out.println("digit");
        } else if (unicodLetter >= 1024 && unicodLetter <= 1274) {
            System.out.println("cyrillic");
        } else if ((unicodLetter >= 65 && unicodLetter <= 90) || (unicodLetter >= 97 && unicodLetter <= 122)) {
            System.out.println("latin");
        } else if (unicodLetter < 47 || (unicodLetter >= 58 && unicodLetter <= 64) || (unicodLetter >= 91 && unicodLetter <= 96) || (unicodLetter >= 123 && unicodLetter <= 191)) {
            System.out.println("undefined");
        }

    }
}