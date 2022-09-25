package com.example.task02;

import java.security.InvalidParameterException;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        if (monthNumber == 1 | monthNumber == 2 | monthNumber == 12) return "зима";
        if (monthNumber == 3 | monthNumber == 4 | monthNumber == 5) return "весна";
        if (monthNumber == 6 | monthNumber == 7 | monthNumber == 8) return "лето";
        if (monthNumber == 9 | monthNumber == 10 | monthNumber == 11) return "осень";
        else throw new InvalidParameterException();
    }
}