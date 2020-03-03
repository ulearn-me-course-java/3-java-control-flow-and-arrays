package com.example.task03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(5));
    }

    static String[] days = new String[]
            {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};

    static String getNameOfWeekDays(int weekDaysNumber) {
        return weekDaysNumber > 7 || weekDaysNumber < 1
                ? "такого дня недели не существует"
                : days[weekDaysNumber - 1];
    }
}