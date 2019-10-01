package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {
        int m = monthNumber;
        if(m == 12 || m == 1 || m == 2)
            return "зима";
        else if(m >= 3 && m <= 5)
            return "весна";
        else if(m >= 6 && m <= 8)
            return "лето";
        else if(m >= 9 && m <= 11)
            return "осень";
        else
            return null;
    }
}