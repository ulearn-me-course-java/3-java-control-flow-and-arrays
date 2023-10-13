package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

        System.out.println(getSeason(12));

    }

    static String getSeason(int monthNumber) {
        if(monthNumber<3 || monthNumber == 12){
            return "Winter";
        } else if (monthNumber>=3 && monthNumber<6) {
            return "Spring";
        } else if (monthNumber>=6 && monthNumber<9) {
            return "Summer";
        }else {
            return "Autumm";
        }

    }
}