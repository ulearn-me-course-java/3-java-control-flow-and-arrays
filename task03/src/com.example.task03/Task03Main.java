package com.example.task03;

public class Task03Main {
    final static String[] days = new String[]{"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};

    public static void main(String[] args) {
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        return days[weekDaysNumber-1];
    }
}
