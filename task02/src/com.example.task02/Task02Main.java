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
        String season;

        if (3 <= monthNumber && monthNumber <= 5) {
            season = "весна";
        } else if (6 <= monthNumber && monthNumber <= 8) {
            season = "лето";
        } else if (9 <= monthNumber && monthNumber <= 11) {
            season = "осень";
        } else {
            season = "зима";
        }

        return season;
    }
}