package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {

        if (3 <= monthNumber && monthNumber <= 5) return "весна";
        else if (6 <= monthNumber && monthNumber <= 8) return "лето";
        else if (9 <= monthNumber && monthNumber <= 11) return "осень";

        return "зима";
    }
}