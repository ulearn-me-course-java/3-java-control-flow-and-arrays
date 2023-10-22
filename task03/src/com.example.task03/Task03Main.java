package com.example.task03;

public class Task03Main {
    public static void main(String[] args)
    {

        System.out.println(getNameOfWeekDays(3));
    }

    static String getNameOfWeekDays(int weekDaysNumber)
    {
        switch (weekDaysNumber)
        {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "День недели не существует";
        }
    }
}