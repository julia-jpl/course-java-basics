package com.rakovets.course.javabasics.practice.methods;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для игрового движка:
 * Необходимо окрасить шкалу HP игрока в соответствующий цвет, в зависимости от процентного соотношения максимального
 * количества HP и текущего.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int currentHealthPoint = INPUT_SCANNER.nextInt();
        int maxHealthPoint = INPUT_SCANNER.nextInt();

        getColorHealthPoint(currentHealthPoint, maxHealthPoint);
    }

    /**
     * Возвращает цвет для шкалы HP игрока, в зависимости от процентного соотношения максимального количества HP и
     * текущего. Когда меньше 25% - красный, меньше 50% - оранжевый, меньше 75% - желтый, меньше либо равно 100 -
     * зеленый.
     *
     * @param currentHealthPoint текущее количество HP игрока
     * @param maxHealthPoint     - максимальное количество HP игрока
     * @return null/'RED'/'ORANGE'/'YELLOW'/'GREEN'
     */
    static String getColorHealthPoint(int currentHealthPoint, int maxHealthPoint) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        double currentPercentage = (double) currentHealthPoint / maxHealthPoint * 100;
        if (currentPercentage < 25 && currentPercentage > 0) {
            return "RED";}
        else if (currentPercentage < 50 && currentPercentage >= 25) {
            return "ORANGE";
        } else if (currentPercentage < 75 && currentPercentage >= 50) {
            return "YELLOW";
        } else if (currentPercentage <= 100 && currentPercentage >=75) {
            return "GREEN";
        } else
            return null;
    }
}