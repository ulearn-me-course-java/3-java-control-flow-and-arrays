package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(11));
    }

    static String getSeason(int monthNumber) {
        String season;
        if(monthNumber >= 3 && monthNumber <= 5)
                season = "весна";
        else if(monthNumber >= 6 && monthNumber <= 8)
                season = "лето";
        else if(monthNumber >= 9 && monthNumber <= 11)
                season = "осень";
        else
            season = "зима";
        return season;
    }
}