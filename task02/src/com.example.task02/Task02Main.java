package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        return in(monthNumber, 1, 2) || in(monthNumber, 12, 12) ? "зима" :
                in(monthNumber, 3, 5) ? "весна" :
                        in(monthNumber, 6, 8) ? "лето" : "осень";
    }

    static boolean in(int monthNumber, int from, int to){
        return monthNumber >= from && monthNumber <= to;
    }
}