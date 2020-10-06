package com.rakovets.course.javabasics.practice.methods;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для игрового движка:
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате dd/MM/yyyy. В профиле игрока месяц
 * еобходимо выводить не в числовом формате, а в текстовом. Определить название месяца в зависимости от номера.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task05 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        byte monthNumber = INPUT_SCANNER.nextByte(3);

        getNameMonth(monthNumber);
    }

    /**
     * Возвращает название месяца, в зависимости от его порядкового номера
     *
     * @param monthNumber - номер месяца
     * @return месяц на английском языке (UPPER CASE)
     */
    static String getNameMonth(byte monthNumber) {
        switch (monthNumber) {
            case 0:
                return null;
            case 1:
                return "JANUARY";
                break;
            case 2:
                return "FEBRARY";
                break;
            case 3:
                return "MARCH";
                break;
            case 4:
                return "APRIL";
                break;
            case 5:
                return "MAY";
                break;
            case 6:
                return "JUNE";
                break;
            case 7:
                return "JULY";
                break;
            case 8:
                return "AUGUST";
                break;
            case 9:
                return "SEPTEMBER";
                break;
            case 10:
                return "OCTOBER";
                break;
            case 11:
                return "NOVEMBER";
                break;
            case 12:
                return "DECEMBER";
                break;
        }


    }
}