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
        return 3 <= monthNumber && monthNumber <= 5 ? "весна" :
                6 <= monthNumber && monthNumber <= 8 ? "лето" :
                        9 <= monthNumber && monthNumber <= 11 ? "осень" : "зима";
    }
}