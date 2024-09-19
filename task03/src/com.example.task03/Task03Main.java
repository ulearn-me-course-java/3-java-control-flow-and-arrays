package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String dayName = "";
        switch (weekDaysNumber) {
            case 1:
                dayName = "понедельник";
                break;
            case 2:
                dayName = "вторник";
                break;
            case 3:
                dayName = "среда";
                break;
            case 4:
                dayName = "четверг";
                break;
            case 5:
                dayName = "пятница";
                break;
            case 6:
                dayName = "суббота";
                break;
            case 7:
                dayName = "воскресенье";
                break;
        }
        return dayName;
    }
}