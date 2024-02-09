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
        String[] weekNames = {"понедельник", "вторник", "среда", "четверг", "пятница",
                "суббота", "воскресенье"};
        if (weekDaysNumber >= 1 && weekDaysNumber <= 7){
            return weekNames[weekDaysNumber - 1];
        }
        throw new IllegalArgumentException("weekDaysNumber must be from 1 to 7");
    }
}