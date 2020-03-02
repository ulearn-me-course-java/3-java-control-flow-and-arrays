package com.example.task03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(5));
    }

    static final SimpleDateFormat format = new SimpleDateFormat("EEEE");

    static String getNameOfWeekDays(int weekDaysNumber) {
        if(weekDaysNumber > 7 || weekDaysNumber < 1){
            return "такого дня недели не существует";
        }
        Date d = new Date(86400000 * weekDaysNumber + 86400000 * 3);
        return format.format(d);
    }
}