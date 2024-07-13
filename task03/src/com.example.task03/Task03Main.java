package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
       
        System.out.println(getNameOfWeekDays(7));
         
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
       String dayName;
        switch (weekDaysNumber)
        {
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверк";
                break;
            case 5:
                dayName = "Пятница";
                break;
            case 6:
                dayName = "Суббота";
                break;
            case 7:
                dayName = "Воскресение";
                break;
            default:
                dayName = "такого дня недели не существует";
        }

        return dayName;
    }
}
