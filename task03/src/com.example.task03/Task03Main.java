package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        switch (weekDaysNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "There is no such day of the week";
        }
    }
}