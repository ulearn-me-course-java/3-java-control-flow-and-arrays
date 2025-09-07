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
         if (monthNumber >= 1 && monthNumber <= 2) {
            return "Зима";
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            return "Весна";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "Лето";
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            return "Осень";
        }
        return "Зима";

    }
}

