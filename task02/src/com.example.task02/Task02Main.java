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
        if (monthNumber == 12 || (2 >= monthNumber) && monthNumber >= 1) return "зима";
        if (5 >= monthNumber && monthNumber >= 3) return "весна";
        if (8 >= monthNumber && monthNumber >= 6) return "лето";
        if (11 >= monthNumber && monthNumber >= 9) return "осень";
        return "Месяцев всего 12!";
    }
}