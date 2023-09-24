package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {
        if ((monthNumber > 0 && monthNumber <= 2) || (monthNumber == 12)) {
            return "зима";
        } else if (monthNumber > 2 && monthNumber <= 5) {
            return "весна";
        } else if (monthNumber > 5 && monthNumber <= 8) {
            return "лето";
        }
        return "осень";
    }
}