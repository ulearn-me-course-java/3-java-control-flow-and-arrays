package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {
        if(monthNumber%12 == 0 || monthNumber%12 == 1 || monthNumber%12 == 2) return  "зима";
        else if(monthNumber%12 == 3 || monthNumber%12 == 4 || monthNumber%12 == 5) return  "весна";
        else if(monthNumber%12 == 6 || monthNumber%12 == 7 || monthNumber%12 == 8) return  "лето";
        return  "осень";
    }
}