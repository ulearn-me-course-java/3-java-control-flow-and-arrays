package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

    }

    static String getSeason(int monthNumber) {
        String[] seasons = {"зима", "весна", "лето", "осень"};
        return seasons[monthNumber/3%4];
    }
}