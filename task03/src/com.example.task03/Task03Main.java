package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(1));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] daysOfWeek = { "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье" };
        return daysOfWeek[weekDaysNumber - 1].isEmpty() ? "Такого дня недели не существует." : daysOfWeek[weekDaysNumber - 1];
    }
}