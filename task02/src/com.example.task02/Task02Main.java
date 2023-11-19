package com.example.task02;
public class Task02Main {
    public static void main(String[] args) {

        System.out.println(getSeason(8));

    }

    static String getSeason(int monthNumber) {
        int season = monthNumber % 12;
        if (season < 3){
            return "зима ";
        }else if (season < 6){
            return "весна ";
        }else if (season < 9){
            return "лето ";
        }
        return "осень ";
    }
}