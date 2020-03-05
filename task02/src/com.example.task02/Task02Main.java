package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(12));
    }

    static String getSeason(int month) {
        return new String[]{"зима", "весна", "лето", "осень"}[month % 12 / 3];
    }
}