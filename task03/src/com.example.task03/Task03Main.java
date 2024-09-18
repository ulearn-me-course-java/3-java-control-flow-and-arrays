package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {}

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] weekDays = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        if (weekDaysNumber > 7 || weekDaysNumber < 1)
            return "такого дня недели не существует";
        return weekDays[weekDaysNumber-1];
    }
}