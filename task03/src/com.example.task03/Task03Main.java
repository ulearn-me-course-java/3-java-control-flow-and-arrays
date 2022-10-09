package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getNameOfWeekDays(7));

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] day = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        if (weekDaysNumber > 7 || weekDaysNumber < 1)
            return "такого дня недели не существует";
        else
            return day[weekDaysNumber - 1];

        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}