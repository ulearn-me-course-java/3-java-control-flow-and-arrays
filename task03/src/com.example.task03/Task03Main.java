package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {

        String[] daysOfTheWeek = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        if(1 <= weekDaysNumber && weekDaysNumber <= 7){
            return daysOfTheWeek[weekDaysNumber - 1];
        }
        return "такого дня недели не существует";
    }
}