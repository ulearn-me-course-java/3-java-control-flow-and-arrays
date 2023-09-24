package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(13));
    }

    static String getSeason(int monthNumber) {

        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2)
            return "Winter";
        if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5)
            return "Spring";
        if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8)
            return "Summer";
        if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11)
            return "Autumn";
        return null;
    }
}