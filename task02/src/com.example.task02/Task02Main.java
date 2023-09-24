package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(7));
    }

    static String getSeason(int monthNumber) {
        String result = "зима";
        if (monthNumber >= 3 && monthNumber<=5){
            result = "весна";
        }else if (monthNumber >= 6 && monthNumber <=8 ){
            result = "лето";
        } else if (monthNumber >= 9 && monthNumber <= 11){
            result = "осень";
        }
        return result;
    }
}