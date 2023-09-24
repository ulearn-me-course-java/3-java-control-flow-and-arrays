package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String day;
        switch (weekDaysNumber){
            case 1:
                day = "понедельник";
                break;
            case 2:
                day = "вторник";
                break;
            case 3:
                day = "среда";
                break;
            case 4:
                day = "четверг";
                break;
            case 5:
                day = "пятница";
                break;
            case 6:
                day = "суббота";
                break;
            case 7:
                day = "воскресенье";
                break;
            default:
                day = "такого дня недели не существует";
                break;
        }
        return day;
    }
}