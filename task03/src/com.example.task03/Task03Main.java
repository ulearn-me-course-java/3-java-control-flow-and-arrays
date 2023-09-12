package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getNameOfWeekDays(7));

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String res;
        switch (weekDaysNumber){
            case 1:
                res = "понедельник";
                break;
            case 2:
                res = "вторник";
                break;
            case 3:
                res = "среда";
                break;
            case 4:
                res = "четверг";
                break;
            case 5:
                res = "пятница";
                break;
            case 6:
                res = "суббота";
                break;
            case 7:
                res = "воскресенье";
                break;
            default:
                res = "такого дня недели не существует";
                break;
        }
        return res;//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}