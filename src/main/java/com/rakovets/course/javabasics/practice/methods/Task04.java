package com.rakovets.course.javabasics.practice.methods;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для desktop приложения:
 * которая преобразует номер дня недели в его словесный аналог.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task04 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        byte weekdayNumber = INPUT_SCANNER.nextByte();

        getNameWeekday(weekdayNumber);
    }

    /**
     * Возвращает название дня недели, в зависимости от его порядкового номера.
     *
     * @param weekdayNumber - номер дня недели
     * @return день недели на английском языке (UPPER CASE)
     */
    static String getNameWeekday(byte weekdayNumber) {
        switch (weekdayNumber) {
            case 1:
                return "MONDAY";
                break;
            case 2:
                return "TUESDAY";
                break;
            case 3:
                return "WEDNESDAY";
                break;
            case 4:
                return "THURSDAY";
                break;
            case 5:
                return "FRIDAY";
                break;
            case 6:
                return "SATURDAY";
                break;
            case 7:
                return "SUNDAY";
                break;
            default:
                return null;
        }
    }
}