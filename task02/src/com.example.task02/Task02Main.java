package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {
        if (1 <= monthNumber && monthNumber < 3 || monthNumber == 12)
            return "зима";
        else if (3 <= monthNumber && monthNumber < 6)
            return "весна";
        else if (6 <= monthNumber && monthNumber < 9)
            return "лето";
        else if (9 <= monthNumber && monthNumber < 12)
            return "осень";
        else
            return "Нет такого месяца";
    }
}