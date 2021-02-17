package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int m) {
        return m >= 3 && m <=5 ? "весна" :
                m >=6 && m <= 8 ? "лето" :
                m >=9 && m <= 11 ? "осень" : "зима";
    }
}