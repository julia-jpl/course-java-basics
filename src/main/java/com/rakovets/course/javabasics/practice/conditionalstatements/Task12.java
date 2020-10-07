package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для сайта посвященного астрологии:
 * Которая выводит знак зодиака и названия года по китайскому календарю, если известно:
 *
 * @param day   - число дня рождения
 * @param month - месяц дня рождения
 * @param year  - год дня рождения
 * @return 'Zodiac Sign: {0}. Chinese Zodiac: {1}', где {0} - знак зодиака, {1} - год зодиака
 */
public class Task12 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int day = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int month = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int year = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        final int YEARSiNcYCLE = 12;
        int codeYear = year % YEARSiNcYCLE;

        String chineseZodiac = getChineseZodiac(codeYear);
        String zodiacSing = getZodiacSing(month, day);
        System.out.println("Zodiac sing: " + zodiacSing + ". Chinese zodiac: " + chineseZodiac);
    }

    static String getChineseZodiac(int codeYear) {

        switch (codeYear) {
            case 1:
                return "Rooster";
            case 2:
                return "Dog";
            case 3:
                return "Pig";
            case 4:
                return "Rat";
            case 5:
                return "Ox";
            case 6:
                return "Tiger";
            case 7:
                return "Rabbit";
            case 8:
                return "Dragon";
            case 9:
                return "Snake";
            case 10:
                return "Horse";
            case 11:
                return "Ram";
            case 0:
                return "Monkey";
        }
        return null;
    }




    static String getZodiacSing(int month, int day) {
        if (month == 1) {
            if (day < 21) {
                return "Sea-Goat";
            } else {
                return "Water-Bearer";
            }
        } else if (month == 2) {
            if (day < 20) {
                return "Water-Bearer";
            } else {
                return "Fishes";
            }
        } else if (month == 3) {
            if (day < 21) {
                return "Fishes";
            } else {
                return "Ram";
            }
        } else if (month == 4) {
            if (day < 21) {
                return "Ram";
            } else {
                return "Bull";
            }
        } else if (month == 5) {
            if (day < 22) {
                return "Bull";
            } else {
                return "Twins";
            }
        } else if (month == 6) {
            if (day < 22) {
                return "Twins";
            } else {
                return "Crab";
            }
        } else if (month == 7) {
            if (day < 23) {
                return "Crab";
            } else {
                return "Lion";
            }
        } else if (month == 8) {
            if (day < 22) {
                return "Lion";
            } else {
                return "Maiden";
            }
        } else if (month == 9) {
            if (day < 24) {
                return "Maiden";
            } else {
                return "Scales";
            }
        } else if (month == 10) {
            if (day < 24) {
                return "Scales";
            } else {
                return "Scorpion";
            }
        } else if (month == 11) {
            if (day < 23) {
                return "Scorpion";
            } else {
                return "Archer";
            }
        } else if (month == 12) {
            if (day < 23) {
                return "Archer";
            } else {
                return "Sea-Goat";
            }
        }
        return null;
    }
    }

