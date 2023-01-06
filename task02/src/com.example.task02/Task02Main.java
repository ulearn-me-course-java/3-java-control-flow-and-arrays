package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(12));
        System.out.println(getSeason(7));
        System.out.println(getSeason(322));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber > 13 || monthNumber < 1)
            return "Неверное число месяца: " + Integer.toString(monthNumber);
        if (monthNumber >= 3 && monthNumber <= 5)
            return "весна";
        if (monthNumber > 5 && monthNumber <= 8)
            return "лето";
        if (monthNumber > 8 && monthNumber <= 11)
            return "осень";
        else
            return "зима";
    }

}