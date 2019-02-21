package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
    }

    static String getSeason(int monthNumber) {
        String[] season = {"зима", "весна", "лето", "осень"};
        return season[monthNumber % 12 / 3];
    }
}