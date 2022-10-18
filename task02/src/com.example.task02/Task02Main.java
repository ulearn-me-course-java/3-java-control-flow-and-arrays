package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        switch (monthNumber) {

            case 1:
            case 2:
            case 12:
                return "Зима";
            case 3:
            case 4:
            case 5:
                return "Весна";
            case 6:
            case 7:
            case 9:
                return "Лето";
            case 10:
            case 11:
                return "Осень";
            default:
                return "Ощибка";
        }
    }
}