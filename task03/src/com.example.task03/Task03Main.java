package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] day = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};

        if (weekDaysNumber >= 1 && weekDaysNumber <= 7) return day[weekDaysNumber - 1];
        else return "такого дня недели не существует";
    }
}