package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        System.out.println(getNameOfWeekDays(4));

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        switch(weekDaysNumber){
            case 1:
                return "monday";
            case 2:
                return "tuesday";
            case 3:
                return "wednesday";
            case 4:
                return "thursday";
            case 5:
                return "friday";
            case 6:
                return "saturday";
            case 7:
                return "sunday";
        }
        return "такого дня недели не существует";
    }
}