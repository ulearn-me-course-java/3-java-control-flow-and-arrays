package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] weekDays = new String[] {"воскресенье","понедельник","вторник","среда","четверг","пятница","суббота"};
        if (weekDaysNumber > 7 || weekDaysNumber < 1)
            return "такого дня недели не существует";
        else
            return weekDays[weekDaysNumber%7];
    }
}