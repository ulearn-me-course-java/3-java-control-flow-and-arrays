package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber>=3 && monthNumber<=5)
            return "Spring";
        else if (monthNumber>=6&&monthNumber<=8)
            return "Summer";
        else if (monthNumber>=9&&monthNumber<=11)
            return "Autumn";
        return "Winter";
    }
}