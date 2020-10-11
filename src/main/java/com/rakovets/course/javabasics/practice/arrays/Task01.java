package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками только по одному предмету
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task01 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int countMarks = INPUT_SCANNER.nextInt();
        int[] marks = nextArray(countMarks);

        // Вызов методов
        getAverageMark(marks);
        getMinMark(marks);
        getMaxMark(marks);
    }

    /**
     * Возвращает средне арифметическую отметку с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int sumMarks = 0;
        double averageMark = 0;
        for (int mark : marks) {
            sumMarks += mark;
        }
        averageMark = (double) sumMarks / marks.length;
        averageMark = (double) Math.round(averageMark * 100) / 100;
        return averageMark;
    }

    /**
     * Возвращает минимальную отметку.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int minMark = marks[0];
        for (int mark : marks) {
            if (minMark >= mark) {
                minMark = mark;
            }
        }
        return minMark;
    }

    /**
     * Возвращает максимальну отметку.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int maxMark = marks[0];
        for (int mark : marks) {
            if (maxMark <= mark) {
                maxMark = mark;
            }
        }
        return maxMark;
    }

    private static int[] nextArray(int countMarks) {
        int[] marks = new int[countMarks];
        for (int i = 0; i < countMarks; i++) {
            marks[i] = INPUT_SCANNER.nextInt();
        }
        return marks;
    }
}