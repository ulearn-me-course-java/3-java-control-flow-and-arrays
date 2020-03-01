package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        System.out.println(getNameOfWeekDays(2));

    }

    static String getNameOfWeekDays(int weekDaysNumber) {

        if (weekDaysNumber < 1 || weekDaysNumber > 7)
            return "такого дня недели не существует";

        switch (weekDaysNumber) {
            case (1):
                return "понедельник";
            case (2):
                return "вторник";
            case (3):
                return "среда";
            case (4):
                return "четверг";
            case (5):
                return "пятница";
            case (6):
                return "суббота";
            case (7):
                return "воскресенье";

        }
        return "такого дня недели не существует";
    }
}