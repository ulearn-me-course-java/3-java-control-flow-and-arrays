package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        System.out.println(getNameOfWeekDays(9));

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        switch (weekDaysNumber){
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "такого дня недели не существует";
        }
    }

}