package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {}

    static String getSeason(int monthNumber)
    {
        String[] seasons = {
                "зима", "зима", "весна", "весна", "весна", "лето",
                "лето", "лето", "осень", "осень", "осень", "зима"
        };

        return seasons[monthNumber-1];
    }
}