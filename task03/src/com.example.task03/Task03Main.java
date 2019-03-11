package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] days = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};

        if ((weekDaysNumber > 0) && (weekDaysNumber < 8))
            return days[weekDaysNumber-1];
        else
            return "такого дня недели не существует";
    }
}