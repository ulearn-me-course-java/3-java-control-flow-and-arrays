package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String days[] = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};

        try { return days[weekDaysNumber - 1]; }
        catch (Exception ex){ return "incorrect day";}
    }
}