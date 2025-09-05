package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] weekDays = {
                "понедельник",
                "вторник",
                "среда",
                "четверг",
                "пятница",
                "суббота",
                "воскресенье"
        };
        if (weekDaysNumber >= 1 && weekDaysNumber <= 7) return weekDays[weekDaysNumber - 1];
        return "Такого дня недели не существует:)";
    }
}