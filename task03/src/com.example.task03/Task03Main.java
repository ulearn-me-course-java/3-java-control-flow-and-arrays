package com.example.task03;

import org.omg.CORBA.SystemException;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        try {
            String[] days = {"", "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
            return days[weekDaysNumber];
        }
        catch (SystemException e)
        {
            return "такого дня недели не существует";
        }
    }
}